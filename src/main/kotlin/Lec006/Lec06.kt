package Lec006

fun main(){
    val numbers = listOf(1L, 2L, 3L)
    for(number in numbers){
        println(number)
    }
}

fun main1(){
    for(i in 1..3){
        println(i)
    }
    for(e in 3 downTo 1){
        println(e)
    }
    for(z in 1..5 step 2){
        println(z)
    }

}