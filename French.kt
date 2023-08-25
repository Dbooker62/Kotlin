fun main() {
    println("Please enter a number between 1 and 10: ")
    
    
    val number = readLine()?.toIntOrNull()
    
    
    val numberNameInFrench = when (number) {
        1 -> "un"
        2 -> "deux"
        3 -> "trois"
        4 -> "quatre"
        5 -> "cinq"
        6 -> "six"
        7 -> "sept"
        8 -> "huit"
        9 -> "neuf"
        10 -> "dix"
        else -> "unknown" 
    }
    
    
    println("The number $number is $numberNameInFrench in French.")
}
