fun main(args: Array<String>) {
    println("Hello World!")
    print("hello")
    print(" kotlin!")

    println()
    val sum = sum1(1, 2)
    println(sum)

    // A function body can be an expression. Its return type is inferred.
    // 간단한건 아래처럼 함수를 선언해도 될거같긴한데..음............
    // 일케하면 장점이 뭐지?
    fun sum2(a: Int, b: Int) = a + b
    val sum2 = sum2(1, 100)
    println(sum2)

    // 컴파일러가 리턴타입 무시도 한다는건가?
    printSum(1,2)

    val a: Int = 1  // immediate assignment
    val b = 2   // `Int` type is inferred
    val c: Int  // Type required when no initializer is provided
    c = 3       // deferred assignment

    // val와 var의 차이?
    // val -> readonly
    // var -> reassign-able

    val rectangle = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle.perimeter}")
}

fun sum1 (a: Int, b: Int): Int {
    return a + b
}

fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

class Shape

class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2
}
