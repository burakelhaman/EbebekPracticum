package employeeCalc.entities;

public class Employee {

	public String name;
	public double salary;
	public double workHours;
	public int hireYear;

	public Employee() {
	}

	public Employee(String name, double salary, double workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) throws Exception {
		if (name.isEmpty()) {
			throw new Exception("Lütfen Geçerli Bir İsim Giriniz!");
		} else {
			this.name = name;
		}
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) throws Exception {
		if (salary < 0) {
			throw new Exception("Lütfen 0'dan Büyük Değer Giriniz!");
		} else {
			this.salary = salary;
		}
	}

	public double getWorkHours() {
		return this.workHours;
	}

	public void setWorkHours(double workHours) throws Exception {
		if (workHours < 0) {
			throw new Exception("Lütfen 0'dan Büyük Değer Giriniz!");
		} else {
			this.workHours = workHours;
		}
	}

	public int getHireYear() {
		return this.hireYear;
	}

	public void setHireYear(int hireYear) throws Exception {
		if (hireYear < 0) {
			throw new Exception("Lütfen 0'dan Büyük Değer Giriniz!");
		} else if (hireYear < 1980) {
			throw new Exception("Lütfen Geçerli Bir Değer Giriniz!");
		} else {
			this.hireYear = hireYear;
		}
	}
}