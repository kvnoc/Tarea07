package Producto;

import javax.swing.*;
public class Producto {

    private int matrizA[][];

    private int matrizB[][];

    private int filaA;

    private int columnaA;

    private int filaB;

    private int columnaB;

    private int valoresa;

    private int valoresb;

    public Producto() {

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
    public void mostrarMatrizA() {

        for (int i = 0; i < filaA; i++) {

            for (int j = 0; j < columnaA; j++) {

                System.out.printf("%d ", matrizA[i][j]);
            }
            System.out.println();
        }
    }
    public void agregarMatrizB() {

        for (int i = 0; i < filaB; i++) {

            for (int j = 0; j < columnaB; j++) {

                this.valoresb = Integer.parseInt(JOptionPane.showInputDialog("Valores para Matriz B"));

                this.matrizB[i][j] = this.valoresb;
            }
        }
    }
    public void mostrarMatrizB() {

        for (int i = 0; i < filaB; i++) {

            for (int j = 0; j < columnaB; j++) {

                System.out.printf("%d ", matrizB[i][j]);
            }
            System.out.println();
        }
    }
    public void multipMatriz() {

        int resultado[][] = new int[filaA][columnaB];

        for (int i = 0; i < filaA; i++) {

            for (int j = 0; j < columnaB; j++) {

                for (int k = 0; k < columnaA; k++) {

                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
                System.out.printf("%d ", resultado[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Producto producto = new Producto();

        if (producto.columnaA == producto.filaB) {

            producto.agregarMatrizA();

            System.out.println("Matriz A");

            producto.mostrarMatrizA();

            System.out.println();

            producto.agregarMatrizB();

            System.out.println("Matriz B");

            producto.mostrarMatrizB();

            System.out.println();

            System.out.println("Matriz A x Matriz B");

            producto.multipMatriz();
        } else {

            JOptionPane.showMessageDialog(null, "No se puede multiplicar");
        }
    }
}