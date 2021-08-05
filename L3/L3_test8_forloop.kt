fun main() {
    for (index in 1..5)
    //Named a var as 'index', then put 1 to 5 in var
        println("Value of index is $index")
    for (index2 in 100 downTo 90){
    //use downTo function to count back down reverse to '..'
        print("$index2..")
    }
    var names = arrayOf("Apple", "Ben", "Cathay", "Danny", "Eva")
    for (i in 0..4)
    println(names[i])
    for (n in 1 until 10){
        println("$n.. ")
        //this will print from 1 to 9
    }
    for (n in 1 until 10 step 2){
        println("$n.. ")
        //this will print from 1 to 9 step 2
    }
}