import kotlin.random.Random

class CashDesk(private val minTickets: Int, private val maxTickets: Int) {

    fun sellTickets(): Int {
        return Random.nextInt(minTickets, maxTickets + 1)
    }
}