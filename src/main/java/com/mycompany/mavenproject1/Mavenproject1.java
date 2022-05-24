/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;
import java.util.*;  
/**
 *
 * @author juliz
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        int lim =10;
      Scanner in = new Scanner(System.in);  
      
      System.out.print("ingrese un numero de 10 digitos: ");  
      String num = in.nextLine();
      String a =num;
      System.out.println(num+"\n");             
      String cod ="SUTPAGMELC";
      int i=0;
      int j=0;
      String res="";
      
      if(a.length() != lim ){
          System.out.println( "El numero ingresado no es correcto");
          in.close();
      }
      else{
          for(i=0;i<lim;i++){
          for(j=0;j<lim;j++){
              if(Character.getNumericValue(num.charAt(i)) == j){
                  res=res+cod.charAt(j);
              }
          }
      }
      System.out.println(num + "-->"+res);
      }
     
    }
}
