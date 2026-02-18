/** 
* OOPSBANNERAPP UC6 - OOPS BANNER Display Application with the help of functions
* @author Harsheen
* @version 6.0
**/
class UseCase{
	public static String[] get OPattern(){
			return new String []{
		 "   ***   ",
		 " **   **" ,
		 "**     **" ,
		 "**     **",
		 "**     **" ,
		 "**     **" ,
		 "**     **" ,
		 " **   **" ,
		 "   ***   " };}
		 
		 
	public static String[] get PPattern(){
			return new String []{
		   ******   " ,
		"  **   **",
		 " **    **" ,
		"  **   **" ,
		  " ****** " ,
		 " **     " ,
		"  **     " 
		 " **     ",
		 " **   "};} 	 
		 
	public static String[] get SPattern(){
			return new String []{
		   ******     " ,
		"  **         ",
		 " **         " ,
		"  **         " ,
		  " ******    " ,
		 "      **     " ,
		"       **     " 
		 "      **     ",
		 "  ******   "};} 	

		public static void main(String[] args) { 
		for (String line : getOPattern()) { 
		System.out.println(line); } 
		System.out.println(); 
		
		
		for (String line : getPPattern()) 
		{ System.out.println(line); } 
		System.out.println(); 
		
		for (String line : getPPattern()) 
		{ System.out.println(line); } 
		System.out.println(); 
		
		
		for (String line : getSPattern()) {
		System.out.println(line);
		} }
		 
	}


