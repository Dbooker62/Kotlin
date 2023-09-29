import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
// Define the Employee class with private properties for employee information.
class Employee(
    private var id: Int,          // Employee ID
    private var name: String,     // Employee Name
    private var email: String,    // Employee Email
    private var homePhone: String, // Home Phone Number
    private var workPhone: String, // Work Phone Number
    private var cellPhone: String // Cell Phone Number
) {

    // Method to display employee information
    fun displayEmployeeInfo() {
        // Display employee details using println statements
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
