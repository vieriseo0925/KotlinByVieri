// If

// 5. 비교연산자
//- >, >=, <, <=,
//    - A > B
//    - A <= B
//- ==
//    - A == B
//    - 같은가?
//- !=
//    - A != B
//    - 다른가?
//- ===
//    - A === B
//    - 객체가 같은가?
//- !==
//    - A !== B
//    - 객체가 다른가?
//
//- ★ 비교연산자의 결과는 항상 Boolean으로 나온다
val number1: Int = 20 // 10-> 20
if(number1 == 10) { // 조건식은 무조건 true 또는 false 결과가 나와야한다.
    // 위 조건을 만족하는 경우
    println("10 입니다.")
} else if (number1 == 20){  // else if나 else는 없앨 수도 있다.
    // 위 조건을 만족하는 경우
    println("20 입니다.")
} else {
    // 위 2가지 조건을 모두 만족하지 않은 경우
    println("10,20 둘다 아닙니다.")
}
// 코드 짧게 쓰는 방법(조건이 간결한 경우)
if (number1 == 10) println("10입니다.")
else if (number1 == 20) println("20입니다.")
else println("10, 20 둘다 아닙니다.")

val number2 : Int = 10 + 20 // 값이 오면 된다. -> 식이와도 된다.
val number3 : Int = if (number2 > 30) 40 else 50
println(number3)

// 표현과 식
// 표현
// - 어떤 것을 표현 하기 위해서 사용되는 문법적인 요소
// val, var, Int(자료형), Short → 키워드)
// 식 값을 만들어 낸다.
// - 값을 만들어 낸다.
// - 10+20, 10*20

// [when]
val number4 : Int = 5
when(number4){
    5 -> {
        println("5입니다.")
    }
    6-> {
        println("6입니다.")
    }
    else ->{
        println("모르겠습니다.")
    }
}

when (number4){
    5-> println("5입니다.")
    6-> println("6입니다.")
    else -> println("모르겠습니다.")
}

when (number4){
    4 -> println("number is 4")
    //"안녕하세요." -> println("hello")
    //is Boolean -> println("boolean")
}
when (number4){
    in 1..10 -> println("number is in 1..10") // number4 in 1..10 -> Boolean
    in 20..30 -> println("number is in 1..10")
    in 40..60 -> println("number is in 1..10")
}








