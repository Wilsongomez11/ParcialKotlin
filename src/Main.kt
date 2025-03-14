import java.util.*


fun main() {
        val sistemaReservas = sistemaReservas()
        val scanner = Scanner(System.`in`)

        while (true) {
            println("\nMenú:")
            println("1. Registrar una reserva")
            println("2. Cancelacion de reserva")
            println("3. Mostrar reservas activas")
            print("Selecciona una opción: ")

            when (scanner.nextInt()) {
                1 -> {
                    print("ID de reserva: ")
                    val idReserva = scanner.nextInt()
                    print("ID de huésped: ")
                    val idHuesped = scanner.nextInt()
                    scanner.nextLine()
                    print("Nombre del huésped: ")
                    val nombreHuesped = scanner.nextLine()
                    print("Email del huésped: ")
                    val emailHuesped = scanner.nextLine()
                    print("Número de habitación: ")
                    val numeroHabitacion = scanner.nextInt()
                    scanner.nextLine()
                    print("Tipo de habitación: ")
                    val tipoHabitacion = scanner.nextLine()
                    print("Precio por noche: ")
                    val precioPorNoche = scanner.nextDouble()
                    print("Cantidad de noches: ")
                    val nochesReservadas = scanner.nextInt()

                    val nuevaReserva = Reserva(
                        idReserva, idHuesped, nombreHuesped, emailHuesped, numeroHabitacion, tipoHabitacion, precioPorNoche, nochesReservadas
                    )
                    sistemaReservas.registrarReserva(nuevaReserva)
                }
                2 -> {
                    print("Ingrese el ID de la reserva a cancelar: ")
                    val idReserva = scanner.nextInt()
                    sistemaReservas.cancelarReserva(idReserva)
                }
                3 -> sistemaReservas.mostrarReservasActivas()

                else -> println("Opción no válida\n Intente de nuevo")
            }
        }
    }