//variable number of function parameters

fun main() {
    sum(2)
    displayStrings("one", "two", "three", "four", "five")
}

fun sum(vararg numbers: Int) {
    for (n in numbers){
        println(n)
    }
}

fun displayStrings(vararg strings: String){
    for (s in strings) {
        println(s)
    }
}

//output:
// 2
// one
// two
// three
// four
// five