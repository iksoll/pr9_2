import money.*
import java.time.LocalDate

fun main() {
    var Tovaroved1: Tovaroved = Tovaroved("", 0, 0, 0)
    Tovaroved1.input()


    var tovar1:tovar=tovar("", 0, "", 0, 0, 0, 0)
    tovar1.Where()
    tovar1.inf("", "", "", "", LocalDate.now(), LocalDate.now())
    tovar1.Srok()

    var Klient1: Klient = Klient("", 0.0, "", "", 0, 0, 0)
    Klient1.email()
    Klient1.information()
    Klient1.budget(Tovaroved1.price)

    println("Введите название товара:")
    var productName = readLine()!!

    println("Название товара: $productName")
}




