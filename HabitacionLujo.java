package udla.mmje.poo.hotel;

class HabitacionLujo extends Habitacion {
    public HabitacionLujo(int numero) {
        super(numero);
    }

    @Override
    public String getTipo() {
        return "Habitación de lujo";
    }
}
