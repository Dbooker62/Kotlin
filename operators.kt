fun main(args: Array<String>) {
    val num1 = 10
    val num2 = 5
    val sum = num1 + num2
    println("$num1 + $num2 = $sum (Is it true? ${num1 + num2 == sum})")


    val greater = num1 > num2
    println("$num1 > $num2 is $greater")


    val isBothTrue = true && false
    println("true && false is $isBothTrue")


    val isEqual = num1 == num2
    println("$num1 == $num2 is $isEqual")


    var x = 10
    x += 5
    println("x += 5 results in x = $x")


    val isNotTrue = !true
    println("!true $isNotTrue")
}
