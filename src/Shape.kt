import kotlin.math.PI
import kotlin.math.pow

class Box(var vol:Double){
    var listForBox= mutableListOf<Shape>()
    fun add(shape: Shape):Boolean{
        return if (listForBox.size==0){
            if (vol>=shape.volume()){
                listForBox.add(shape)
                true
            }else{
                false }
        }else{
            if (vol>=(listForBox.sumOf { it.volume()}+shape.volume())){
                listForBox.add(shape)
                true
            }else{false}
        }
    }
}
fun <T:Prism> print(prism: T){
    println(prism.h1)
}

abstract class Shape(){
    abstract fun volume():Double
}

class Cercle(var r:Double):Shape(){
    override fun volume():Double{
        return (4.0/3.0* PI *r.pow(3))
    }
}

abstract class CircleShape(r:Double,h:Double):Shape(){
}

class Cone(r:Double,h:Double):CircleShape(r,h){
    var r=r
    var h=h
    override fun volume():Double{
        return  (1.0/3.0* PI *r.pow(2)*h)
    }
}

class Cylinder(r:Double,h:Double):CircleShape(r,h){
    var r=r
    var h=h
    override fun volume():Double{
        return ( PI *r.pow(2)*h)
    }
}

abstract class Parallelepipeds(s:Double,h:Double):Shape(){
}

class Pyramid(s: Double,h: Double):Parallelepipeds(s,h){
    var s1=s
    var h1=h
    override fun volume():Double{
        return (1.0/3.0*s1*h1)
    }
}

class Prism(s: Double,h: Double):Parallelepipeds(s,h){
    var s1=s
    var h1=h
    override fun volume():Double{
        return (s1*h1)
    }
}

fun main() {
    var box = Box(5.0)
    println(box.add(Prism(1.0, 1.0)))
    println(box.add(Prism(2.0, 1.0)))
    println(box.add(Prism(2.0, 1.0)))
    println(box.add(Prism(1.0, 1.0)))
    print(Prism(12.0, 33.0))
}