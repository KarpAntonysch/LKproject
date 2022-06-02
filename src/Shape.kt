import java.util.*
import kotlin.math.PI
import kotlin.math.pow

data class Box(var vol:Double){
    var volume=vol
        set(value){
            if(value>0.0)
                field=value
        }
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
class Cone(var r:Double,var h:Double):CircleShape(r,h){
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
    var box = Box(6.0)
    println(box.add(Prism(1.0, 1.0)))
}