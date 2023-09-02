package Lec005

fun validateScoreIsNotNegative(score: Int){
    if(score !in 0..100){
        throw IllegalArgumentException("score의 범위는 0부터 100입니다")
    }


}
fun getPassOrFail(score: Int): String{
    return if(score >= 50){
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return if(score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "D"
    }
}

fun getGradeWithSwitch(score: Int): String {
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun startWithA(obj: Any): Boolean{
    return when(obj){
        is String -> obj.startsWith("A")
        else -> false
    }

}

fun judgeNumber2(number: Int){
    when{
        number == 0 -> println("주어진 숫자는 0입니다")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다")
        else -> println("주어진 숫자는 홀수입니다")
    }
}