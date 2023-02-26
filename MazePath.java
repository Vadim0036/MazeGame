
public class MazePath {

	
	/** Describes this Path in the game and any useful information about the story */
	private String description;
	/** Option choice that the player must make to choose this Path in the game */
	private String option;
	
	/** The next Path to take AFTER this one when the user has made a correct decision */
	private MazePath correctPath;
	/** The next Path to take when the user has chosen poorly */
	private MazePath incorrectPath;
	
	
	
	
	/**
	 * 	Creates a new Maze Path with the option used to select this Path, and a 
	 * 	description of this Path in the game. 
	 */
	public MazePath( String option, String desc )
	{
		/** 
		 * 	TODO: DELETE THESE INSTRUCTIONS AND RETURN STATEMENT AFTER COMPLETION. 
		 * 	
		 * 	(1) Setup the option and description.
		 * 	
		 */	
	}
	
	
	
	/**
	 * 	Returns the description of this Path in the game.
	 */
	public String getDescription()
	{
		/** 
		 * 	TODO: DELETE THESE INSTRUCTIONS AND RETURN STATEMENT AFTER COMPLETION. 
		 * 	
		 * 	(1) Returns the description
		 * 	
		 */	
		return null; // TODO: DELETE THIS!
	}
	
	/**
	 * 	Returns the option choice that must be selected by the player in game in 
	 * 	order to take this pathway.
	 */
	public String getOption()
	{
		/** 
		 * 	TODO: DELETE THESE INSTRUCTIONS AND RETURN STATEMENT AFTER COMPLETION. 
		 * 	
		 * 	(1) Returns the option
		 * 	
		 */	
		return null; // TODO: DELETE THIS!
	}
	
	/**
	 * 	Returns the next Maze Path that is considered to be the correct path to take 
	 * 	after this one in the game.
	 */
	public MazePath getCorrectPath()
	{
		/** 
		 * 	TODO: DELETE THESE INSTRUCTIONS AND RETURN STATEMENT AFTER COMPLETION. 
		 * 	
		 * 	(1) Returns the correct next Path
		 * 	
		 */	
		return null; // TODO: DELETE THIS!
	}
	
	/**
	 * 	Sets the next Maze Path that is considered to be the correct path to take 
	 * 	after this one in the game.
	 */
	public void setCorrectPath( MazePath path )
	{
		/** 
		 * 	TODO: DELETE THESE INSTRUCTIONS AND RETURN STATEMENT AFTER COMPLETION. 
		 * 	
		 * 	(1) Set the correct next Path
		 * 	
		 */	
	}

	/**
	 * 	Returns the next Maze Path that is considered to be the incorrect path 
	 * 	to take after this one in the game.
	 */
	public MazePath getIncorrectPath()
	{
		/** 
		 * 	TODO: DELETE THESE INSTRUCTIONS AND RETURN STATEMENT AFTER COMPLETION. 
		 * 	
		 * 	(1) Return the incorrect next path
		 * 	
		 */	
		return null; // TODO: DELETE THIS!
	}
	
	/**
	 * 	Returns the next Maze Path that is considered to be the incorrect path 
	 * 	to take after this one in the game.
	 */
	public void setIncorrectPath( MazePath path )
	{
		/** 
		 * 	TODO: DELETE THESE INSTRUCTIONS AND RETURN STATEMENT AFTER COMPLETION. 
		 * 	
		 * 	(1) Set the incorrect next path
		 * 	
		 */	
	}
	
	/**
	 * 	Returns the option choice of the next Maze Path after this one that is 
	 * 	considered to be the correct path to take. If there is NOT a next correct 
	 * 	Path after this one, then this method returns null.
	 */
	public String getCorrectOptionChoice()
	{
		/** 
		 * 	TODO: DELETE THESE INSTRUCTIONS AND RETURN STATEMENT AFTER COMPLETION. 
		 * 	
		 * 	(1) Return the option choice for the next correct path, or null 
		 * 		if there is not a next path
		 * 	
		 */	
		return null; // TODO: DELETE THIS!
	}
	
	/**
	 * 	Returns the option choice of the next Maze Path after this one that is 
	 * 	considered to be the incorrect path to take. If there is NOT a next 
	 * 	incorrect Path after this one, then this method returns null.
	 */
	public String getIncorrectOptionChoice()
	{
		/** 
		 * 	TODO: DELETE THESE INSTRUCTIONS AND RETURN STATEMENT AFTER COMPLETION. 
		 * 	
		 * 	(1) Return the option choice for the next incorrect path, or null 
		 * 		if there is not a next path
		 * 	
		 */	
		return null; // TODO: DELETE THIS!
	}
	
	/**
	 * 	Returns the next Maze Path AFTER this one that is associated with the given 
	 * 	option choice. If there is NOT a next Path after this one with the given 
	 * 	option then this method returns null.
	 */
	public MazePath getNextPath( String option )
	{
		/** 
		 * 	TODO: DELETE THESE INSTRUCTIONS AND RETURN STATEMENT AFTER COMPLETION. 
		 * 	
		 * 	(1) Return the next Maze Path that the given option matches.
		 * 	(2) If it does not match either of the mazes next paths, then 
		 * 		this method returns null
		 * 	(3) If there is NOT any next paths to check, then this method 
		 * 		returns null.
		 * 	
		 */	
		return null; // TODO: DELETE THIS!
	}
	
	/**
	 * 	Returns true if this Path is considered to be the END of a pathway. A Path 
	 * 	is an END Path if there are not other Paths connected to it.
	 */
	public boolean isEndPath()
	{
		/** 
		 * 	TODO: DELETE THESE INSTRUCTIONS AND RETURN STATEMENT AFTER COMPLETION. 
		 * 	
		 * 	(1) Return whether or not this Path is the end, meaning it does not 
		 * 		have any attached Paths
		 * 	
		 */	
		return false; // TODO: DELETE THIS!
	}
	
	/**
	 * 	Creates a String that can be used to display this Maze Path in the game when 
	 * 	printed. The String will include the description, followed by the two option 
	 * 	choices for correct and incorrect Paths after this one, if those Paths exist. 
	 * 	If this Path is an END Path, then this method will not include any possible 
	 * 	option choices.
	 */
	@Override public String toString()
	{
		/** 
		 * 	TODO: DELETE THESE INSTRUCTIONS AND RETURN STATEMENT AFTER COMPLETION. 
		 * 	
		 * 	(1) Include the description
		 * 	(2) Include the two option choices for the next paths, if they exist
		 * 	
		 */	
		return null; // TODO: DELETE THIS!
	}
	
}