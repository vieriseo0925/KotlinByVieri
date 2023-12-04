// Range
val range1 = 1..10
println(range1)

val range2 = 1 until 10
println(range2)

val range3 = 'A'..'Z' // 코틀린은 알파벳의 순서를 알고 있다!!
println(range3)

//val range4 = 'ㄱ'..'ㅎ'
//range4.forEach { // 반복문을 통해 'ㄱ'부터 'ㅎ'까지 순서를 알고 있는지 테스트
//    println(it)
//}

// Progression
val range5 = 1..10 step 2 // (1,2,3,4,5,6,7,8,9,10) → (1,3,5,7,9)
// (1,2,3,4,5,6,7,8,9) → (1,3,5,7,9)
println(range5)
val range6 = 10 downTo 1 step 2
println(range6)
// Step
// - 특징 : step에 값과 상관없이 첫번째는 무조건 index 0 부터 시작한다.

// Collection이 iterable(반복) 하는지 확인!! Ctrl + 좌클릭하여 확인할 수 있다!!
val collection1 = listOf<Int>(1,2,3,4,5)
