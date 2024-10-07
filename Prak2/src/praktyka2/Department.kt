package praktyka2

class Department(
    val managers: List<Manager>
) {
    fun giveSalary() {
        managers.forEach { manager ->
            // Виводимо зарплату менеджера
            println("${manager.name} ${manager.surname} received ${manager.calculateSalary().toInt()} shekels.")

            // Виводимо зарплату кожного учасника команди менеджера
            manager.team.forEach { employee ->
                println("${employee.name} ${employee.surname} received ${employee.calculateSalary().toInt()} shekels.")
            }
        }
    }
}