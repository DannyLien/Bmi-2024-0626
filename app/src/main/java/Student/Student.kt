package Student

import android.util.Range

class Student(val id: String, val name: String, val english: Int = 0, val math: Int = 0) {
//    constructor(id: String, name: String) : this(id, name, 0, 0)

    companion object {
        var pass = 60
    }

    fun print() {
        val mark = if (average() < pass) "*" else " "
        println("$id\t $name\t $english\t $math\t ${average()}$mark\t ${grading()}")
    }

    fun average() = (english + math) / 2

    fun grading() = when (average() / 10) {
        9, 10 -> 'A'
        8 -> 'B'
        7 -> 'C'
        6 -> 'D'
        else -> 'F'
    }

}

fun main() {
    Student.pass = 60
    val students = listOf<Student>(
        Student("001", "Jack", 40, 60),
        Student("002", "Hank", 66, 87),
        Student("003", "Jane")
    )
    for (i in 0..2) {
        students.get(i).print()
    }
    for (i in students) {
        i.print()
    }

    val stu = Student("001", "Jack", 100, 100)
    val stu2 = Student("002", "Hank", 66, 87)
    val stu3 = Student("003", "Jane")
    stu.print()
    stu2.print()
    stu3.print()

}





