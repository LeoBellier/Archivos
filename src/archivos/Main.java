/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author LeoBellier
 */
public class Main {

    public static void main(String[] args) throws IOException {
        String s = "C:\\Users\\Alumno\\Desktop\\algo.txt";
        FileUtilitary fU;
        fU = new FileUtilitary(s);
        System.out.println(fU.getLine());
        
    }

    public static String cargaPath() {
        String st;
        try (Scanner s = new Scanner(System.in)) {
            st = s.nextLine();
        }
        return st;
    }

}
