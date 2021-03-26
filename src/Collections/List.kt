package Collections

fun main(){
    val names= mutableListOf<String>("absc","sgf","sgsfga")
    names.add(2,"Akhi")
    names.forEach{
        println(it)
    }


    /*val names= listOf<String>("absc","sgf","sgsfga")

    for(i in names){
        println(i)
    }
    println("-------")
    names.forEach{
        println(it)
    }*/
}