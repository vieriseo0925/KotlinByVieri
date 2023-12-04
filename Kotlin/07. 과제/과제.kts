// 1. 변수 A와 B를 선언하고, 두 변수의 값이 같은 경우에는 true, 그렇지 않은 경우에는 false가 되는 변수 c를 선언한다
//   단 변수 A와 B의 자료형은 자유이지만 에러가 발생하면 안된다
val a = 1
val b = 2
val c : Boolean = a == b
println(c)

//2. 정수형 변수 A를 선언하고, 변수 B를 선언 한다 이때 변수 B는 A의 두배가 되어야 한다
val a1 : Int = 10
val b2 : Int = a1 * 2
println(b2)

//   3. 학생의 시험 점수를 넣어주면 학점을 반환하는 함수를 만드시오
//   (90점 이상 A학점, 80~89점은 B학점, 70~79점은 C학점, 그렇지 않으면 F학점)
fun convertScoreToGrade(StudentAScore: Int){
    when(StudentAScore) {
        in 90..100 -> println("A학점")
        in 80..89 -> println("B학점")
        in 70..79 -> println("C학점")
        in 0.. 69 -> {println("F학점")}
    }
}
convertScoreToGrade(StudentAScore = 90)

// 4. 학생이 시험에서 맞은 문제의 갯수를 넣어주면 시험 점수(정수)를 반환하는 함수를 만드시오
//   (시험 문제는 총 20문제이고 만점은 100점)
fun convertNumberToScore(Number: Int): Int{
    val ScorePerOneNumber: Int = 100 / 20
    val TotalScore: Int = Number * ScorePerOneNumber
    return TotalScore
}
convertNumberToScore(Number = 16)

//5. nullable 정수형 두개를 받는 함수를 만든다. 이 함수는 받은 인수의 합을 반환한다
//   이때 인수중에 null 이 있으면 0으로 취급하여 합을 구한다

//fun nullablePlusInt(firstNum: Int? = null, secondNum: Int? = null): Int{
//    val result: Int? = firstNum + secondNum
//    return result
// }
// nullablePlusInt(1,5)