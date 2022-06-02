import java.net.CacheRequest

sealed class Request(){

    class Error1():Request(){}
    class Error2():Request(){}
    class Answer():Request(){}
}


fun main(){


    fun get(request: Request){
        var x=request.hashCode()
        when(request){
            is Request.Error1 -> println("Код ошибки: $x Ошибка сервера")
            is Request.Error2 -> println("Код ошибки: $x Нет подключения к интернету")
            is Request.Answer -> println("Ответ")
        }
    }
get(Request.Error1())

}