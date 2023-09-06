import java.text.DecimalFormat
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val taxRate = 0.025
    val tipRate = 0.175

    var totalCost = 0.0

    val currencyFormat = DecimalFormat("#,##0.00") // Format for currency

    println("Welcome to the Tip Calculator!")

    while (true) {
        print("Enter the cost of an item (or 0 to calculate the total): $")
        val input = scanner.nextDouble()

        if (input == 0.0) {
            break
        }

        totalCost += input
    }

    val taxes = totalCost * taxRate
    val totalWithTaxes = totalCost + taxes
    val recommendedTip = totalCost * tipRate

    println("----- Receipt -----")
    println("Total Cost: \$${currencyFormat.format(totalCost)}")
    println("Taxes (2.5%): \$${currencyFormat.format(taxes)}")
    println("Total with Taxes: \$${currencyFormat.format(totalWithTaxes)}")
    println("Recommended Tip (17.5%): \$${currencyFormat.format(recommendedTip)}")

    scanner.close()
}
