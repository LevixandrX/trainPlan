class Direction {
    private val cities = listOf(
        "Москва", "Санкт-Петербург", "Новосибирск", "Екатеринбург", "Нижний Новгород",
        "Казань", "Челябинск", "Омск", "Самара", "Ростов-на-Дону",
        "Уфа", "Красноярск", "Воронеж", "Пермь", "Волгоград",
        "Чебоксары", "Балтийск", "Калининград"
    )

    fun createRoute(): String {
        val start = cities.random()
        var end: String
        do {
            end = cities.random()
        } while (start == end)
        return "$start - $end"
    }
}