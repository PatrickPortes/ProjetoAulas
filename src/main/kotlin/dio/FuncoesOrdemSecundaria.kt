fun main(args: Array<String>) {

    val z: Int

    z= calculate(34,98){a,b -> a*b}
    println(z)

}

fun sum(a1:Int, a2:Int) = a1.plus(a2)

fun calculate(n1:Int, n2:Int, operation: (Int,Int)->Int): Int{
    val result = operation(n1,n2)
    return result
}