
import java.util.Scanner;

public class TechnicalSupportEnginnerChallengeTest {

		
		
	public static void main(String[] args) {
	
System.out.println ("Welcome to TrueLayer where we driven by the idea that the best product arise from curiosty,precision,collaborative team-work, and a bit of unconventional thinking");
		
		/** create a scanner for keyboard input */
		
		Scanner input = new Scanner (System.in);//  To accept user input	
		
/** Below "tech" is declared as instance of TechnicalSupportEnginnerChallenge class */
		TechnicalSupportEnginnerChallenge tech = new TechnicalSupportEnginnerChallenge();
		
		System.out.println("");
		
		System.out.println("Enter any key to display Posts Informations");
		String title = input.nextLine();	/** read a string value */
		tech.getTitle();
		System.out.println("The word you entered is : " + title); 
		 System.out.println("");

		 
			/**declare array to hold three TechnicalSupportEnginner objects

			I will create Name object and assign reference into array
			I will create Name objects and assign reference directly into array
			the for loop is used to extract the value assigned to each of the field.
				*/
		 

System.out.println("These are the list of posts available to you  "); 
TechnicalSupportEnginnerChallenge posts[] = new TechnicalSupportEnginnerChallenge[3];
		posts [0]= new TechnicalSupportEnginnerChallenge ("Web Scraping in 2016", "https://franciskim.co/2016/08/24/dont-need-no-stinking-api-web-scraping-2016-beyond/","Franciskim", 133,80,1);
		posts [1]= new TechnicalSupportEnginnerChallenge("Instapaper is joining Pinterest", "http://blog.instapaper.com/post/149374303661","Ropiku",182, 99, 2);
	
		for (int i=0; i < posts.length; i++) {
			
			 System.out.println("Post Title is :  " + posts[i].getTitle());
			 System.out.println("");
			 System.out.println("The Uri for the Post is :"      +  posts[i].getUri());
			 System.out.println("");
			 System.out.println("The Author name is   :"    +        posts[i].getAuthor());
			 System.out.println("");
			 System.out.println("  The points is  :" + posts[i].getPoints());
			 System.out.println("");
			 System.out.println("The numbers of comment on the post :" + posts[i].getComments());
			 System.out.println("The Rank is :" + posts[i].getRank());
			    
			
		
	}
	}
	
}
