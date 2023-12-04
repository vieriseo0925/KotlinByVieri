val numbers = intArrayOf(5,10,15)

// 값만 필요할 때
for (number in numbers) { // foreach와 동일
    println(number)
}
// 값과 인덱스 모두 필요할 때
println("When we need index and value")
for ((index, value) in numbers.withIndex()){
    println(index)
    println(value)
}
// 값과 인덱스 모두 필요할 때
println("When we need index and value and use of withIndexed")
for ((index, value) in numbers.withIndex()) { // foreachindexed와 동일!!
    println(index)
    println(value)
}

// 인덱스만 필요할 때
for (index in numbers.indices){
    println(index)
}
println("\r")

// 본문에서 사용될 변수이름을 기본 제공으로 사용
numbers.forEachIndexed {
        index, i ->
}
////본문에서 사용될 변수이름을 변경해서 사용
numbers.forEachIndexed { index, value ->
} // i를 value로 바꿔서 사용할 수 있다.


