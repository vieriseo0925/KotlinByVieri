// 1번) 주어진 문자를 N번 반복해서 출력하는 함수를 만들어 보자
// 함수 안에 for(루프)를 사용하고, 함수 인자에 문자, 횟수(숫자)를 넣어서 문자를 횟수만큼 반복하는 것
//fun RepeatChracter(var Chracter : String, var Repeat : Int){
//    for(value in 0..Repeat){
//        println(Chracter)
//    }
//}
//
//RepeatChracter(A,5)

fun repeatChracter2(repeatChracter: String, repeatNumber: Int) {
    for (i in 0..repeatNumber - 1) println(repeatChracter)
}
repeatChracter2("A", 5)

// 2번) 1부터 주어진 숫자까지의 합을 구하는 함수를 만들어 보자.
// for(루프)를 이용해 숫자를 더하는 것을 반복 함.
fun sumUntilgivenNumber(givenNumber: Int): Int{
    var sum1: Int = 0
    for (number in 1..givenNumber) sum1 += number
    return sum1
    }
sumUntilgivenNumber(10)

// 3번) 1부터 100까지의 수중에서 7의 배수의 합을 구하는 함수를 만드시오
//fun sumOf7S(sum: Int): Int{
//    var sum: Int = 0
//        if (sum<=100) {
//            for (i in 1..100)
//            {
//            sum += 7 * i
//            return sumOf7S()
//            }
//    }
//    else println(sum)
//}
// for루프 안에 조건절(if)을 넣어서 7의 배수를 i%7으로 표현함
fun sumOf7s(): Int{
    var sum2: Int = 0
    for (i in 0..100) {
        if (i % 7 == 0) sum2 += i
    }
    return sum2
}
sumOf7s() // return을 주게 되면 가장 가까운 함수에서 탈출해서인가? 위의 2번 함수가 출력되지 않는다.

// 4번) 100 보다 작은 숫자를 넣어주면, 1씩 증가를 시키고 100 이 되면 종료되는 함수를 만드시오
// 참인 동안 반복 While을 활용
//fun increaseNumberBy100(numberUnder100: Int) {
//    var givenNumber: Int = numberUnder100
//    for (givenNumber in 1..numberUnder100) { // for로 해결하려고 했는데 잘 안되네...
//        if (givenNumber < 100) {
//            givenNumber++
//        } else println(givenNumber)
//    }
//}
//increaseNumberBy100(97)

fun increaseNumberBy100(numberUnder100: Int) {
    var givenNumber: Int = numberUnder100
    while (givenNumber < 100) {
        givenNumber++
        println("up")
    }
    return
}
increaseNumberBy100(97)

// 5번)  시험 성적 리스트 [70,71,72,77,78,79,80,82,90,99]
//   와 동일한 크기의 배열을 만들고, 합격이면 true, 불합격이면 false를 담는 함수를 만드시오
//   (80점 이상 부터 합격, 정답 예시 (False,False,...))

//var array1 = arrayOf<Int>(70,71,72,77,78,79,80,82,90,99)
//fun decisionTrueOrFalse(array1){
//    for(i in 0..array1.size){
//        if(array1[i]<=80) println("합격")
//        else println("불합격")
//    }
//}
// ChatGpt에서 만들어 준 소스.. 대박이다!!!
fun PassOrNotpassDecide(array1: Array<Int>){ // 2. 함수 인수에 array1: Array<Int> 넣어 배열 자체가 들어가서 too many argument 에러를 안 나게 해준다.
        for (value in array1){
        if (value >= 80) {
            println("합격")
        } else {
            println("불합격")
        }
    }
}
val array1 = arrayOf<Int>(70,71,72,77,78,79,80,82,90,99)
PassOrNotpassDecide(array1) // 1. 함수 호출에 배열을 넣고

// 6. 두개의 주사위를 던졌을때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 함수를 만드시오
// 이건 내가 짜본 괘상한 코드이고.. ㅠㅠ
// fun TwoDicePlusToSix(array2: Array<Int>, array3: Array<Int>) {
////    for (value in array2){
////        for (value in array3){
////            if (array2+array3==6) {
////                println("["+array2+ "]" + "["+array3+ "]")
////            } else continue
////        }
////    }
////
////}
////val array2 = arrayOf<Int>(1,2,3,4,5,6)
////val array3 = arrayOf<Int>(1,2,3,4,5,6)

// ChatGpt 이용.. 정말 the most Incredible!!!
fun findDiceCombinations() {
    val diceValues = 1..6
    val combinations = mutableListOf<List<Int>>() // "중첩리스트" -> 리스트안에 있는 리스트

    for (i in diceValues) {
        for (j in diceValues) {
            if (i + j == 6) {
                combinations.add(listOf(i,j))
            }
        }
    }
    println(combinations)
}
findDiceCombinations()

