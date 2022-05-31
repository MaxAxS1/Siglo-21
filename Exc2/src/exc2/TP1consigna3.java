package exc2;

import java.util.Scanner;

public class TP1consigna3 {

    public static void main(String args[]) {
        try {
            Conteo cont = new Conteo();
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingresar canditdad de palabras en numero: ");
            cont.setCantidad(sc.nextInt());
            String palabras[];
            palabras = new String[cont.getCantidad()];
            for (int i = 0; i < cont.getCantidad(); i++) {
                System.out.println("Ingresar palabra " + "(" +(i + 1)+ ")");
                palabras[i]=sc.nextLine();
                /*cont.setPalabras(palabras);*/
            }
            
            for (String pal : palabras) {
                pal = pal.toUpperCase();
               cont.palabras(pal);
                cont.conteo();
                cont.Mostrar();
            }

        } finally {
        }
    }
}
