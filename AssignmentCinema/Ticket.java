
public class Ticket
{
	private Film movie;
	private Customer person;
	private double money;
	
	//Ticket Constructor
	Ticket(Customer person, Film movie)
	{
		this.person = person;
		this.movie = movie;
		
		if (person.getAge() >= movie.getRating().getAge())
		{
			money = cost();
		}
		else
		{
			money = 0;
		}
	}
	
	//Double Cost Method
	private double cost()
	{
		double price = 0;
		
		if (person.getStudent().equals("Yes"))
		{
			if (person.getAge() >= 10 && person.getAge() < 18)
			{
				price = 0.85 * 7;
			}
			else if (person.getAge() >= 18 && person.getAge() <= 25)
			{
				price = 0.85 * 10; 
			}
			else if (person.getAge() > 25)
			{
				price = 0.90 * 10;
			}
		}
		
		else
		{
			if (person.getAge() < 18)
			{
				price = 7;
			}
			else if (person.getAge() >= 18 && person.getAge() <= 64)
			{
				price = 10;
			}
			else if (person.getAge() > 64)
			{
				price = 0.93 * 10;
			}
		}
	
		return price;
	}
	
	//Getters
	public Film getMovie()
	{
		return movie;
	}

	public Customer getPerson()
	{
		return person;
	}

	public double getMoney()
	{
		return money;
	}
	
	//toString Method
	public String toString()
	{
		return "FILM TICKET for: "+movie.getTitle()+ " Rating:("+movie.getRating()+")\n"
		+"CUSTOMER DETAILS: "+person.getName()+" age: "+person.getAge()+" Student? "+person.getStudent()+"\n"
		+"TOTAL COST: $"+String.format("%1.2f",money);
	}
}


