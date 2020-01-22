import java.util.*
import kotlin.collections.ArrayList

class GPACalculator {
    var totalcredit = 0
    var commgpa = 0f
    var gpa = 0f
    var gpalist = ArrayList<Float>()
    var creditlist = ArrayList<Int>()
    var subjects = 0

    fun calculate() {

        var reader = Scanner(System.`in`)
        println("Enter total Subjects")
        subjects = reader.nextInt() - 1

        for (i in 0..subjects) {

            println("Enter credits hours for subject " + (i + 1))
            creditlist.add(reader.nextInt())
            println("Enter gpa for subject " + (i + 1))
            gpalist.add(reader.nextFloat())

        }
        for (i in 0..subjects) {
            totalcredit += creditlist[i]
            commgpa += creditlist[i] * gpalist[i]
        }
        gpa = commgpa / totalcredit

        println("your Gpa is $gpa")
    }

    fun tableview() {
        println("")
        println("SUBJECT\t\tCREDIT HOURS\t\tGPA")
        for (i in 0..subjects) {
            println("    " + (i + 1) + "\t\t\t " + creditlist[i] + "\t\t\t\t" + gpalist[i])
        }
        println("  " + "TOTAL" + "\t\t\t " + totalcredit + "\t\t\t\t" + gpa)
    }

    fun getgrade() {
        println("")
        if (gpa > 3.7) {
            println("GRADE \t\t\t A+")
        } else if (gpa >= 3.7) {
            println("GRADE \t\t\t A-")
        } else if (gpa >= 3.3) {
            println("GRADE \t\t\t B+")
        } else if (gpa >= 3.0) {
            println("GRADE \t\t\t B")
        } else if (gpa >= 2.7) {
            println("GRADE \t\t\t B-")
        } else if (gpa >= 2.3) {
            println("GRADE \t\t\t C+")
        } else if (gpa >= 2.0) {
            println("GRADE \t\t\t C")
        } else if (gpa >= 1.7) {
            println("GRADE \t\t\t C-")
        } else if (gpa >= 1.3) {
            println("GRADE \t\t\t D")
        } else if (gpa < 1.3) {
            println("GRADE \t\t\t F")
        }
    }
}