package udla.mmje.poo.hotel;

import java.util.ArrayList;
import java.util.List;

class Hotel {
    private List<Habitacion> habitaciones;
    private List<Reserva> reservas;

    public Hotel() {
        habitaciones = new ArrayList<>();
        reservas = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            habitaciones.add(new Habitacion(i));
        }
        for (int i = 4; i <= 50; i++) {
            habitaciones.add(new HabitacionLujo(i));
        }
    }


    public boolean consultarDisponibilidad(int numeroHabitacion) {
        for (Habitacion h : habitaciones) {
            if (h.getNumero() == numeroHabitacion) {
                return !h.isOcupada();
            }
        }
        return false;
    }


    public String crearReserva(int numeroHabitacion, String cliente) {
        for (Habitacion h : habitaciones) {
            if (h.getNumero() == numeroHabitacion) {
                if (!h.isOcupada()) {
                    h.setOcupada(true);
                    Reserva reserva = new Reserva(h, cliente);
                    reservas.add(reserva);
                    return "Reserva creada exitosamente: " + reserva;
                } else {
                    return "La habitación " + numeroHabitacion + " ya está ocupada.";
                }
            }
        }
        return "No se encontró la habitación " + numeroHabitacion + ".";
    }

    
    public void mostrarReservas() {
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas registradas.");
        } else {
            for (Reserva r : reservas) {
                System.out.println(r);
            }
        }
    }
}
