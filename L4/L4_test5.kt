fun main(){
    sum2(10)
    sum2(10, 20)
    sum2(10, 20, 30)
    sum2(10, 20, 30, 40)
}

fun sum2(vararg numbers: Int){

    var total = 0
    //pre-create var total as 0 for later use

    for (number in numbers){
        print("$number + ")
        total = total + number
    }
    //for loop function to loop all val appears in function call until the end, add it to total var until number variable
    //have a new number assigned, once end goes to next line

    println(" = $total")
    println("=================")
}