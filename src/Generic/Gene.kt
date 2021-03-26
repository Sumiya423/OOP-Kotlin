package Generic

class Gene<T> (private val array: Array<T>) { //alada vabe T use kora hoy generic er jonno


    fun check(a:T,found:(index:Int,element:T?) -> Unit){
        for(i in array.indices){
            if(array[i]==a){
                found(i,array[i])
                return
            }
        }
        found(-1,null)
        return
    }
}