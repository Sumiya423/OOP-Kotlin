package Collections

fun main(){
    val user= mapOf<Int,String>(1 to "akhi",2 to "Pakhi")
    user.forEach { t, u ->
        println("$t -> $u")
    }

    val user2= mutableMapOf<String,String>("one" to "Alex","two" to "Boby")
    user2.forEach { t, u ->
        println("$t -> $u")
    }

    user2["three"]="Akhi"
    user2.forEach { t, u ->
        println("$t -> $u")
    }

}