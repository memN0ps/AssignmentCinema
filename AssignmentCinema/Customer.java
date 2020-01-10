
public class Customer{

	private	String name;
	private	int age;
	private	boolean student;
		
		//Constructor
		Customer(String name, int age, char student)
		{
			this.name = name;
			this.age = age;
			
			if (student == 'Y' || student == 'y')
			{
				this.student = true;
			}
			else
			{
				this.student = false;
			}
		}
		
		//Default Constructor
		Customer()
		{
			name = "abc";
			age = 0;
			student = true;
		}
		
		
		//Getters and Setters
		public String getName()
		{
			return name;
		}
		public void setName(String name)
		{
			this.name = name;
		}
		public int getAge() 
		{
			return age;
		}
		public void setAge(int age)
		{
			this.age = age;
		}
		public String getStudent()
		{
			if (student)
			{
				return "Yes";
			}
			
			return "No";
		}
		public void setStudent(char student) 
		{
			if (student == 'Y' || student == 'y')
			{
				this.student = true;
			}
			else
			{
				this.student = false;
			}
		}
		
		//toString Method
		public String toString()
		{
			return "Customer, name: "+name+" age: "+age+" student: "+student;
		}
}

