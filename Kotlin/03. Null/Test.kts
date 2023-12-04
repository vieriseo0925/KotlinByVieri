val number: Int? = null // null이 들어갈 수 있는 변수 -> nullable
// val number2 : Int = null // null이 들어갈 수 없는 변수 -> non-null
// println(number)
val num1: Int = 2+5
val num2: Int = 10
val num3: Int = num1 + num2
println(num3)


val number2: Int? = 3 + 5
val number3: Int? = 10

val number4: Int? = number2!! + number3!! // 어떻게 될까?
println(number4)
// !!로 null이 아님을 개발자가 보장할 수 없다.
// - 하지만 실제로 null인 경우에는 NPE(NullPointException이 발생할 수 있다.)
// - 결론 : 정말 100% 확신이 있는 경우가 아니면 사용하지 말자!!
// 변수 선언 + 할당
var number5: Int = 10
number5 = 100

if(null == 5) { // == 비교연산은 가능하다.
    println("same")
}   else{
    println("not same")
}

if(null == null) {
    println("same")
}   else{
    println("not same")
}