import Client.*

class Plateji (empPlatej: Int, var komanda: Int, empName:String, empScore:Int, empKK:String) : Klient(empName,empScore, empKK, empPlatej){

    private var zakaz: Int = 1
    public fun GetZakaz(): Int{
        return zakaz
    }
    public fun Setzakaz(zakaz:Int){
        if (zakaz<0){println("Несуществующий заказ")}
        else {this.zakaz = zakaz;}
    }

    fun Komandi() {
        println("Введите номер команды \n 1 - Оплатить заказ\n 2- Сделать платеж на другой счёт\n3 - заблокировать КК\n4 - Аннулировать счет")
        komanda = readLine()!!.toInt()
        when (komanda) {

            1 -> {
                println("Заказ под каким номером вы хотите оплатить?")
                zakaz = readLine()!!.toInt()
                println("Готово, вы оплатили заказ!")
            }
            2 -> {
                println("На какую сумму вы хотите совершить платеж??")
                platej = readLine()!!.toInt()
                println("Готово, платеж совершен!")
            }
            3 -> println("Ваша банковская карта заблокирована")
            4 -> {
                this.score = 0
                println("Сумма на вашем банковском счету составляет ${this.score}")
            }
        }
    }
}

