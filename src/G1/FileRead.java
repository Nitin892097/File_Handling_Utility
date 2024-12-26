/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G1;


import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author Administrator
 */
public class FileRead {
    public static void main(String args[]) throws IOException{
        char [] data=new char[100];
        try {
            FileReader input=new FileReader("data1.txt");
            input.read(data);
            System.out.print("Data read sucessfull");
            System.out.println(data);
            input.close();
        } catch (IOException ex) {
           System.out.print("Data input error");
        }
    }
    
}
