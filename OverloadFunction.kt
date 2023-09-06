import java.util.Scanner


fun processResidentialCustomer(scanner: Scanner) {
    print("Enter your name: ")
    val name = scanner.nextLine()
    print("Enter your phone number: ")
    val phoneNumber = scanner.nextLine()

    println("\nResidential Customer Information:")
    println("Name: $name")
    println("Phone Number: $phoneNumber")
}


fun processBusinessCustomer(scanner: Scanner) {
    print("Enter your business name: ")
    val businessName = scanner.nextLine()
    print("Enter contact name: ")
    val contactName = scanner.nextLine()
    print("Enter business phone number: ")
    val phoneNumber = scanner.nextLine()

    println("\nBusiness Customer Information:")
    println("Business Name: $businessName")
    println("Contact Name: $contactName")
    println("Phone Number: $phoneNumber")
}

fun main() {
    val scanner = Scanner(System.`in`)

    println("Welcome to Customer Information System!")
    print("Are you a residential or business customer? (R/B): ")
    val customerType = scanner.nextLine().uppercase()

    when (customerType) {
        "R" -> processResidentialCustomer(scanner)
        "B" -> processBusinessCustomer(scanner)
        else -> println("Invalid customer type. Please enter 'R' for residential or 'B' for business.")
    }

    scanner.close()
}
