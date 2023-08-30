import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    // Array of Items
    val itemNames = arrayOf(
        "Tires", "Rims", "Valve Stems", "Tire Gauges", "Wheel Balancer",
        "Tire Changer", "Jack Stands", "Lug Wrenches", "Tire Repair Kits", "Air Compressor"
    )
        // Array of Number of Items
    val itemCounts = arrayOf(10, 15, 50, 20, 5, 8, 12, 25, 30, 3)

    // merging both arrays into a single 2- dimensional array
    val inventory = Array(itemNames.size) { i ->
        arrayOf(itemNames[i], itemCounts[i])
    }

    // creating a loop so the program keeps running until users exits
    while (true) {
        // asking for the choices
        println("Options:")
        println("1. Search for an item")
        println("2. Add to inventory")
        println("3. Subtract from inventory")
        println("4. Exit")
        print("Enter your choice: ")


        when (scanner.nextInt()) {
            1 -> {
                // searching for the item in the inventory
                print("Enter the item name to search for: ")
                val itemName = scanner.next()
                var found = false
                // looping to get the particular item
                for (item in inventory) {
                    if (item[0] == itemName) {
                        val name = item[0]
                        val count = item[1]
                        println("Item: $name")
                        println("Amount on hand: $count")
                        found = true
                        break
                    }
                }

                if (!found) {
                    println("Item not found in inventory.")
                }
            }
            2 -> {

                //Adding the items in the Inventory
                print("Enter the item name to add to: ")
                val itemName = scanner.next()
                var found = false

                for (item in inventory) {
                    if (item[0] == itemName) {
                        print("Enter the amount to add: ")
                        val amountToAdd = scanner.nextInt()
                        val name = item[0]
                        val count = item[1] as Int
                        val newCount = count + amountToAdd
                        // giving error on the negative input 
                        if (amountToAdd < 0) {
                            println("Error: Amount cannot be negative.")
                            found = true
                            break
                        }
                        // shows the original amount before addition and the amount after the addition
                        item[1] = if (newCount < 0) 0 else newCount
                        println("Item: $name")
                        println("Original Amount: $count")
                        println("Amount Added: $amountToAdd")
                        println("New Total: ${item[1]}")
                        found = true
                        break
                    }
                }

                if (!found) {
                    println("Item not found in inventory.")
                }
            }
            3 -> {
                // Subtracting the item from the inventory 
                print("Enter the item name to subtract from: ")
                val itemName = scanner.next()
                var found = false

                for (item in inventory) {
                    if (item[0] == itemName) {
                        print("Enter the amount to subtract: ")
                        val amountToSubtract = scanner.nextInt()
                        val name = item[0]
                        val count = item[1] as Int
                        val newCount = count - amountToSubtract
                        // Gives error if the negative number is provided 
                        if (amountToSubtract < 0) {
                            println("Error: Amount cannot be negative.")
                            found = true
                            break
                        }
                        // showing the amount before subtraction and after subtraction 
                        item[1] = if (newCount < 0) 0 else newCount
                        println("Item: $name")
                        println("Original Amount: $count")
                        println("Amount Subtracted: $amountToSubtract")
                        println("New Total: ${item[1]}")
                        found = true
                        break
                    }
                }

                if (!found) {
                    println("Item not found in inventory.")
                }
            }
            4 -> {
                
                // exits the While loop and ends the program
                println("Exiting the program.")
                return
            }
            else -> println("Invalid choice. Please enter a valid option.")
        }
    }
}
