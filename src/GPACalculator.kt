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
    }

    fun tableview() {
        println("SUBJECT\t\tCREDIT HOURS\t\tGPA\t\t\t\tGRADE")
        for (i in 0..subjects) {
            print("    " + (i + 1) + "\t\t\t " + creditlist[i] + "\t\t\t\t" + gpalist[i] + "\t\t\t\t" + getgrade(gpalist[i]))
        }
        println("\n  " + "TOTAL" + "\t\t\t " + totalcredit + "\t\t\t\t" + gpa)
        print("GRADE : " + getgrade(gpa) + "\nGPA : $gpa")

    }

    fun getgrade(sgpa: Float): String {
        println("")
        if (sgpa > 3.7) {
            return "A+"
        } else if (sgpa >= 3.7) {
            return "A-"
        } else if (sgpa >= 3.3) {
            return "B+"
        } else if (sgpa >= 3.0) {
            return "B"
        } else if (sgpa >= 2.7) {
            return "B-"
        } else if (sgpa >= 2.3) {
            return "C+"
        } else if (sgpa >= 2.0) {
            return "C"
        } else if (sgpa >= 1.7) {
            return "C-"
        } else if (sgpa >= 1.3) {
            return "D"
        } else if (sgpa < 1.3) {
            return "F"
        } else {
            return "null"
        }
    }

}