//work similar as java switch case
fun main(){
    var x = 7
    when (x) {
        10 -> println("x is 10")
        9 -> println("x is 9")
        8 -> println("x is 8")
        7, 6, 5 -> println("others")
        in 4..2 -> println("in number")
        else -> println("else")
    }
}