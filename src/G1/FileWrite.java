/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G1;

import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author Administrator
 */
public class FileWrite {
    public static void main(String args[]){
        String data="Nitin,102,MCA";
        try {
            FileWriter output=new FileWriter("data1.txt");
            output.write(data);
             System.out.print("Data insert sucessfull");
            output.close();
        } catch (IOException ex) {
            System.out.print("file creation problem");
        }
    }
    
}