// 배부르기 위해서 먹어야하는 총 밥먹기 횟수, 현재 밥먹은 횟수, 두개를 받는 함수를 만드시오
//   함수는 "밥을 먹었다" 한번 출력을 할때 마다 밥을 1회 먹은 것으로 간주를 하고,
//   배가 부를 때까지 밥을 먹여야 한다
//   배가 부를 경우에는 "배가 부르다" 를 출력한다
//   배가 아무리 불러도 최소 한번은 무조건먹는다
// 이건 코딩 처음부터 막히네.. 로직을 기준을 세워서 접근하자!!

fun eatRice(totalRiceCount: Int, currentRiceCount: Int){
    var riceEatenCount = currentRiceCount

    while (riceEatenCount < totalRiceCount){
        println("밥을 먹었다.")
        riceEatenCount++

        if (riceEatenCount >= 2 && riceEatenCount == totalRiceCount) {
            println("배가 부르다.")
        }
    }
}
eatRice(5,0)

// 8번)  병사 그룹 2개와 n번째 값을 넣어주면, 각각의 병사 그룹에서 n번째 병사를 제거하고, 두개의 병사
//   그룹을 합쳐주는 함수를 만드시오
// 내가 짠 코드.. ㅠㅠ 에러가 많다.. MutableList에 대한 이해가 상당히 부족하구먼...
//fun JoinTwoarrayAndRemoveNtimesValue(FirstGroup: List<String>, SecondGroup: List<String>, Ntimes: Int){
//    var RemoveNtimes = Ntimes
//    FirstGroup.remove(RemoveNtimes)
//    SecondGroup.remove(RemoveNtimes)
//    println(FirstGroup + "," + SecondGroup)
//}
//val FirstGroup = mutableListOf<String>("A","B","C","D","E")
//val SecondGroup = mutableListOf<String>("E","F","G","H","I")
//JoinTwoarrayAndRemoveNtimesValue()

// ChatGpt 소스
fun joinTwoArrayAndRemoveNthValue(FirstGroup: MutableList<String>, SecondGroup: MutableList<String>, Nth: Int): List<String>? {
    val indexToRemove = Nth - 1

    if (indexToRemove >= FirstGroup.size || indexToRemove >= SecondGroup.size){
        return null
    }

    FirstGroup.removeAt(indexToRemove)
    SecondGroup.removeAt(indexToRemove)
    val joinedArray = FirstGroup + SecondGroup
    return joinedArray
}
val FirstGroup = mutableListOf<String>("A","B","C","D","E")
val SecondGroup = mutableListOf<String>("E","F","G","H","I")
var Nth = 3

var result = joinTwoArrayAndRemoveNthValue(FirstGroup, SecondGroup, Nth)
if (result != null){
    println(result)
} else {
    println("함수 실행이 불가능 합니다. Null 값을 반환했습니다.")
}

// 9번) 단수를 입력 받아 해당 단수의 값을 리스트로 출력하는 함수를 만드시오
fun printMultiplicationTable(dan: Int) {
    val multiplicationTable = mutableListOf<Int>()

    for (i in 1..9) {
        multiplicationTable.add(dan * i)
    }

    println(multiplicationTable)
}
printMultiplicationTable(2)

// 10번) 숫자 리스트 두개를 넣어주면 짝수 홀수로 분리된 Map을 만드는 함수를 만드시오
//   (Map의 키는 짝수의 경우 "짝수", 홀수의 경우 "홀수" 한다)
// ChatGpt 소스코드
fun splitEvenOdd(numbers1: List<Int>, numbers2: List<Int>): Map<String, List<Int>> {
    val result = mutableMapOf<String, List<Int>>()
    // "filter"를 사용하여 numbers1과 numbers2 두 리스트에서 짝수와 홀수를 필터링 하여 저장한다.
    val evenNumbers = numbers1.filter { it % 2 == 0 } + numbers2.filter { it % 2 == 0 }
    val oddNumbers = numbers1.filter { it % 2 != 0 } + numbers2.filter { it % 2 != 0 }

    result["짝수"] = evenNumbers
    result["홀수"] = oddNumbers

    return result
}
val numbers1= listOf(1,2,3,4,5)
val numbers2 = listOf(6,7,8,9,10)

val resultMap = splitEvenOdd(numbers1, numbers2)
println(resultMap)

// 10번 풀이
fun splitNumbers(firstIntList: List<Int>, secondIntList: List<Int>): Map<String, List<Int>> {
    val result = mutableMapOf<String, List<Int>>()
    val totalIntList = mutableListOf<Int>()
    totalIntList.addAll(firstIntList)
    totalIntList.addAll(secondIntList)

    val eventNumber = mutableListOf<Int>()
    val oddNumber = mutableListOf<Int>()

    totalIntList.forEach { number ->
        if (number % 2 == 0) eventNumber.add(number)
        else oddNumber.add(number)
    }
    result.put("짝수", eventNumber)
    result.put("홀수", oddNumber)
    return result
}
println(splitNumbers(listOf<Int>(1,2,3,4,5), listOf(6,7,8,9,10)))