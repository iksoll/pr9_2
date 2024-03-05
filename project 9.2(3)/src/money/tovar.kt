package money

import java.time.LocalDate

class tovar(name: String, var money: Int, var buy:String, var data: Int, kves:Int, knumber:Int, kprice:Int):Tovaroved(name, kves, knumber,kprice) {

    fun inf(a:String, b:String, c:String, d:String, manufactureDate: LocalDate, expiretionDate: LocalDate):Boolean {
        var currentDate = LocalDate.now()
        return currentDate.isAfter(expiretionDate) || manufactureDate.isAfter(currentDate)
    }

    fun Where() {
        try {
            println("Откудо товар")
            var a = readLine()!!.toString()
            println("Срок годности товара")
            var b = readLine()!!.toString()
            println("На каком предприятие сделали товар")
            var c = readLine()!!.toString()
            println("Каким путем товар приедет")
            var d = readLine()!!.toString()
        }catch (e:Exception){
            println("Нормально вводите")
        }
    }
    fun Srok(){
        println("Введите срок годности товара (гггг - мм - дд")
        var manufactureDate = LocalDate.parse(readLine())
        println("Введите окончание даты срока годности")
        var expiretionDate = LocalDate.parse(readLine())

        if(manufactureDate > expiretionDate) {
            println("Продукт просрочен")
        }
        else{
            println("Продукт не просрочен")
        }
    }
}

