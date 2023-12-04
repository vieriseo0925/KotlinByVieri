// BREAK 중첩반복문
for (i in 1..3){
    for(j in 1..3) {
//        if (j==2) break
//        else println("j")
        println("j")
    }
}
println("\r")
// j -> 2 일 때, Break 걸려서 가장 가까운 for문은 탈출한다.
println("Break 테스트")
for (i in 1..3){
    println("i : " + i)
    for(j in 1..3) {
        if (j==2) break // 가장 "가까운" for문을 탈출!
        else println("j : " + j)
    }
}
println("\r")
// 이중중첩까지는 많이 사용하지만, 그 이상 중첩은 사용하지 않는다.
for (i in 1..3){
    println(i)
    for(j in 1..3) {
        println(j)
    }
}
println("\r")


println("Return 테스트")
fun returnFunction():Unit {
    for (i in 1..3) {
        println("i : " + i)
        for (j in 1..3) {
            if (j == 2) return // 가장 가까운 함수(Function)에서 탈출!
            else println("j : " + j)
        }
    }
}
// i1 -> j구1/구문1 -> j1/구문2 -> j2/문1
returnFunction()

println("Break, label 테스트")
loop@for (i in 1..3){
    println("i : " + i)
    for(j in 1..3) {
        if (j==2) break@loop // 가장 "가까운" for문을 탈출! (여기서는 j반복문이 break 되면
                            // j반복문으로 나오므로 label을 지정하지 않아도 된다.
                            // i1 -> j1구문1 -> j1구문2 -> j2구문1 -> loop탈출(i반복문)
        else println("j : " + j)
    }
}
println("\r")
// Continue (Continue 이하를 "생략!!" 할 것인지)
println("Continue 테스트")
for (i in 1..3){
    println("i : " + i)
    for(j in 1..3) {
        if (j==2) continue // 가장 가까운 루프(for) "시작점"으로 탈출
        else println("j : " + j)
    }
}
println("\r")
// Continue & Label
println("Continue label 테스트")
loop@for (i in 1..3){ // i반복문
    println("i : " + i)
    for(j in 1..3) { // j반복문
        if (j==2) continue@loop // 구문1 루프로 이동!!
        else println("j : " + j) // 구문2
    }
} // i1 -> j1/구문1 -> j1/구문2 -> j2/구문 -> i2 -> j1/구문2 -> i3 -> j1/구문1 -> j1/구문2
println("\r")

// foreach
// foreach는 "Continue"와 "Break"를 사용 불가
println("foreach 실습")
listOf(1,2,3).forEach loop@{
    if(it==2) return@loop
    else println(it)
}
