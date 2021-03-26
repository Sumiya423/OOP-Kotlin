package MyArray
//LEMDA FUNCTION
//multiple value pele return korte pare
class ArrayClass(private val array: Array<Int>) {


    fun check(a:Int,found:(index:Int,element:Int?) -> Unit){ //function er maddhome return korbo--lemda function
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