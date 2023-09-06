import java.util.Scanner
import kotlin.math.PI
import kotlin.math.pow

fun main() {
    val scanner = Scanner(System.`in`)
    displayMenu()
    val choice = scanner.nextInt()

    when (choice) {
        1 -> calculateSquareArea(scanner)
        2 -> calculateCircleArea(scanner)
        3 -> calculateTriangleArea(scanner)
        4 -> calculateRectangleArea(scanner)
        else -> println("Invalid choice. Please select a valid option (1-4).")
    }
}

fun displayMenu() {
    println("Select a shape to calculate its area:")
    println("1. Square")
    println("2. Circle")
    println("3. Triangle")
    println("4. Rectangle")
    print("Enter your choice: ")
}

fun calculateSquareArea(scanner: Scanner) {
    print("Enter the side length of the square: ")
    val sideLength = scanner.nextDouble()
    val area = sideLength * sideLength
    println("The area of the square is $area square units.")
}

fun calculateCircleArea(scanner: Scanner) {
    print("Enter the radius of the circle: ")
    val radius = scanner.nextDouble()
    val area = PI * radius.pow(2)
    println("The area of the circle is $area square units.")
}

fun calculateTriangleArea(scanner: Scanner) {
    print("Enter the base length of the triangle: ")
    val base = scanner.nextDouble()
    print("Enter the height of the triangle: ")
    val height = scanner.nextDouble()
    val area = 0.5 * base * height
    println("The area of the triangle is $area square units.")
}

fun calculateRectangleArea(scanner: Scanner) {
    print("Enter the length of the rectangle: ")
    val length = scanner.nextDouble()
    print("Enter the width of the rectangle: ")
    val width = scanner.nextDouble()
    val area = length * width
    println("The area of the rectangle is $area square units.")
}
