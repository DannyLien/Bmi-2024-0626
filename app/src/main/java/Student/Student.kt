package Student

import android.util.Range

class Student(val id: String, val name: String, val english: Int = 0, val math: Int = 0) {
//    constructor(id: String, name: String) : this(id, name, 0, 0)

    fun print() {
        println("$id\t $name\t $english\t $math\t ${average()}\t ${grading()}\t")
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
    val students = listOf<Student>(
        Student("001", "Jack", 100, 100),
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





