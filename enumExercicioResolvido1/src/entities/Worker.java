package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	public String name;
	public WorkerLevel level;
	public Double baseSalary;
	
	private Department department;
	private List<HourContracts> contracts = new ArrayList<>(); //associação pq um funcionario pode ter varios contratos
	
	public Worker() {
		
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) { //nao marca nenhum atributo do tipo Lista
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContracts> getContracts() {
		return contracts;
	}

	public void addContract(HourContracts contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContracts contract) {
		contracts.remove(contract);
	}
	
	public Double income(int year, int month) {
		Double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for (HourContracts c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH); // +1 porque o calendário começa do 0
			if (c_year == year && c_month == month) {
				sum += c.totalValue();
			}
		}
		return baseSalary;
		
	}
}
