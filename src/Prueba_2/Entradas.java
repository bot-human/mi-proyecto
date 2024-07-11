package Prueba_2;

public class Entradas {
    private long tamanoArchivo;
    private long tamanoPagina;

    public Entradas() {
    }

    public Entradas(long tamanoArchivo, long tamanoPagina) {
        this.tamanoArchivo = tamanoArchivo;
        this.tamanoPagina = tamanoPagina;
    }

    @Override
    public String toString() {
        return "Entradas{" +
                "tamanoArchivo=" + tamanoArchivo +
                ", tamanoPagina=" + tamanoPagina +
                '}';
    }

    public long getTamanoArchivo() {
        return tamanoArchivo;
    }

    public void setTamanoArchivo(long tamanoArchivo) {
        this.tamanoArchivo = tamanoArchivo;
    }

    public long getTamanoPagina() {
        return tamanoPagina;
    }

    public void setTamanoPagina(long tamanoPagina) {
        this.tamanoPagina = tamanoPagina;
    }
}
