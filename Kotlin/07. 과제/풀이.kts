// 1번 문제 풀이
val A : Int = 10
val B : Int = 10
val C : Boolean = if (A == B) true else false
println(C)
// 자료형이 다르면 비교연산자를 사용할 수 없다.

// 2번 문제 풀이
val AA : Int = 10
val BB : Int = AA * 2
println(BB)

// 3번 문제 풀이 (if)
fun checkGradeIf(score : Int): String {
    if (score>= 90) return "A학점"
    else if (score >= 80) return "B학점"
    else if (score >= 70) return "C학점"
    else return "F학점"
}

// 3번 문제 풀이 (when)
fun checkGradeWhen(score : Int): String {
    when (score){
        in 90..100 -> return "A학점"
        in 80..90 -> return "B학점"
        in 70..80 -> return "C학점"
        else -> return "F학점"
    }
}
val result: String = checkGradeWhen(score = 90)
println(result)

// 4번
fun gradeTest(correctCount : Int): Int {
    return correctCount * 5
}
fun gradeTest2(correctCount : Int) : Int = correctCount * 5
println(gradeTest(correctCount = 10))
println(gradeTest(correctCount = 10))

// 5번
fun plusTwoNumber(firstNum: Int?, secondNum: Int?): Int {
//    // 함수에서 받은 인자 firstNum, secondNum -> val 이다.
//    if (firstNum == null){
//        firstNum = 0
//    }
//    if (secondNum == null) {
//        secondNum = 0
//    }
//    return firstNum + secondNum
    val first : Int     = if (firstNum == null)     0 else firstNum
    val second : Int    = if (secondNum == null)    0 else secondNum
    return first + second
}
println(plusTwoNumber(null, null))

//5번 다른 문제 풀이
//
fun plusTwoNumber1(firstNum: Int?, secondNum: Int?): Int {
    val firstNum : Int  = if (firstNum == null)     0 else firstNum
    val secondNum : Int = if (secondNum == null)    0 else secondNum
    return firstNum + secondNum
}