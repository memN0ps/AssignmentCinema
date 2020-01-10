import java.util.Scanner;
  
public class CinemaTicketApplication
{
	private static Scanner keyboard;
	private static Film[] films;
	private static final int NUMBER_OF_FILMS = 4;
	
	public static void main(String[] args)
	{
		//Creating Scanner Object
		keyboard = new Scanner(System.in);
		
		//Creating Film Object
		films = new Film[4];
		
		//Array of Films
		films[0] = new Film("Star Wars: The Force Awakens", RATING.M);
		films[1] = new Film("DEADPOOL", RATING.M);
		films[2] = new Film("Gods Of Egypt", RATING.G);
		films[3] = new Film("GooseBumps", RATING.P);
		
		//Check for another Ticket
		char anotherTicket;
		System.out.println("Welcome to the Cinema Ticket Purchasing System");
		
		//START OF LOOP
		do
		{	
			//Customer Information
			Customer customer = customerDetailsInput();
			
			//Film Information
			Film film = filmSelection();
			
			//Ticket Information
			Ticket ticket = issueTicket(customer, film);
			
			//Printing Ticket Based On User Input
			if (ticket != null)
			{
				System.out.println("Your ticket is ready to be collected!");
				System.out.println("------------------------------------------");
				System.out.println(ticket.toString());
				System.out.println("------------------------------------------");
			}
			else
			{
				System.out.println("Sorry, cannot issue ticket for age restricted film");
			}
			
			//Issue another Ticket
			anotherTicket = 'z';
			do
			{
				System.out.println("Issue another ticket? (Y/N)");
				
				//Asking Customer to Issue Another Ticket yes/no
				anotherTicket = keyboard.next().charAt(0);
				keyboard.nextLine();
				
				if (anotherTicket != 'y' && anotherTicket != 'Y' && anotherTicket != 'N' && anotherTicket != 'n')
				{
					System.out.println("Error, Invalid input, try again!");
				}
			}
			while (anotherTicket != 'y' && anotherTicket != 'Y' && anotherTicket != 'N' && anotherTicket != 'n');
	
		}
		while (anotherTicket != 'N' && anotherTicket != 'n');
		//END OF LOOP 
	}
	
	//Customer Method
	private static Customer customerDetailsInput()
	{
		String name;
		int age = 0;
		char student = 'z';
		
		//Customer Input
		System.out.println("Please enter your name");
		name = keyboard.nextLine();
		
		while (age == 0)
		{
			try
			{
				System.out.println("Please enter your age");
				age = keyboard.nextInt();
			}
			catch(Exception e)
			{
				System.out.println("Error, Invalid input, try again!");
				keyboard.next();
			}
		}
		
		do 
		{	
			System.out.println("Are you a student? (Y/N)");
			student = keyboard.next().charAt(0);
		
			if (student != 'y' && student != 'Y' && student != 'N' && student != 'n')
			{
				System.out.println("Error, Invalid input, try again!");
			}
		}
		while (student != 'y' && student != 'Y' && student != 'N' && student != 'n');
		
		Customer customer = new Customer(name, age, student);
		
		return customer;
	}
	
	//Film Method
	private static Film filmSelection()
	{
		
		int input = 0;
		
		while (input == 0)
		{
			try
			{
				System.out.println("Which film would you like to watch:");
				
				for (int x = 0; x < NUMBER_OF_FILMS; x++)
				{
					System.out.println((x+1)+" "+films[x].toString());
				}
				
				input = keyboard.nextInt();
				return films[input - 1];
			}
			catch(Exception e)
			{
				System.out.println("Error, Invalid input, try again!");
				keyboard.next();
				input = 0;
			}
		}
		return null;
	}
	
	//Ticket Method
	public static Ticket issueTicket(Customer aCustomer, Film aFilm)
	{
		Ticket ticket = new Ticket(aCustomer, aFilm);
		
		if (ticket.getMoney() != 0)
		{
			return ticket;
		}
		
		return null;
	}
}
