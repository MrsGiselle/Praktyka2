package praktyka2

open class Employee(
    val name: String,
    val surname: String,
    val baseSalary: Double,
    val experience: Int
) {
    open fun calculateSalary(): Double {
        return when {
            experience > 5 -> baseSalary * 1.2 + 500
            experience > 2 -> baseSalary + 200
            else -> baseSalary
        }
    }
}