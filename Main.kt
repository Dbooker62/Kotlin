import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit

fun main(args: Array<String>) {

    //var scanner = "" // to get user input


    val today = LocalDate.now() // to get current date / time
    

    // set date format
    val formatter = DateTimeFormatter.ofPattern("M/d/yyyy")

    // display today's date formatted
    val TextToday = today.format(formatter)
    println("Today's date is: $TextToday")

    // get info from user
    println("What month were you born in? (Enter as number: January = 1)")
    val myMonth = readln().toInt()
    println("What day were you born? ")
    val myDay = readln().toInt()
    val myYear = today.year // assign year to current year
    val thisMonth = today.month

    // assign information to variable birthday
    var birthday = LocalDate.of(myYear, myMonth, myDay)


    // if birthday already happened this year, add one to year
    if (birthday.isAfter(today)) {
        birthday = birthday.plusYears(2)
    }


    val nextBirthday = birthday.format(formatter)
    // calculate days till next birthday

    val daysToBirthday = today.until(birthday, ChronoUnit.WEEKS)

    if (myMonth == thisMonth.value && myDay == today.dayOfMonth) {
        println("Happy Birthday!")
    } else {
        println("Your next birthday is: $nextBirthday")
        println("There are $daysToBirthday days till your next birthday!")
    }

}
