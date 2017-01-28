
public class Department implements Employee{

	public static void main(String[] args) {
		
		Employee e = new Department();
		e.salary();
		e.Hr_policy();


	}

	@Override
	public void salary() {
		
		System.out.println("Salary granted for this month");

 
		
	}

	@Override
	public void Hr_policy() {


		System.out.println("HR policy applied");
		
	}

}
