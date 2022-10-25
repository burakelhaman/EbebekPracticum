package employeeCalc;
import employeeCalc.business.Calculate;
import employeeCalc.entities.Employee;

public class Main {

	public static void main(String[] args) throws Exception {
		Employee calisan = new Employee();
		calisan.setName("Kemal");
		calisan.setSalary(2000);
		calisan.setWorkHours(45);
		calisan.setHireYear(1985);

		Calculate calculate = new Calculate();
		calculate.toString(calisan);

	}
}