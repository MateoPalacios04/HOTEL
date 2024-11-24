package udla.mmje.poo.hotel;

class Reserva {
    private Habitacion habitacion;
    private String cliente;

    public Reserva(Habitacion habitacion, String cliente) {
        this.habitacion = habitacion;
        this.cliente = cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public String getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Reserva de " + cliente + " en la " + habitacion.getTipo() + " número " + habitacion.getNumero();
    }
}

