/**
 * Coding Part - Hacker News Scraper Test
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * @author Atanda
 *
 */
public class TechnicalSupportEnginnerChallenge {
/** fields */
	private String title; // The title of the post 
	private String uri; //
	private String author;// 
	
	private int points;//
	private int comments;//
	private int rank;//
	
	
	/** constructors
	 * Default Constructors. set points, comments and ranks to zero.
	 * the title, uri and author are also set to an empty string.
	 * 
	 */
	public TechnicalSupportEnginnerChallenge() {
		title ="";
		uri ="";
		author ="";
		points = 0;
		comments = 0;
		rank =0;
		
	
	}
	
	/**
	 * Constructs an TechnicalSupportEngineerChallenge with a given values for title, uri, author, points, comments and ranks of the customer
	 * 
	 * 
	 * @param title is the name of the post 
	 * @param uri the Uniform Resources Indentifier of the post  .
	 * @param author  the writer of the post .
	 * @param points the post received .
	 * @param comments show the reaction of people to the post (feedback)
	 */
	
	  public TechnicalSupportEnginnerChallenge(String title, String uri, String author, int points, int comments, int rank ) {
		  this. title = title;
		  this.uri = uri;
		  this.author  = author;
		  this.points = points;
		  this.comments= comments;
		  this.rank = rank;
		  
	  }
	  
	  
	/** Methods  */
	  public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public int  getComments() {
			return comments;
		}
		public void setComments(int comments) {
			this.comments = comments;
		}
		
		public int getRank() {
			return rank;
		}
		public void setRank(int rank) {
			this.rank = rank;
		}

		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setUri(String uri) {
			this.uri = uri;
		}
		public String getUri() {
			return uri;
		}
		
		/** Returns a textual representation of the TechnicalSupportEnginnerChallenge
		 * 
		 * 
		 */
		@Override
		public String toString() {
			return "TechnicalSupportEnginnerChallenge: [ title=" + title + ", author=" + author + ", uri=" + uri +", rank=" + rank +", points=" + points +", comments=" + comments +"]";
			
		}

	

}
