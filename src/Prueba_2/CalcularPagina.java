package Prueba_2;

import java.util.Scanner;

public class CalcularPagina {
    public static void main(String[] args) {
        Scanner entrada1 = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del archivo (en bytes): ");
        long tamanoArchivo = entrada1.nextLong();
        System.out.print("Ingrese el tamaño de la página (en bytes): ");
        long tamanoPagina = entrada1.nextLong();
        long totalPaginas = (tamanoArchivo / tamanoPagina);
        if (tamanoArchivo % tamanoPagina !=0){
            totalPaginas++;
        }
        System.out.println("Número total de páginas necesarias: " + totalPaginas);
    }
}
