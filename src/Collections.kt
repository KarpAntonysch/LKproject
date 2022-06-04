


fun main(){
    val list2=listOf(1,2,3,4)
    data class Persons(
        var name:String,
        var age:Int
    )
    var personList= listOf(Persons("N",12),Persons("Q",23))

    println(list2.fold(1){ total, next -> total+next})
    println(list2.reduce{ total, next -> total+next})

    println(list2.runningReduce{ total, next -> total+next})

    println(list2.foldRight(1){ element, sum -> sum-element})
    println(list2.reduceRight(){ element, sum -> sum-element})

    println(personList.maxByOrNull { it.age })

    println(listOf(1, 2, 3, 4, 5).drop(2)) // [3, 4, 5]
    println(listOf(1, 2, 3, 4, 5).dropWhile({ it < 4}))  // [ 4, 5]
    println(listOf(1, 2, 3, 4, 5).dropLastWhile { it > 4 })  // [1, 2, 3, 4]
    val list1 = mutableListOf(5, 9, 1)
    list1.sort()
    println(list1)

    val list = listOf(1, 2, 3, 4, 5)

    println( personList.plus(Persons("A",22)))
    println(list.plus(6)) // новый список [1, 2, 3, 4, 5, 6]
    println(list) // старый список [1, 2, 3, 4, 5]4

    val names = listOf("Барсик", "Мурзик", "Рыжик")
    val sizes = listOf("большой", "средний", "совсем котёнок")
    val catMap = names.zip(sizes).toMap()
    println(catMap)
// обращаемся к ключу
    println(catMap["Рыжик"]) // совсем котёнок
    val listA = mutableListOf("a", "e", "b")
    val listB = mutableListOf("a", "c", "d", "e", "f")
    val listC = listB.union(listA)
    println(listC)


        val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)
        val anotherMap = mapOf("key2" to 2, "key1" to 1, "key4" to 1, "key3" to 3)

        println("The maps are equal: ${numbersMap == anotherMap}") // The maps are equal: true


}