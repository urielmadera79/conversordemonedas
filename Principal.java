import modelos.ConversorDeMonedas;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {


        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        Double cantidadAConvertir;
        Double conversion;
        String monedaOrigen = "";
        String monedaDestino = "";
        ConversorDeMonedas convertidor =new ConversorDeMonedas();
        do {
            System.out.println("********************************************************");
            System.out.println("Bienvenidos al Sistema de Conversiones de Monedas");
            System.out.println("1) Dólar =>> Peso Argentino");
            System.out.println("2) Peso Argentino =>> Dólar");
            System.out.println("3) Dólar =>> Real Brasileño");
            System.out.println("4) Real Brasileño =>> Dólar");
            System.out.println("5) Dólar =>> Peso Colombiano");
            System.out.println("6) Peso Colombiano =>> Dólar");
            System.out.println("7) Convertir otras divisas...");
            System.out.println("8) Salir");
            System.out.println("********************************************************");
            System.out.println("Introduzca la opción deseada: ");

            try {
                opcion = Integer.parseInt(teclado.next());
            } catch (NumberFormatException e) {
                System.out.println("Error al capturar su opción deseada. " + e.getMessage());
            }
            if (opcion >=1 && opcion <=7){
                switch (opcion){
                    case 1:
                        monedaOrigen="USD";
                        monedaDestino="ARS";
                        break;
                    case 2:
                        monedaOrigen="ARS";
                        monedaDestino="USD";
                        break;
                    case 3:
                        monedaOrigen="USD";
                        monedaDestino="BRL";
                        break;
                    case 4:
                        monedaOrigen="BRL";
                        monedaDestino="USD";
                        break;
                    case 5:
                        monedaOrigen="USD";
                        monedaDestino="COP";
                        break;
                    case 6:
                        monedaOrigen="COP";
                        monedaDestino="USD";
                        break;
                    case 7:
                        System.out.println("Debe teclar el código de tres caracteres asignado a las");
                        System.out.println("monedas con las desea realizar la conversión...\n");
                        System.out.println("Por ejemplo: Dólar Estadounidense use el código \"USD\" \n");
                        System.out.println("Código de moneda origen (base): ");
                        monedaOrigen = teclado.next();
                        System.out.println("Código de la moneda destino: ");
                        monedaDestino = teclado.next();
                }
                System.out.println("Convirtiendo:" + monedaOrigen+ "-->" + monedaDestino);
                System.out.println("Cantidad a convertir: ");
                cantidadAConvertir = Double.valueOf(teclado.next());

                conversion = convertidor.convertir(cantidadAConvertir,monedaOrigen,monedaDestino);
                System.out.println(cantidadAConvertir + " " + monedaOrigen + " equivalen a: "
                        + conversion + " " + monedaDestino);
            } else if (opcion ==8){
                System.out.println("Finalizando el programa.");
            }
        }while (opcion != 8);
    }
}
