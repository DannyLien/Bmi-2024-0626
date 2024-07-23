package com.tom.bmi_2024_0626.Student

fun main() {

    val reports = listOf<Report>(
        FinanceReport(),
        HealthReport(),
    )
    for (report in reports){
        report.load()
        report.print("Test")
    }

}