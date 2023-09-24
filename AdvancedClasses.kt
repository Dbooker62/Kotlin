enum class PositionTitle {
    Administration, Production, Sales, Maintenance, Technical, Secretarial
}

class Employee(
    private val name: String,
    private val position: PositionTitle,
    private val isSalary: Boolean,
    private val payRate: Double,
    private val shift: Int
) {
    private fun calculate(hoursWorked: Double): Double {
        val basePay = if (shift == 2) {
            payRate * 1.05
        } else if (shift == 3) {
            payRate * 1.10
        } else {
            payRate
        }

        val overtimePay = if (!isSalary && hoursWorked > 40) {
            (hoursWorked - 40) * (1.5 * payRate)
        } else {
            0.0
        }

        return (basePay * hoursWorked) + overtimePay
    }

    fun displayEarnings(weekHours: Double) {
        val weeklyEarnings = calculate(weekHours)
        val formattedEarnings = String.format("%.2f", weeklyEarnings)

        println("Name: $name")
        println("$position Is Salary: $isSalary shift: $shift")

        println("Rate of pay is: $payRate per hour")
        println("$name earned $$formattedEarnings this week: ")
    }
}

fun main() {
    val employee1 = Employee("Jane Doe", PositionTitle.Administration, true, 27.0, 1)
    val employee2 = Employee("Larry Jackson", PositionTitle.Production, false, 22.0, 2)
    val employee3 = Employee("John Smith", PositionTitle.Maintenance, false, 21.0, 3)

    employee1.displayEarnings(40.0)
    employee2.displayEarnings(45.0)
    employee3.displayEarnings(35.0)
}
