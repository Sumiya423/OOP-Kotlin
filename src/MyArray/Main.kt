package MyArray

fun main(){
    val array= arrayOf(2,3,4,2,4,6,9)
    val  arrayTest=ArrayClass(array)
    arrayTest.check(4){index, element ->
      println("Index:$index")
      println("Element:$element")
    }

    /*val array= arrayOf(2,3,4,2,4,6,9)
    val  test=Test(array)
    val value=test.check(4)

    println("Index: ${value.first}")
    println("Element: ${value.second}")*/
}