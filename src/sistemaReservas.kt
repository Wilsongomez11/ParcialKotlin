class sistemaReservas {
    private val reservas = mutableListOf<Reserva>()

    fun registrarReserva(reserva: Reserva): Boolean {
        if (reservas.any { it.numeroHabitacion == reserva.numeroHabitacion }) {
            println("Error: La habitación ${reserva.numeroHabitacion} ya está reservada")
            return false
        }
        reservas.add(reserva)
        println("Reserva registrada con éxito")
        return true
    }

    fun cancelarReserva(idReserva: Int) {
        val reserva = reservas.find { it.idReserva == idReserva }
        if (reserva != null) {
            reservas.remove(reserva)
            println("Reserva con ID $idReserva cancelada con éxito")
        } else {
            println("No se encontró una reserva con ese ID")
        }
    }

    fun mostrarReservasActivas() {
        if (reservas.isEmpty()) {
            println("No hay reservas activas")
        } else {
            println("Reservas activas:")
            reservas.forEach {
                println("ID Reserva: ${it.idReserva}, Huésped: ${it.nombreHuesped}, Habitación: ${it.numeroHabitacion}, Tipo: ${it.tipoHabitacion}, Monto Total: \$${it.calcularMontoTotal()}")
            }
        }
    }
}