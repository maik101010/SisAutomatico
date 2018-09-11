/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Michael García A
 */
public class LeerFichero {

    public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        String numeroBean;
        List<Character> palabra = new ArrayList<>();
        while ((cadena = b.readLine()) != null) {
            System.out.println(cadena);
            for (int i = 0; i < cadena.length(); i++) {
                palabra.add(cadena.charAt(i));
                if (cadena.charAt(i) == '|') {
                    for (Character c : palabra) {
                        numeroBean = String.valueOf(c);
                        System.out.println("Primer número es "+ numeroBean);
                    }

                }
            }

        }
        
        b.close();
    }

    public static void main(String[] args) throws IOException {
        muestraContenido("archivo.txt");
    }
}
