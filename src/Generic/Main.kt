package Generic

fun main(){
    val array= arrayOf(2,3,4,5,6)
    val array2= arrayOf("akhi","pakhi","jol")

    val ar= Gene(array)
    ar.check(4){index, element ->
        println("Index: $index")
        println("Element: $element")
    }

    val ar2= Gene(array2)
    ar2.check("pakhi"){index, element ->
        println("Index: $index")
        println("Element: $element")
    }
}