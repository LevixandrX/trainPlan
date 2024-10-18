import kotlin.random.Random

class FastTrain(private val direction: String, private val passengers: Int) {
    private val carriages = mutableListOf<Carriage>()

    fun formTrain() {
        var remainingPassengers = passengers
        var carriageNumber = 1
        while (remainingPassengers > 0) {
            val capacity = Random.nextInt(5, 26)
            val carriage = Carriage(capacity)
            if (remainingPassengers >= capacity) {
                carriage.passengers = capacity
                remainingPassengers -= capacity
            } else {
                carriage.passengers = remainingPassengers
                remainingPassengers = 0
            }
            carriages.add(carriage)
            println("Вагон номер $carriageNumber вместимостью ${carriage.capacity} пассажиров")
            carriageNumber++
        }
    }

    fun sendTrain() {
        println("Поезд $direction, состоящий из ${carriages.size} вагонов отправлен")
    }
}