/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author holan
 */
public class JavaApplication3 {

   
    public static void main(String[] args) {
        numeros obj = new numeros();
        obj.setnumeros(4,2);
        int n = obj.getsuma();
        int r = obj.getresta();
        System.out.println(n);
        System.out.println(r);
    }
    
}
