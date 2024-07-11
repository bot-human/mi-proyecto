package Prueba_3;

import java.util.ArrayList;

public class ProcessManager {
    private ArrayList<String> processQueue;

    public ProcessManager() {
        processQueue = new ArrayList<>();
    }

    public void crearProceso(String proceso) {
        processQueue.add(proceso);
    }

    public String ejecutarProcesos() {
        StringBuilder resultado = new StringBuilder();
        long tiempoTotal = 0;

        for (String proceso : processQueue) {
            int tiempoProceso = 65000;
            tiempoTotal += tiempoProceso;

            resultado.append("Proceso ejecutado: ").append(proceso).append(" (").append(tiempoProceso).append(" minutos)\n");
        }

        resultado.append("Tiempo total de ejecución: ").append(tiempoTotal).append(" minutos");
        return resultado.toString();
    }

}
