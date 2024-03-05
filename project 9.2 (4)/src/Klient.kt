package Client

open class Klient (var name:String, var score: Int, var KK: String, var platej:Int){

    open fun GetInfo(){
        print ("Информация о клиенте ${name}: ")
        println("счет - ${score}, банковская карта - ${KK}")
    }


}