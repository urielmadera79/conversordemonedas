package modelos;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;

public class ConversorDeMonedas {


    public Double convertir(Double cantidad,
                            String monedaOrigen,
                            String monedaDestino) throws IOException, InterruptedException {
        Double conversion;
        String direccion ="https://v6.exchangerate-api.com/v6/aa2974c04109d277efa4e8ca/latest/"+ monedaOrigen;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String jsonData = response.body();
        //System.out.println(jsonData);
        Gson gson = new Gson();
        MonedasXAPI resultadoMonedas = gson.fromJson(jsonData, MonedasXAPI.class);

        HashMap<String, Moneda> listadoMonedas = new HashMap<>();

        for (Map.Entry<String, Double> elemento : resultadoMonedas.getConversion_rates().entrySet()){
            String codigo = elemento.getKey();
            double tasa = elemento.getValue();
            listadoMonedas.put(codigo,new Moneda(codigo,tasa));
        }
        if (resultadoMonedas.getResult().equals("success")){
//            System.out.println("Moneda origen: " + monedaOrigen);
//            System.out.println("Moneda destino: " +monedaDestino);
            Moneda monedaAConvertir = listadoMonedas.get(monedaDestino);
//            System.out.println("resultado = " + monedaAConvertir);
//            System.out.println("La moneda: " + monedaAConvertir.codigo());
//            System.out.println("Tiene una tasa de:" + monedaAConvertir.tasa());
//            System.out.println(monedaAConvertir);
            conversion = cantidad * monedaAConvertir.tasa();
        }else {
            System.out.println("ERROR: No se han obtenido las tasas de conversión.");
            return (double) 0;
        }
        return conversion;
    }
}
