package modelos;

public record Moneda(String codigo, double tasa) {
    @Override
    public String toString() {
        return codigo + ':' + tasa;
    }
}
