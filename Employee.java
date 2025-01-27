
public class Employee {
	
	private int EmployeeId;
	private String EmployeeName;
	private double Salary;
	private String Designation;
	
	
	public void setEmployeeId(int id){
		EmployeeId= id;
	}
    public void setEmployeeName(String name){
    	EmployeeName= name;
	}
    public void setSalary(double sal){
    	if(sal<0) {
    		System.out.println("Employee Salary can't be negative");

    	}
    	else {
    	Salary= sal;
    	}
    }
    public void setDesignation(String dsg){
    	Designation= dsg;
}
    
    public int getEmployeeId(){
    	return EmployeeId;
    }
    public String getEmployeeName(){
    	return  EmployeeName;
    }
    public double getSalary(){
    	return  Salary;
    }
    public String getDesignation(){
    	return Designation;
    }
    
    


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e= new Employee();
		e.setEmployeeId(12345);
		e.setEmployeeName(" Dr. Abhilash Pati");
		e.setDesignation("Faculty");
		e.setSalary(100000.00);
		
		System.out.println("Employee ID "+ e.getEmployeeId());
		System.out.println("Employee Name "+ e.getEmployeeName());
		System.out.println("Employee Designation "+ e.getDesignation());
		System.out.println("Employee Salary "+ e.getSalary());

	}
}
