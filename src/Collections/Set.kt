package Collections

fun main(){
    val names= setOf<Int>(1,2,3,3,5,6,6)//set multiple value accept kore nah
    names.forEach{
        println(it)
    }
    val names2= mutableSetOf<Int>(1,2,3,3,5,6,6)//set multiple value accept kore nah
    names2.add(4)
    names2.add(4)


    names2.forEach{
        println(it)
    }
}