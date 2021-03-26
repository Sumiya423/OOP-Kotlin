package DataClass

fun  main(){
    var user=UserKot("akhi","23")
    println(user)

    user.name="sumiya"
    user.age="22"

    println("Name: ${user.component1()}")
    println("Age: ${user.component2()}")
}