/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad2parte1ejercicionumero12;

import java.util.Scanner;
public class Actividad2Parte1EjercicioNumero12 {

    public static void main(String[] args) {
        int a, b, c;
        double dis,ecu,ecu1,ecu2;
        Scanner input = new Scanner(System.in);
        System.out.println("digite los valores para la ecuacion de la forma ax^2+bx+c");
        System.out.println("recuerda que para que la ecuacion tenga sentido el valor de a debe ser diferente de 0");
        System.out.println("valor de a");
        a = input.nextInt();
        System.out.println("valor de b");
        b = input.nextInt();
        System.out.println("valor de c");
        c = input.nextInt();
        dis = (Math.pow(b,2)-(4*a*c));
        if (a==0){
              System.out.println("no leyó o que? a no puede ser 0");
        }
        else{
            if(dis>0){
                ecu1 = ((-b)+ Math.sqrt(dis))/(2*a);
                ecu2 = ((-b)- Math.sqrt(dis))/(2*a);
                System.out.println("x1 = "+ecu1+" y x2 = "+ecu2);
            }
            else if (dis==0){
                ecu = -b/(2*a);
                System.out.println("x = "+ecu);
            }
            else{
                System.out.println("el problema no tiene solucion");
            }
            
        }
                
    }
}
