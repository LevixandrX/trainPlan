fun main() {
    var finishTrip = true

    while (finishTrip) {
        println("Шаг 1 - Создать направление")
        val direction = Direction().createRoute()
        println("Маршрут поезда $direction")
        println()

        println("Шаг 2 - Продать билеты")
        val tickets = CashDesk(5, 201).sellTickets()
        println("Продано $tickets билетов")
        println()

        println("Шаг 3 - Собрать состав")
        val train = FastTrain(direction, tickets)
        train.formTrain()
        println()

        println("Шаг 4 - Отправить состав")
        train.sendTrain()
        println()

        println("Выберите дальнейшее действие:")
        println("EXIT - выйти из программы")
        println("Иначе - создать новое направление")

        val input = readLine()
        finishTrip = input?.uppercase() != "EXIT"
    }
}