
public class Film
{

	private	String title;
	private RATING rating;
		
		//Constructors 
		Film(String title, RATING rating)
		{
			this.title = title;
			this.rating = rating;
		}
		
		//Default Constructor
		Film()
		{
			title = "movie";
			rating = RATING.G;
		}
		
		
		//Getters and setters
		public String getTitle()
		{
			return title;
		}
		public RATING getRating()
		{
			return rating;
		}
		public void setTitle(String title)
		{
			this.title = title;
		}
		public void setRating(RATING rating)
		{
			this.rating = rating;
		}
		
		//toString Method
		public String toString()
		{
			return title+" rating: ("+rating+")";
		}
}
