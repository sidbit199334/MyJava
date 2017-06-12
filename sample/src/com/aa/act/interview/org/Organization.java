package com.aa.act.interview.org;

import java.util.Collection;
import java.util.Optional;

public abstract class Organization {

	private Position root;
	
	public Organization() {
		root = createOrganization();
	}
	
	protected abstract Position createOrganization();
	
	/**
	 * hire the given person as an employee in the position that has that title
	 * 
	 * @param person
	 * @param title
	 * @return the newly filled position or empty if no position has that title
	 */
	public Optional<Position> hire(Name person, String title) {
		Employee emp =new Employee(person.hashCode(), person);
		if (title.equals(root.getTitle())){
			root.setEmployee(Optional.of(emp));
		}
		else{
		setEmployee(title, person, root.getDirectReports());
		}
		retrn Optional.empty();
			
		}

	private void setEmployee(String title, Name person, Collection<Position> directReports) {

		for(Position position : directReports) {
			if(position.getTitle().equalsIgnoreCase(title)) {
				Employee emp =new Employee(person.hashCode(), person);
				Optional<Employee> employee = Optional.of(emp);
				position.setEmployee(employee);
				break;
			}
			setEmployee(title, person, position.getDirectReports());
		}
	}

		
/*

private void setEmployee(String title, Employee emp, Position root) {
		for (Position p : root.getDirectReports()) {
			if(title.equals(p.getTitle()))
				p.setEmployee(Optional.of(emp));
			
			else
				setEmployee(title,emp,root);
									
		}
	 
	}
*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return printOrganization(root, "");
	}
	
	private String printOrganization(Position pos, String prefix) {
		StringBuffer sb = new StringBuffer(prefix + "+-" + pos.toString() + "\n");
		for(Position p : pos.getDirectReports()) {
			sb.append(printOrganization(p, prefix + "\t"));
		}
		return sb.toString();
	}
}
