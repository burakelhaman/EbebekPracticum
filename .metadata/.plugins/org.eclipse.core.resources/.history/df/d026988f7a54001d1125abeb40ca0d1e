package employeeCalc.business;

import employeeCalc.entities.Employee;

public class Calculate {

	public double tax(Employee employee) {
		if (employee.salary > 1000) {
			return employee.salary * 0.03;
		}
		return 0.0;
	}

	public double bonus(Employee employee) {
		if (employee.workHours > 40) {
			return (employee.workHours - 40) * 30;
		}
		return 0.0;
	}

	public double raiseSalary(Employee employee) {
		double increase = 0;
		if (2021 - employee.hireYear < 10) {
			increase = (employee.salary) * 0.05;
		} else if (2021 - employee.hireYear > 9 && 2021 - employee.hireYear < 20) {
			increase = (employee.salary) * 0.10;
		} else if (2021 - employee.hireYear > 19) {
			increase = (employee.salary) * 0.15;
		}
		return increase;
	}

	public void toString(Employee employee) {

		System.out.println("Çalışan Adı : " + employee.name);
		System.out.println("Çalışanın Maaşı : " + employee.salary + " TL");
		System.out.println("Çalışanın Çalışma Saati : " + employee.workHours + " Saat");
		System.out.println("Çalışanın Başlagıç Yılı : " + employee.hireYear + " Yıl");
		System.out.println("Maaşının Vergisi : " + tax(employee) + " TL");
		System.out.println("Çalışma Bonusu : " + bonus(employee) + " TL");
		System.out.println("Çalışanın Maaş Artışı : " + raiseSalary(employee) + " TL");
		System.out.println("Vergi ve Bonuslarla Maaş : " + (employee.salary - tax(employee) + bonus(employee)) + " TL");
		System.out.println("Toplam Maaş : " + (employee.salary + bonus(employee) + raiseSalary(employee) - tax(employee)) + " TL");
	}
}