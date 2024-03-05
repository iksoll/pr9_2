import Client.*

class Admin (var block:Int, empName: String, empScore:Int, empKK:String, empPlatej :Int ) : Klient(empName ,empScore, empKK, empPlatej){

    open fun Geinfo(){
        println ("Работник ${name}")
    }

    fun Plateji1(){
        print ("Введите сумму максимального платежа: ")
        var sum = readLine()!!.toInt()
        if ( this.platej > sum){
            println ("Сумма платежа превышена, вы хотите заблокировать карту клиента? \n 1-Да \n 2-Нет")
            block = readLine()!!.toInt()
            when (block){
                1 -> println ("Карта клиента заблокирована за превышение платежа")
                2 -> println ("Вы отклонили блокировку карты клиента")
            }
        }
    }
}