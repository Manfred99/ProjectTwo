/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Solano
 */
public class Resources {
    //variable
    private BufferedReader br;
    private PrintStream ps;
    
    //method to read the history from the file
    public BufferedReader readBufferedReader (String nameFile){
         
        File file = new File(nameFile);
        try{
            FileInputStream fis= new FileInputStream(file);
            InputStreamReader ISR = new InputStreamReader(fis);
             br = new BufferedReader(ISR);
            
        }catch (FileNotFoundException fnfe){
            JOptionPane.showMessageDialog(null, "Problems");
        }//end catch
        return br;        
    }//end method
    
    //method to write in the file choose for the user
    public PrintStream getPrintStream(String nameFile, Boolean typeFile){
        File file = new File(nameFile);
        try{
            FileOutputStream fos = new FileOutputStream(file,typeFile);
             ps = new PrintStream(fos);
            }catch (FileNotFoundException fnfe){
            JOptionPane.showMessageDialog(null, "Problems");
        }//end catch
        return ps;
    }//end method
}
