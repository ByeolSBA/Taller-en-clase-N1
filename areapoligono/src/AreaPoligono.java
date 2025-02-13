public class AreaPoligono {
    public static double calcularArea(String tipo, double... medidas) {
        if (tipo.equalsIgnoreCase("triangulo") && medidas.length == 2) {
            return (medidas[0] * medidas[1]) / 2;
        } else if (tipo.equalsIgnoreCase("cuadrado") && medidas.length == 1) {
            return medidas[0] * medidas[0];
        } else if (tipo.equalsIgnoreCase("rectangulo") && medidas.length == 2) {
            return medidas[0] * medidas[1];
        } else {
            System.out.println("Polígono no soportado o parámetros incorrectos.");
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println("El área del triángulo es: " + calcularArea("triangulo", 5.0, 5.0));
        System.out.println("El área del rectángulo es: " + calcularArea("rectangulo", 5.0, 3.0));
        System.out.println("El área del cuadrado es: " + calcularArea("cuadrado", 4.0));
    }
}
