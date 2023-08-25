fun main() {
    var choice: Int

    do {
        // Display the coffee shop menu
        println("Coffee Shop Menu:")
        println("1. Espresso")
        println("2. Cappuccino")
        println("3. Latte")
        println("4. Mocha")
        println("5. Exit")
        print("Please enter your choice (1-5): ")

        
        val input = readLine()?.toIntOrNull()

        
        if (input != null && input in 1..5) {
            choice = input
            when (choice) {
                1 -> println("You selected: Espresso")
                2 -> println("You selected: Cappuccino")
                3 -> println("You selected: Latte")
                4 -> println("You selected: Mocha")
                5 -> println("Thank you for visiting the coffee shop!")
                
            }
            break
        } else {
            println("Invalid input. Please enter a valid option (1-5).")
            choice = 0 
        }

    } while (choice != 5) 
}
