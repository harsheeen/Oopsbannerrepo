/** 
* OOPSBANNERAPP UC4 - OOPS BANNER Display Application with array and for each
* @author Harsheen
* @version 4.0
**/
class UseCase{
	public static void main(String[] args){
		String[] array=new String[9];
		array[0]=String.join(" " ,"   ***   "  ,  "   ***   "  ,  " ******   " ,  "  ***** ");
		array[1]=String.join(" " ," **   **"  ,  "  **   **"  ,  "  **   **"  ,   " **");
		array[2]=String.join(" " ,"**     **"  ,  "**     **"  ,  " **    **"  ,  "**");
		array[3]=String.join(" " ,"**     **"  ,  "**     **"  , "  **   **"  ,    " **");
		array[4]=String.join(" " ,"**     **"  ,  "**     **"  ,  " ****** "  ,  "   ****");
		array[5]=String.join(" " ,"**     **"  ,  "**     **"  ,  " **     "  ,  "      **");
		array[6]=String.join(" " ,"**     **"  ,  "**     **"  ,  " **     "  ,  "       **");
		array[7]=String.join(" " ," **   **"  ,  "  **   **"  ,  "  **     "  ,  "      **");
		array[8]=String.join(" " ,"   ***    " ,"  ***  "  ,"  **  "  ,   "    ***** ");
		for(String len : array)
			System.out.println(len);
	
	
	}
}