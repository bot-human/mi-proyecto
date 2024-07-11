package Prueba_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProcessManager manager = new ProcessManager();
        manager.crearProceso("Proceso A");
        manager.crearProceso("Proceso B");
        manager.crearProceso("Proceso C");

        String resultadoEjecucion = manager.ejecutarProcesos();
        System.out.println(resultadoEjecucion);

        System.out.println("--- Menu de Gestión de Procesos ---");
        System.out.println("--- Escriba una opcion ---");
        System.out.println("1) Crear Proceso ");
        System.out.println("2) Ejecutar Procesos en la cola ");
        System.out.println("3) Salir ");

    }
}