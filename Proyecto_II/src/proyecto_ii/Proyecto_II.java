/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_ii;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Rivas
 */
public class Proyecto_II {

    /**
     * @param args the command line arguments
     */
    
    public static int[] cajero_1 = new int[5];
    public static int[] cajero_2 = new int[5];
    public static int[] cajero_3 = new int[5];
    public static int[] cajero_4 = new int[5];
    public static void main(String[] args) {
        llenarCajeros();
        cajeros();
    }
    
    public static void llenarCajeros(){for (int i = 0; i < 5; i++) {
            cajero_1[i]=0;
            cajero_2[i]=0;
            cajero_3[i]=0;
            cajero_4[i]=0;
        }
}
    public static void cajeros (){
       int opcion = 0;
       int puesto = 0;
       while (opcion!=4){
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Qué desea realizar?\n1. Ingresar persona a un cajero\n2. Terminar un tramite\n3. Consultar el espacio en cajas\n4. Salir"));
             if (opcion == 1) {
                 int x= 0;
                   int contador1 = 0;
                   int contador2 = 0;
                   int contador3 = 0;
                   int contador4 = 0;
                   for (int i = 0; i < 5; i++) {
                          if (cajero_1[i]==1) {contador1 = contador1+1;}}
                    for (int i = 0; i < 5; i++) {
                          if (cajero_2[i]==1) {contador2 = contador2+1;}}
                     for (int i = 0; i < 5; i++) {
                          if (cajero_3[i]==1) {contador3 = contador3+1;}}
                     for (int i = 0; i < 5; i++) {
                          if (cajero_4[i]==1) {contador4 = contador4+1;}}
                     if (x==0) {
                         if (contador1<=contador2&&contador1<=contador3&&contador1<=contador4) {
                             if (contador1==0) {cajero_1[0]=1; JOptionPane.showMessageDialog(null, "Puede ocupar el primer puesto del cajero 1");}
                             if (contador1==1) {cajero_1[1]=1; JOptionPane.showMessageDialog(null, "Puede ocupar el segundo puesto del cajero 1");}
                             if (contador1==2) {cajero_1[2]=1; JOptionPane.showMessageDialog(null, "Puede ocupar el tercer puesto del cajero 1");}
                             if (contador1==3) {cajero_1[3]=1; JOptionPane.showMessageDialog(null, "Puede ocupar el cuarto puesto del cajero 1");}
                             if (contador1==4) {cajero_1[4]=1; JOptionPane.showMessageDialog(null, "Puede ocupar el quinto puesto del cajero 1");}
                             x=1;}}
                         if (x==0) {
                         if (contador2<=contador1&&contador2<=contador3&&contador2<=contador4) {
                             if (contador2==0) {cajero_2[0]=1; JOptionPane.showMessageDialog(null, "Puede ocupar el primer puesto del cajero 2");}
                             if (contador2==1) {cajero_2[1]=1; JOptionPane.showMessageDialog(null, "Puede ocupar el segundo puesto del cajero 2");}
                             if (contador2==2) {cajero_2[2]=1; JOptionPane.showMessageDialog(null, "Puede ocupar el tercer puesto del cajero 2");}
                             if (contador2==3) {cajero_2[3]=1; JOptionPane.showMessageDialog(null, "Puede ocupar el cuarto puesto del cajero 2");}
                             if (contador2==4) {cajero_2[4]=1; JOptionPane.showMessageDialog(null, "Puede ocupar el quinto puesto del cajero 2");}
                             x=1;
                 }
                 }
                         if (x==0) {
                         if (contador3<=contador2&&contador3<=contador1&&contador3<=contador4) {
                             if (contador3==0) {cajero_3[0]=1; JOptionPane.showMessageDialog(null, "Puede ocupar el primer puesto del cajero 3");}
                             if (contador3==1) {cajero_3[1]=1; JOptionPane.showMessageDialog(null, "Puede ocupar el segundo puesto del cajero 3");}
                             if (contador3==2) {cajero_3[2]=1; JOptionPane.showMessageDialog(null, "Puede ocupar el tercer puesto del cajero 3");}
                             if (contador3==3) {cajero_3[3]=1;JOptionPane.showMessageDialog(null, "Puede ocupar el cuarto puesto del cajero 3");}
                             if (contador3==4) {cajero_3[4]=1;JOptionPane.showMessageDialog(null, "Puede ocupar el quinto puesto del cajero 3");}
                             x=1;
                 }
                 }
                         if (x==0) {
                         if (contador4<=contador2&&contador4<=contador3&&contador4<=contador1) {
                             if (contador4==0) {cajero_4[0]=1;JOptionPane.showMessageDialog(null, "Puede ocupar el primer puesto del cajero 4");}
                             if (contador4==1) {cajero_4[1]=1;JOptionPane.showMessageDialog(null, "Puede ocupar el segundo puesto del cajero 4");}
                             if (contador4==2) {cajero_4[2]=1;JOptionPane.showMessageDialog(null, "Puede ocupar el tercer puesto del cajero 4");}
                             if (contador4==3) {cajero_4[3]=1;JOptionPane.showMessageDialog(null, "Puede ocupar el cuarto puesto del cajero 4");}
                             if (contador4==4) {cajero_4[4]=1;JOptionPane.showMessageDialog(null, "Puede ocupar el quinto puesto del cajero 4");}
                             x=1;
                 }
                 }
                         if (cajero_1[4]==1&&cajero_2[4]==1&&cajero_3[4]==1&&cajero_4[4]==1) {
                             JOptionPane.showMessageDialog(null, "Todos los cajeros están llenos");
                 }
             }
             if (opcion==2) {
                 int cajero = 0;
                 int contador = 0;
                  cajero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el número del cajero en el cual desea terminar el tramite"));
                  if (cajero==1) {
                      for (int i = 0; i < 5; i++) {
                          if (cajero_1[i]==1) {contador = contador+1;}}
                          if (contador==1) {cajero_1[0]=0;}
                          if (contador==2) {cajero_1[0]=1;cajero_1[1]=0;}
                          if (contador==3) {cajero_1[0]=1;cajero_1[1]=1;cajero_1[2]=0;}
                          if (contador==4) {cajero_1[0]=1;cajero_1[1]=1;cajero_1[2]=1;cajero_1[3]=0;}
                          if (contador==5) {cajero_1[0]=1;cajero_1[1]=1;cajero_1[2]=1;cajero_1[3]=1;cajero_1[4]=0;}
                          if (contador==0) {JOptionPane.showMessageDialog(null, "No hay nadie en el cajero.");}}
                 
                  if (cajero==2) {
                      for (int i = 0; i < 5; i++) {
                          if (cajero_2[i]==1) {contador = contador+1;}}
                          if (contador==1) {cajero_2[0]=0;}
                          if (contador==2) {cajero_2[0]=1;cajero_2[1]=0;}
                          if (contador==3) {cajero_2[0]=1;cajero_2[1]=1;cajero_2[2]=0;}
                          if (contador==4) {cajero_2[0]=1;cajero_2[1]=1;cajero_2[2]=1;cajero_2[3]=0;}
                          if (contador==5) {cajero_2[0]=1;cajero_2[1]=1;cajero_2[2]=1;cajero_2[3]=1;cajero_2[4]=0;}
                          if (contador==0) {JOptionPane.showMessageDialog(null, "No hay nadie en el cajero.");}}
                 
                  if (cajero==3) {
                      for (int i = 0; i < 5; i++) {
                          if (cajero_3[i]==1) {contador = contador+1;}}
                          if (contador==1) {cajero_3[0]=0;}
                          if (contador==2) {cajero_3[0]=1;cajero_3[1]=0;}
                          if (contador==3) {cajero_3[0]=1;cajero_3[1]=1;cajero_3[2]=0;}
                          if (contador==4) {cajero_3[0]=1;cajero_3[1]=1;cajero_3[2]=1;cajero_3[3]=0;}
                          if (contador==5) {cajero_3[0]=1;cajero_3[1]=1;cajero_3[2]=1;cajero_3[3]=1;cajero_3[4]=0;}
                          if (contador==0) {JOptionPane.showMessageDialog(null, "No hay nadie en el cajero.");}}
                 
                  if (cajero==4) {
                      for (int i = 0; i < 5; i++) {
                          if (cajero_4[i]==1) {contador = contador+1;}}
                          if (contador==1) {cajero_4[0]=0;}
                          if (contador==2) {cajero_4[0]=1;cajero_4[1]=0;}
                          if (contador==3) {cajero_4[0]=1;cajero_4[1]=1;cajero_4[2]=0;}
                          if (contador==4) {cajero_4[0]=1;cajero_4[1]=1;cajero_4[2]=1;cajero_4[3]=0;}
                          if (contador==5) {cajero_4[0]=1;cajero_4[1]=1;cajero_4[2]=1;cajero_4[3]=1;cajero_4[4]=0;}
                          if (contador==0) {JOptionPane.showMessageDialog(null, "No hay nadie en el cajero.");}}
                 
             }
             if (opcion == 3) {
                 String imprimir1 = "Cajero 1:";
                 String imprimir2 = "Cajero 2:";
                 String imprimir3 = "Cajero 3:";
                 String imprimir4 = "Cajero 4:";
                 for (int i = 0; i < 5; i++) {
                     imprimir1 = imprimir1 + " " + cajero_1[i];
                 }
                 for (int i = 0; i < 5; i++) {
                     imprimir2 = imprimir2 + " " + cajero_2[i];
                 }
                 for (int i = 0; i < 5; i++) {
                     imprimir3 = imprimir3 + " " + cajero_3[i];
                 }
                 for (int i = 0; i < 5; i++) {
                     imprimir4 = imprimir4 + " " + cajero_4[i];
                 }
                 JOptionPane.showMessageDialog(null, imprimir1 + "\n" + imprimir2 + "\n" + imprimir3 + "\n" + imprimir4);
             }
             if (opcion != 3 && opcion!=1 && opcion!=2 && opcion!=4){JOptionPane.showMessageDialog(null, "Solo puede escoger una opción entre el 1 y  el 4");opcion=0;}
        
    }
    
}}
