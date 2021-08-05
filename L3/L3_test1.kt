fun main() {    
    var x = "1111"
    //it caused x being recongized as String
    var y = 2222
    println(x+y)
    println(x.toInt()+y)
    //used lib '.toInt() to make x being used as Int
}