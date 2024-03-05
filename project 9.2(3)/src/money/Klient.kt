package money

class Klient(name: String, var money: Double, var buy: String, var data: String, kves: Int, knumber: Int, kprice: Int) : Tovaroved(name, kves, knumber, kprice) {

    fun email() {
        try {
            println("Введите свой email")
            var emal = readLine()!!.toString()
        } catch (e: Exception) {
            println("ошибка")
        }
    }

    fun budget(kprice: Int) {
        println("Введите сколько у вас денег")
        var a = readLine()!!.toDouble()
        if (a > kprice) {
            println("Поздравляем с покупкой")
        } else {
            println("Вы занесены в черный спискок")
        }
    }

    fun information() {
        println("Дата заказа $data")
        println("Название товара $name")
        println("Цена товара $price")
        println("Email ${email()}")
    }
}




