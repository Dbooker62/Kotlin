import java.util.Scanner



fun main() {
    val scanner = Scanner(System.in)

    val customers = mutableListOf<Customer>()

    while (true) {
        println("Menu:")
        println("1. Residential Customer")
        println("2. Commercial Customer")
        println("3. Done")

        try {
            val choice = scanner.nextInt()

            when (choice) {
                1 -> {
                    // ... (Residential customer input)

                    val residential = Residential(name, phone, address, squareFootage, isSenior)
                    customers.add(residential)
                    residential.displayQuote()
                }
                2 -> {
                    // ... (Commercial customer input)

                    val commercial = Commercial(name, phone, address, squareFootage, propertyName, hasMultiProperty)
                    customers.add(commercial)
                    commercial.displayQuote()
                }
                3 -> {
                    println("Thank you for using our service!")
                    return
                }
                else -> {
                    println("Invalid choice. Please choose a valid option.")
                }
            }
        } catch (e: InputMismatchException) {
            println("Invalid input. Please enter a valid number.")
            scanner.nextLine() // Clear the invalid input from the scanner
        }
    }
