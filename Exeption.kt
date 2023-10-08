import java.util.Scanner

open class Customer(
    val customerName: String,
    val customerPhone: String,
    val customerAddress: String,
    val squareFootage: Double
)

class Commercial(
    customerName: String,
    customerPhone: String,
    customerAddress: String,
    squareFootage: Double,
    val name: String,
    val multiProperty: Boolean
) : Customer(customerName, customerPhone, customerAddress, squareFootage) {
    companion object {
        const val COMMERCIAL_RATE_PER_1000SQFT = 5.0
    }

    fun calculateWeeklyCharge(): Double {
        val rate = COMMERCIAL_RATE_PER_1000SQFT * (squareFootage / 1000)
        return if (multiProperty) rate * 0.9 else rate
    }

    fun displayQuote() {
        println("Customer Name: $customerName")
        println("Customer Phone: $customerPhone")
        println("Customer Address: $customerAddress")
        println("Property Name: $name")
        println("Square Footage: $squareFootage sqft")
        println("Multi-Property: $multiProperty")
        println("Weekly Charge: $${calculateWeeklyCharge()}")
    }
}

class Residential(
    customerName: String,
    customerPhone: String,
    customerAddress: String,
    squareFootage: Double,
    val senior: Boolean
) : Customer(customerName, customerPhone, customerAddress, squareFootage) {
    companion object {
        const val RESIDENTIAL_RATE_PER_1000SQFT = 6.0
    }

    fun calculateWeeklyCharge(): Double {
        val rate = RESIDENTIAL_RATE_PER_1000SQFT * (squareFootage / 1000)
        return if (senior) rate * 0.85 else rate
    }

    fun displayQuote() {
        println("Customer Name: $customerName")
        println("Customer Phone: $customerPhone")
        println("Customer Address: $customerAddress")
        println("Square Footage: $squareFootage sqft")
        println("Senior Discount: $senior")
        println("Weekly Charge: $${calculateWeeklyCharge()}")
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

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
