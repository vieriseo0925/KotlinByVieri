// 함수, 파라미터..
fun repeatText(repeatText:String, repeatNumber: Int) {
    for (i in 0..repeatNumber - 1) println(repeatText) // for ( i in 1..repeatNumber) println(repeatText)
    // for (i in 0 until repeatNumber) println(repeatText)
}
// repeatText("안녕", 3)

fun sumUntil(givenNumber:Int): Int {
    var sum : Int = 0
    for (i in 1..givenNumber) sum += i
    return sum
}
//sumUntil(10)

fun sum7s(): Int {
    var sum: Int = 0
    for (i in 0..100) {
        if (i % 7 == 0) sum += i
    }
    return sum
}
//sum7s()

fun increaseOne(numberUnder100: Int) {
    var givenNumber: Int = numberUnder100   // 함수인자를 variable 변수 givenNumber로 받는당!
    while (givenNumber < 100)  {
        givenNumber++
        println("up")
    }
    return
        // 함수 인자(numberUnder100)로 받는 값은 var로 받을 수 없어서 에러가 난다!!!! // 그래서 ↑
}
//increaseOne(13)

fun checkPassorNot(examScores:List<Int>):BooleanArray {
    val resultArray = BooleanArray(examScores.size, {false}) // 배열 공부할 때, 크기만 설정 해주고 값은 Default로 설정하는 방법..
    examScores.forEachIndexed { index, score ->
        if (score >= 80) resultArray[index] = true
//        else resultArray[index] = false -> 36번째 행에 resultArray에 BooleanArray Default값을 false로 넣어줬기 때문에 생략이 가능하다.
    }// -> 2.배열을 선언하는 방법(2) - 자료형/생략Array(크기, {값 / 생략가능})
    return resultArray
}
//val result = checkPassorNot(listOf<Int>(70,71,72,77,78,79,80,82,90,99))
//result.forEach {
//    println(it)
//}

fun findSumIsSixFromDice():List<List<Int>> {
    val resultList = mutableListOf<List<Int>>()
    for (i in 1..6) {
        for (j in 1..6) {
            if (i + j == 6) {
                val temp = listOf<Int>(i,j)
                resultList.add(temp)
            }
        }
    }
    return resultList
}//중첩 리스트(리스트 안에 있는 리스트

//println(findSumIsSixFromDice())

fun eatUntilNothungry(totalCount: Int, currentCount: Int) { // do-while을 쓰는 함수..
    var currentCountCopy: Int = currentCount
    do {
        println("밥을 먹었다.")
        currentCountCopy++
    } while (currentCountCopy < totalCount)
    println("배가 부르다.")
}
// eatUntilNothungry(10, 11)

fun killNthArmy(firstArmy: List<String>, secondArmy: List<String>, killNth: Int)
    : List<List<String>>? { // Null이 올 수 있기 때문에 non-null type이 올 수 없으므로 ? 사용하여 nullable로 바꿔야 한다.
    // 함수 인자 firstArmy, secondArmy는 immutable이기 때문에 "복사(Copy)"를 해서 variable 변수로 처리해야 한다.
    if(firstArmy.size < killNth || secondArmy.size < killNth) return null
    val firstArmyTemp = mutableListOf<String>()
    val secondArmyTemp = mutableListOf<String>()
    for ((index, army) in firstArmy.withIndex()) {
        if (index != killNth) firstArmyTemp.add(army)
    }
    for ((index, army) in secondArmy.withIndex()) {
        if (index != killNth) secondArmyTemp.add(army)
    }
    // val result = List<List<String>>?(firstArmyTemp, secondArmyTemp)
    val result = listOf<List<String>>(firstArmyTemp, secondArmyTemp)
    // firstArmyTemp와 secondArmyTemp는 mutable이기 때문에 85행 List<List<String>> 85행 함수 리턴 타입 지정이 아니니
    // 86행처럼 변수 result를 중첩리스트(타입은 스트링) (리스트 안에 값은 firstArmyTemp, secondArmyTemp)로 바꾼다.
    return result
}
//println(
//    killNthArmy(firstArmy = listOf<String>("A", "B", "C", "D", "E"),
//                secondArmy = listOf<String>("A", "B", "C"), killNth = 2)
//)

fun gugudan(dan: Int) {
    val numbers = mutableListOf<Int>()
    for(i in 1..9) {
        numbers.add(dan*i)
    }
    println(numbers)
}
//gugudan(9)

fun splitNumbers(firstIntList: List<Int>, secondIntList: List<Int>): Map<String, List<Int>> {
    val result = mutableMapOf<String, List<Int>>()
    val totalIntList = mutableListOf<Int>()
    totalIntList.addAll(firstIntList)
    totalIntList.addAll(secondIntList)

    val evenNumber = mutableListOf<Int>()
    val oddNumber = mutableListOf<Int>()

    totalIntList.forEach { number ->
        if (number % 2 == 0) evenNumber.add(number)
        else oddNumber.add(number)
    }
    result.put("짝수", evenNumber)
    result.put("홀수", oddNumber)
    return result
}
println(
    splitNumbers(
        listOf<Int>(1,2,3,4,5), listOf<Int>(6,7,8,9,10)
    )
)