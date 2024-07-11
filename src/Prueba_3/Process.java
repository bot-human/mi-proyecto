package Prueba_3;

public class Process {
    private int idProceso;
    private String nameProceso;
    private int timeProceso;

    @Override
    public String toString() {
        return "Process{" +
                "idProceso=" + idProceso +
                ", nameProceso='" + nameProceso + '\'' +
                ", timeProceso=" + timeProceso +
                '}';
    }

    public Process() {
    }

    public Process(int idProceso, String nameProceso, int timeProceso) {
        this.idProceso = idProceso;
        this.nameProceso = nameProceso;
        this.timeProceso = timeProceso;
    }


    public int getIdProceso() {
        return idProceso;
    }

    public void setIdProceso(int idProceso) {
        this.idProceso = idProceso;
    }

    public String getNameProceso() {
        return nameProceso;
    }

    public void setNameProceso(String nameProceso) {
        this.nameProceso = nameProceso;
    }

    public int getTimeProceso() {
        return timeProceso;
    }

    public void setTimeProceso(int timeProceso) {
        this.timeProceso = timeProceso;
    }
}
