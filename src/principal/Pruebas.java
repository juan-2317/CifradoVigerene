package principal;

public class Pruebas {

    public static void main(String[] args) {
        Vigenere vigenere = new Vigenere();
        System.out.println("Encriptamos nombre...");
        // Este algoritmo obtiene un texto diferente al utilizar la tabla vigenere en inglés
        //  porque el abecedario español contiene una "ñ" adicional

        // Encriptamos el texto
        System.out.println(vigenere.encriptarTextoClaro("JUAN PABLO REINA ", "MILLONES"));

        System.out.println("Ahora desencriptamos el resultado anterior..");

        // Desencriptamos el texto
        System.out.println(vigenere.desencriptarTextoCifrado("UCLX ENFDA ZOSBN KNFPOCGQD", "MILLONES"));
    }
}
