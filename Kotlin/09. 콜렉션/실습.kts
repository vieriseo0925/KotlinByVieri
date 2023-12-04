// List
val numbers = listOf<Int>(1,2,3)
println(numbers)
println(numbers[0]) // 4~5번 라인은 배열과 동일하다.
println(numbers.get(1))
println(numbers.indexOf(2))
println(numbers.last())
println(numbers.first())

val number8 = mutableListOf<Int>(1,1,1,2,3)
println(number8.add(50))
println(number8.removeAt(0))

number8.addAll(2, listOf<Int>(100,100))
println(number8)
// number8.replaceAll(2)

// 불변인지.. 테스트!!
// 주석처리 numbers[0] = 3 //error: no set method providing array access 에러남

val number2 = mutableListOf<Int>(1, 2, 3)
number2[0] = 20
println(number2)

// Set
val number3 = setOf<Int>(1,1,1,3,3,4)
println(number3.contains(1))
println("containsTest: " + number3.contains(5))
println("containsAllTest: " + number3.containsAll(setOf<Int>(1,5))) // 1,5가 setOf에 다 있느냐? -> 거짓
println(number3)
val number5 = mutableSetOf<Int>(1,1,1,1,1,1,3,3,3,3,3,4,4,4,4,4)
println(number5)
number5.remove(1)
println("MutableSetOf Remove Test1 " + number5)
number5.remove(10)
println("MutableSetOf Remove Test2 " + number5) // 없는 element를 지워도 에러는 안 나네...

// Map
val number6 = mapOf<Int, String>(1 to "one", 2 to "two") // , 기준으로 2개(= 2쌍)이기 때문에 size는 4가 아니라 2다!!
println("number6 Keys Print: " + number6.keys)
println("number6 Values Print: " + number6.values) // 결과값이 collection<String>으로 나온다.
println("number6's size Print: " + number6.size)
println("number6 key 1's value Print: " + number6.get(1))
println("number6 key 2's value Print " + number6[2]) // 굳이 get을 쓰지 않아도 [키값] 넣어 줘도 출력이 된다!!
println("number6의 키 값을 출력하고 없으면 default를 출력-> " + number6.getOrDefault(1, "default"))
println("number6의 키 값을 출력하고 없으면 default를 출력-> " + number6.getOrDefault(3, "default"))
val number7 = mapOf<Int, String>(Pair(1,"one"), Pair(2,"two")) // Pair 사용법
println(number7)

