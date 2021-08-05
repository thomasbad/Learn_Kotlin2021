fun main() {
    val username: String? = null
    val length = username!!.length
    //!! is a not-null assertion which will remove all restriction and safe check unlike ? safe check operator
    //It will run directly and crash without sepecific warning
}