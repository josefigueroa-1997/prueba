
package javaapplication3;

import javax.swing.*;
public class JavaApplication3 {
    
    public static void main(String[] args) {
        numeros obj = new numeros();
        String num1 = JOptionPane.showInputDialog("Ingrese un numero");
        String num2 = JOptionPane.showInputDialog("Ingrese un numero");
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        obj.setnumeros(n1,n2);
        int n = obj.getsuma();
        int r = obj.getresta();
        JOptionPane.showMessageDialog(null, "La suma de los dos numeros es igual a: "+n);
        JOptionPane.showMessageDialog(null, "La resta de los dos numeros es igual a: "+r);
    }
    
}
