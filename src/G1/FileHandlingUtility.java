/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G1;

import java.io.File;
import java.io.IOException;


/**
 *
 * @author Administrator
 */
public class FileHandlingUtility {
   public static void main(String args[]){
//       File file=new File("data1.txt");
       File file=new File("C:\\NetBeansProjects\\data1.txt");
       try {
           if(file.createNewFile()){
               System.out.print("file create successfull");
           }
           else{
               System.out.print("file not created");
           }
       } catch (IOException ex) {
        System.out.print("File creation problem");
       }
   }
    
}
