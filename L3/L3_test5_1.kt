fun main() {
    val firstNumber = 10
    val secondNumber: Int? = 20
    //Int? make secondNumber as a nullable var
    if (secondNumber != null) {
        val result = firstNumber.times(secondNumber)
        //use .times() to do the 10*20
        print(result)
    }
}