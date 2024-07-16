package com.tom.bmi_2024_0626.Student

class GraduateStudent(id: String, name: String, english: Int, math: Int, val thesis: Int) :
    Student(id, name, english, math) {

    override fun average() = (english + math+ thesis) / 3
    override fun print() {
        val mark = if (average() < pass) "*" else " "
        println("$id\t $name\t $english\t $math\t ${thesis}\t ${average()}$mark\t ${grading()}\t  ")
    }

}

fun main() {
    val stu = Student
    Student.pass = 70
    val gstu = GraduateStudent("008", "Emma", 60, 60, 85)
    gstu.print()

}