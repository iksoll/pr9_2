package money

open class Tovaroved(var name: String, var ves: Int, var price: Int, var number: Int, ) {
    open fun input() {
        println("Введите название товара")
        var name = readLine()!!.toString()
        println("Введите вес товара")
        var ves = readLine()!!.toDouble()
        println("Введите цену товара")
        var price = readLine()!!.toDouble()
        println("Ввндите номер товара")
        var number = readLine()!!.toInt()
    }

    fun info(Tovaroved1: Tovaroved) {
        println("Название товара ${Tovaroved1.name}")
        println("вес товара ${Tovaroved1.ves}")
        println("Цена товара ${Tovaroved1.price}")
        println("Номер товара на складе ${Tovaroved1.number}")
    }
}




