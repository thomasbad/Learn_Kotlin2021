fun main(){
    sum2(10, 20, 30, 40)
}

fun sum2(vararg numbers: Int){

    var total = 0
    //pre-create var total as 0 for later use

    println("number of number: ${numbers.count()}")
    for ((index, number) in numbers.withIndex()){
        print(number)
        if (index < numbers.count() - 1){
            print(" + ")
        }
        total = total + number
    }
    println(" = $total")
    println("================")
}