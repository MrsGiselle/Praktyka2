package praktyka2

class Designer(
    name: String,
    surname: String,
    baseSalary: Double,
    experience: Int,
    efficiencyCoefficient: Double
) : Employee(name, surname, baseSalary, experience) {
    var efficiencyCoefficient = efficiencyCoefficient
        set(value) {
            field = when {
                value < 0 -> 0.0
                value > 1 -> 1.0
                else -> value
            }
        }

    override fun calculateSalary(): Double {
        val baseSalaryWithExperience = super.calculateSalary()
        return baseSalaryWithExperience * efficiencyCoefficient
    }
}