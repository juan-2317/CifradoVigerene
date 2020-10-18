package principal;

public class Vigenere {

    private CifradorVigenere cifradoVigenere;
    private DescifradorVigenere descifradoVigenere;

    public Vigenere() {
        cifradoVigenere = new CifradorVigenere();
        descifradoVigenere = new DescifradorVigenere();
    }

    public String encriptarTextoClaro(String textoClaro, String clave) {
        String claveCompletada = "";
        String textoCifrado = "";
        int indice = 0;
        for (int i = 0; i < textoClaro.length(); i++) {
            int j = 0;
            while (j < clave.length()) {
                if (claveCompletada.length() < textoClaro.length()) {
                    if (textoClaro.charAt(indice) != ' ') {
                        claveCompletada += clave.charAt(j);
                    } else {
                        claveCompletada += " ";
                        j--;
                    }
                    indice++;
                }
                j++;
            }
        }

        for (int i = 0; i < textoClaro.length(); i++) {
            char charTextoClaro = textoClaro.charAt(i);
            char charClaveCompletada = claveCompletada.charAt(i);
            if (charTextoClaro != ' ') {
                textoCifrado += cifradoVigenere.getTextoCifrado(charTextoClaro, charClaveCompletada);
            } else {
                textoCifrado += " ";
            }
        }
        return textoCifrado;
    }

    public String desencriptarTextoCifrado(String textoCifrado, String clave) {
        String claveCompletada = "";
        String textoClaro = "";
        int indice = 0;
        for (int i = indice; i < textoCifrado.length(); i++) {
            int j = 0;
            while (j < clave.length()) {
                if (claveCompletada.length() < textoCifrado.length()) {
                    if (textoCifrado.charAt(indice) != ' ') {
                        claveCompletada += clave.charAt(j);
                    } else {
                        claveCompletada += " ";
                        j--;
                    }
                    indice++;
                }
                j++;
            }
        }

        for (int i = 0; i < textoCifrado.length(); i++) {
            char charTextoCifrado = textoCifrado.charAt(i);
            char charClaveCompletada = claveCompletada.charAt(i);
            if (charTextoCifrado != ' ') {
                textoClaro += descifradoVigenere.getTextoDescifrado(charTextoCifrado, charClaveCompletada);
            } else {
                textoClaro += " ";
            }
        }
        return textoClaro;
    }
}
