import java.net.CacheRequest

sealed class Request{

    class Error1(var e:Int):Request()
    class Error2(var e:Int):Request()
    class Answer(var e:Int):Request()
    class W(var e:Int):Request()

}
fun get(request: Request){
    var x=request.hashCode()
    when(request){
        is Request.Error1 -> println("Код ошибки: $x Ошибка сервера")
        is Request.Error2 -> println("Код ошибки: $x Нет подключения к интернету")
        is Request.Answer -> {println("Ответ")
            println( Request.Answer(1).e )}
    }

}

fun main(){
get(Request.Answer(1))
}