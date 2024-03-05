fun main(){
println("Под каким именем вы хотите войти? \n 1-Клиент \n2-Админ")
    var system = readLine()!!.toInt()
    when (system){
        1 -> {
            var Misha= Plateji (0, 0, "Миша", 5, "мир")
            Misha.GetInfo()
            print ("Введите номер вашего заказа: ")
            var zakaz1 = readLine()!!.toInt()
            Misha.Setzakaz(zakaz1)
            Misha.Komandi()
        }
        2 -> {
            var Sasha = Admin( 0, "Саша", 0, "мир", 0)
            Sasha.Geinfo()
            Sasha.Plateji1()
        }
        else -> { println("Не существующее имя. Запрос отклонён.")}
    }
}
