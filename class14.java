/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack14;

/**
 *
 * @author Affrin
 */
public class class14 {
     public static void main(String[] args) {
        System.out.println(shopping("fruit"));
     }
      private static String shopping(java.lang.String catego) {
          try{
        pack14.web14 service = new pack14.web14();
        pack14.web14 port = service;
        return port.shopping(catego);
        }
          catch(Exception e){
              return "exception";
          }
    }
}