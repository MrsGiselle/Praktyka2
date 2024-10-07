import praktyka2.Department
import praktyka2.Designer
import praktyka2.Developer
import praktyka2.Manager

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val dev1 = Developer("John", "Doe", 3000.0, 6)
    val dev2 = Developer("Jane", "Smith", 3200.0, 4)
    val designer1 = Designer("Emily", "Jones", 2800.0, 3, 0.8)
    val designer2 = Designer("Kate", "White", 2700.0, 5, 0.9)

    val manager1 = Manager("Bob", "Brown", 4000.0, 10)
    manager1.addTeamMember(dev1)
    manager1.addTeamMember(dev2)
    manager1.addTeamMember(designer1)
    manager1.addTeamMember(designer2)

    val department = Department(listOf(manager1))
    department.giveSalary()
}