import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
class Employee(
    private var id: Int,
    private var name: String,
    private var email: String,
    private var homePhone: String,
    private var workPhone: String,
    private var cellPhone: String
) {


    // Method to display employee information
    fun displayEmployeeInfo() {
        println("Employee ID: $id")
        println("Employee Name: $name")
        println("Employee Email: $email")
        println("Home Phone: $homePhone")
        println("Work Phone: $workPhone")
        println("Cell Phone: $cellPhone")
        println()
    }
}

fun main() {
    // Instantiate three Employee objects with provided information using the parameterized constructor
    val employee1 = Employee(1, "John Doe", "john@example.com", "123-456-7890", "987-654-3210", "555-555-5555")
    val employee2 = Employee(2, "Jane Smith", "jane@example.com", "111-222-3333", "999-999-9999", "666-666-6666")
    val employee3 = Employee(3, "Bob Johnson", "bob@example.com", "777-777-7777", "888-888-8888", "444-444-4444")

    // Display employee information
    println("Employee Information:")
    employee1.displayEmployeeInfo()
    employee2.displayEmployeeInfo()
    employee3.displayEmployeeInfo()
}
