/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alumno
 */
public final class FileUtilitary {

    File f;
    String a;
    BufferedReader b;

    public FileUtilitary(String asd)  {
        FileReader fils = null;
        try {
            this.f = new File(asd);
            fils = new FileReader(f);
            this.b = new BufferedReader(fils);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileUtilitary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getLine() {
        try {
            String as;
            
            as = b.readLine();
            if (as != null) {
                return as;
            }
        } catch (IOException ex) {
            Logger.getLogger(FileUtilitary.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
