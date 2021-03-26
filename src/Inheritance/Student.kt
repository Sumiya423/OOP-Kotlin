package Inheritance

class Student(private var name:String,
              private var age:Int,private var cgpa:String):Human(name, age) {

    fun studentshow(){
        show()
        println("CGPA is : $cgpa")
    }

}