
public enum RATING
{

	G(0), P(12), M(16);
	
	private int age;
	
	//Constructor
	RATING(int age)
	{
		this.age = age;
	}

	//Getters and Setters
	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}
}
