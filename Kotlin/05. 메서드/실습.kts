var number100: Int = 100 // 전역변수

// 함수를 선언하는 방법
fun plusNumbers(firstNum:Int, secondNum: Int) : Int {
    val result : Int = firstNum + secondNum
    return result
}

// 함수를 사용(호출)하는 방법
plusNumbers(firstNum = 10, secondNum = 20) // 30
plusNumbers(10, 20) // 30

val result : Int = plusNumbers(firstNum = 5, secondNum = 7)
println(result)

// 기본값이 있는 함수
fun plusNumbersWithDefault(firstNum: Int, secondNum: Int = 10): Int{
    return firstNum + secondNum
}
val result2 : Int = plusNumbersWithDefault(firstNum = 10)
println(result2)
val result3 : Int = plusNumbersWithDefault(firstNum = 10, secondNum =  20)
println(result3)

// 반환값이 없는 함수를 선언하는 방법
fun plusNumbersWithNoReturn(firstNum: Int, secondNum: Int):Unit {
    val result: Int = firstNum + secondNum
    println(result)
}
fun plusNumbersWithNoReturn2(firstNum: Int, secondNum: Int) {
    val result: Int = firstNum + secondNum
    println(result)
}
fun plusNumbersWithNoReturn3(firstNum: Int, secondNum: Int) {
    val result: Int = firstNum + secondNum
    println(result)
    return // 기본값이 없는 함수 생성 시에는 'return'만 적어야 한다.
}
// plusNumbersWithDefault(100,200)
plusNumbersWithNoReturn2(100,200)
plusNumbersWithNoReturn3(100,200)

// 함숫선언을 간단하게 하는 방법
fun shortPlusNumbers(firstNum: Int, secondNum: Int) = firstNum + secondNum // 라인이 줄어든다. 큰 의미는 없어 보임.. ㅋ
val result10 : Int = shortPlusNumbers(firstNum = 10, secondNum = 100)
println(result10) // 110

// 가변인자를 갖는 함수
fun plusMultipleNumbers(vararg numbers: Int): Unit {
    for (number in numbers)
    println(number)
} // numbers 들어온 값들을 하나하나 돌면서 println을 진행한다.
plusMultipleNumbers(1,2,3,4,5)

number100 = 200
println(number100)






