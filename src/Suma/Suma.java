package Suma;

import javax.swing.*;
public class Suma {

    private int matrizA[][];

    private int matrizB[][];

    private int resultado[][];

    private int filaA;

    private int columnaA;

    private int filaB;

    private int columnaB;

    private int valoresa;

    private int valoresb;

    public Suma(){

        filaA = Integer.parseInt(JOptionPane.showInputDialog("Filas para Matriz A"));

        columnaA = Integer.parseInt(JOptionPane.showInputDialog("Columnas para Matriz A"));

        this.matrizA = new int[filaA][columnaA];

        filaB = Integer.parseInt(JOptionPane.showInputDialog("Filas para Matriz B"));

        columnaB = Integer.parseInt(JOptionPane.showInputDialog("Columnas para Matriz B"));

        this.matrizB = new int[filaB][columnaB];

    }
    public void agregarMatrizA() {

        for (int i = 0; i < filaA; i++) {

            for (int j = 0; j < columnaA; j++) {

                this.valoresa = Integer.parseInt(JOptionPane.showInputDialog("Valores para Matriz A"));

                this.matrizA[i][j] = this.valoresa;
            }
        }
    }
    public void agregarMatrizB() {

        for (int i = 0; i < filaB ; i++) {

            for (int j = 0; j < columnaB; j++) {

                this.valoresb = Integer.parseInt(JOptionPane.showInputDialog("Valores para Matriz B"));

                this.matrizB[i][j] = this.valoresb;
            }
        }
    }
    public void mostrarMatrizA() {

        for (int i = 0; i < filaA ; i++) {

            for (int j = 0; j < columnaA; j++) {

                System.out.printf("%d ", this.matrizA[i][j]);
            }
            System.out.println();
        }
    }
    public void mostrarMatrizB() {

        for (int i = 0; i < filaB ; i++) {

            for (int j = 0; j < columnaB; j++) {

                System.out.printf("%d ", this.matrizB[i][j]);
            }
            System.out.println();
        }
    }
    public void sumaMatriz(){

        this.resultado = new int[filaA][columnaA];

        for ( int i = 0; i < filaA; i++){

            for ( int j = 0; j < columnaB; j++){

                resultado[i][j] = matrizA[i][j] + matrizB[i][j];

                System.out.printf("%d ", this.resultado[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        Suma suma = new Suma();

        if(suma.filaA == suma.filaB || suma.columnaA == suma.columnaB) {

            suma.agregarMatrizA();

            System.out.println("Matriz A");

            suma.mostrarMatrizA();

            System.out.println();

            suma.agregarMatrizB();

            System.out.println("Matriz B");

            suma.mostrarMatrizB();

            System.out.println();

            System.out.println("Matriz A + Matriz B");

            suma.sumaMatriz();
        }
        else {

            JOptionPane.showMessageDialog(null,"No se puede sumar");
        }
    }
}