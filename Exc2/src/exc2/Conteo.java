package exc2;

public class Conteo {

    private int cantidad;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    String [] palabras = new String[cantidad];

    public String[] getPalabras() {
        return palabras;
    }

    public void setPalabras(String[] palabras) {
        this.palabras = palabras;
    }
    
   /* private String palabra;

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public Conteo(String palabra) {
        this.palabra = palabra;
    }
*/
    public Conteo() {
    }

    int[] conteos = new int[26];
    
    public void conteo() {
        //Cuenta la frecuencia de cada letra...
        for (int i = 0; i < palabras.length; i++) {

            conteos[palabras[i].charAt(i) - 'A']++;

        }
    }

    public void Mostrar() {
        //imprimir frecuencias...
        System.out.println("Conteo de letras");

        for (int i = 0; i < conteos.length; i++) {
            if (conteos[i] != 0) {
                System.out.println((char) (i + 'A') + ": " + conteos[i]);
            }
        }

    }

}
