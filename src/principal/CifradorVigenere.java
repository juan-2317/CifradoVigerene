package principal;

public class CifradorVigenere {

    private char[] tablaCesar;

    public CifradorVigenere() {
        // La longitud de este arreglo es 27 el tamaño del abecedario español estándar
        tablaCesar = new char[]{
            'A', 'B', 'C', 'D', 'E',
            'F', 'G', 'H', 'I', 'J',
            'K', 'L', 'M', 'N', 'Ñ',
            'O', 'P', 'Q', 'R', 'S',
            'T', 'U', 'V', 'W', 'X',
            'Y', 'Z'
        };
    }

    public char getTextoCifrado(char parTextoClaro, char parTextoClave) {
        int indiceX = 0;
        int indiceY = 0;
        for (int i = 0; i < tablaCesar.length; i++) {
            if (parTextoClaro == tablaCesar[i]) {
                indiceX = i;
                break;
            }
        }

        for (int j = 0; j < tablaCesar.length; j++) {
            if (parTextoClave == tablaCesar[j]) {
                indiceY = j;
                break;
            }
        }
        return tablaCesar[(indiceX + indiceY) % 27];
    }
}
