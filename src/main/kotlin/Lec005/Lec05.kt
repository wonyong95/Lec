package Lec005

fun validateScoreIsNotNegative(score: Int){
    if(score < 0){
        throw IllegalArgumentException("${score}는 0보다 작을 수 없다")
    }


}
fun check(){
    
}