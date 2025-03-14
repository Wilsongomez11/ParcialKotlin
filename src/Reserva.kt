
data class Reserva(
    val idReserva: Int,
    val idHuesped: Int,
    val nombreHuesped: String,
    val emailHuesped: String,
    val numeroHabitacion: Int,
    val tipoHabitacion: String,
    val precioPorNoche: Double,
    val nochesReservadas: Int
) {
    fun calcularMontoTotal(): Double {
        return precioPorNoche * nochesReservadas
    }
}