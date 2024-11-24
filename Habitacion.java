package udla.mmje.poo.hotel;

class Habitacion {
    protected int numero;
    protected boolean ocupada;

    public Habitacion(int numero) {
        this.numero = numero;
        this.ocupada = false;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public String getTipo() {
        return "Habitación estándar";
    }

    @Override
    public String toString() {
        return getTipo() + " " + numero + (ocupada ? " (Ocupada)" : " (Disponible)");
    }
}
