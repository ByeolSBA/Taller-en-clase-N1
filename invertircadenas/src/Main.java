public class Main {
    public static String invertirTexto(String texto) {
        StringBuilder resultado = new StringBuilder();
        for (int i = texto.length() - 1; i >= 0; i--) {
            resultado.append(texto.charAt(i));
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        String texto = "Hola mundo"; // Usar comillas dobles en vez de simples
        System.out.println("Texto invertido: " + invertirTexto(texto));
    }
}
