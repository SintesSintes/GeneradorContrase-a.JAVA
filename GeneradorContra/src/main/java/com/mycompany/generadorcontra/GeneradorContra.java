package com.mycompany.generadorcontra;
import java.util.Random;

public class GeneradorContra {

    public static void main(String[] args) {
       int longitud = 10;
       String caracteres = "ABCDEFGabcdefg123456";
       Random random = new Random();
       StringBuilder contra = new StringBuilder();
       
       for (int i=0; i < longitud; i++){
           int indice = random.nextInt(caracteres.length());
           char generar = caracteres.charAt(indice);
           contra.append(generar);
       }
        System.out.println("La contraseña generada es:" + contra.toString());
    }
}
