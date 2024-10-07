package praktyka2

class Manager(
    name: String,
    surname: String,
    baseSalary: Double,
    experience: Int,
    val team: MutableList<Employee> = mutableListOf()
) : Employee(name, surname, baseSalary, experience) {

    fun addTeamMember(member: Employee) {
        team.add(member)
    }

    override fun calculateSalary(): Double {
        var countedSalary = super.calculateSalary()

        // Додаємо бонуси в залежності від розміру команди
        countedSalary += when {
            team.size > 10 -> 300
            team.size > 5 -> 200
            else -> 0
        }

        // Якщо більше половини команди складають Developer
        val developersCount = team.count { it is Developer }
        if (developersCount > team.size / 2) {
            countedSalary *= 1.1
        }

        return countedSalary
    }
}