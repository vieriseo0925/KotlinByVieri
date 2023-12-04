
// range
for (value in 0..2) {
    println("반복 1")
}
println("\r")
// progression + step
for (value in 0..5 step(2)){ // 0 -> 2 -> 4
    println("반복 2")
}
println("\r")
// progression + downTo
for (value in 5 downTo 0){ // 5->0
    println("반복 3")
}
println("\r")
// -> Iterable 이론편 펴기!!

val numbers = listOf<Int>(0,1,2,3)
for (number in numbers){
    println(number)
}
println("\r")
for (i in 0..numbers.size){ // 0->4까지 반복문을 5회 돈다.
    println("반복 4")
}
println("\r") // 자습한 것인디.. /r 한줄 바꿈
for (i in 0 until numbers.size){ // 0->3 총 4회 돈다. until 뒤는 열린 구간이다!!
    println("반복 5")
}
println("\r")
for ((index, number) in numbers.withIndex()){
    println(""+index+" | "+ number)
}
println("\r")
// foreach
numbers.forEach{
    println(it)
}
println("\r")

numbers.forEach{number ->
    println(number)
}