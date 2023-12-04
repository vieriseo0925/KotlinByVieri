val numbers = listOf<Int>(1,2,3)
try {
    numbers.get(5)
}catch (exception : Exception) {
    println(exception)
}

try {
    numbers.get(5)
} catch (exception : ArrayIndexOutOfBoundsException) {
    println("예외 발생 A")
}

try {
    numbers.get(5)
} catch (exception : IllegalArgumentException) { // try문에서 발생한
    // 에러는 ArrayIndexOutOfBoundsException인데 IllegalArgumentException이 인수에
    // 나오니까 바깥으로 나오게 된다.
    println("예외 발생 B")
}