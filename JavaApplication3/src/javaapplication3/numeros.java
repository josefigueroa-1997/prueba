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
public class numeros {
    private int n1,n2, suma,resta;
    
    public numeros(){
    
    }
    public void setnumeros(int n1,int n2){
    
        this.n1 = n1;
        this.n2=n2;
    }
    
    private int suma(){
    
        this.suma = n1+n2;
        return suma;
    }
    
    private int resta(){
    
        this.resta = n1-n2;
        return resta;
    }
    
    public int getsuma(){
        return suma();
    }
    
    public int getresta(){
        return resta();
    }
}
