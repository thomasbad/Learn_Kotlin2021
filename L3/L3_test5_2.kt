//let function can shorten the result by convert the nullable type to a non-nullable type

fun main(){
    val firstNumber = 10
    val secondNumber: Int? = 20
    secondNumber?.let {
        val result = firstNumber.times( it )
        print(result)
    }
}