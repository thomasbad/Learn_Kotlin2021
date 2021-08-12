//defining function -1

fun main() {
    var s = sum(10, 100)
    println("s = $s")
    var s2 = sum(20, 200)
    println("s2 = $s2")
    println("s3 = " + sum(30, 300))
    println("s4 = " + sum(40, 400))
    println("s3 + s4 = " + sum(sum(30, 300), sum(40, 400)))
}

fun sum(a: Int = 1, b: Int = 2): Int {
//contain default value a = 1 and b = 2
    //println("sum() is called")
    // println("a = $a")
    // println("b = $b")
    // println("sum = ${a+b}")
    //return a + b
    var total = a + b
    return total
}