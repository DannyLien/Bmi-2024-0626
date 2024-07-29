package com.tom.bmi_2024_0626.Student

fun main() {

    val reports = listOf<Report>(
        FinanceReport(),
        HealthReport(),
        object : Report{
            override fun load() {
                println("Ex Report")
            }

            override fun print(title: String) {
                println("Printing")
            }
        }
    )
    for (report in reports){
        report.load()
        report.print("Test")
    }

}