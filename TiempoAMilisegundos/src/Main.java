public class Main {
    public static long convertirAMilisegundos(int dias, int horas, int minutos, int segundos) {
        return ((dias * 24L * 60 * 60) + (horas * 60L * 60) + (minutos * 60L) + segundos) * 1000;
    }

    public static void main(String[] args) {
        System.out.println("Resultado: " + convertirAMilisegundos(1, 2, 30, 45) + " ms");
    }
}
