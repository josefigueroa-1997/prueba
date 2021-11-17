
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
        int m = obj.getmultiplicacion();
        int d = obj.getdivision();
        boolean p = obj.getprimo();
        JOptionPane.showMessageDialog(null, "La suma de los dos numeros es igual a: "+n);
        JOptionPane.showMessageDialog(null, "La resta de los dos numeros es igual a: "+r);
        JOptionPane.showMessageDialog(null, "La multiplicación de los dos numeros es igual a: "+m);
        JOptionPane.showMessageDialog(null, "La división de los dos numeros es igual a: "+d);
        if (p==true){
            
            JOptionPane.showMessageDialog(null, "El número "+n1+" es primo");
        }
        else {
            JOptionPane.showMessageDialog(null, "El número "+n1+" no es primo");
        }
        String num3 = JOptionPane.showInputDialog("Ingrese un numero para buscar: ");
        int n3 = Integer.parseInt(num3);
        boolean i = obj.getiguales(n3);
        if (i==true){
            JOptionPane.showMessageDialog(null, "Los nnumeros son iguales");
        
        }
        else {
            
            JOptionPane.showMessageDialog(null, "Los nnumeros no son iguales");
        
        }
    }
}
