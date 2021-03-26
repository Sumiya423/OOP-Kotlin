package MyArray

class Test(private val array: Array<Int>) {
    var index:Int=-1
    var element:Int?=null

    fun check(a:Int):Pair<Int,Int?>{  //Triple<Int,Int,Int>
        for(i in array.indices){
            if(array[i]==a){
                index=i
                element=array[i]

                return Pair(index,element)//jodi peye jay tahole
            }
        }

        return Pair(index,element)
    }

}