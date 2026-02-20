/** use case 8
@author Harsheen 
@version 8
**/
import java.util.*;
class UseCase{
	public static HashMap<Character,String[]> createhashmap(){
		HashMap<Character,String[]> charmap=new HashMap<>();
		charmap.put('o',new String[] { 
            "   ***   ",
            " **   **",
            "**     **",
            "**     **",
            "**     **",
            "**     **",
            "**     **",
            " **   **",
            "   ***   " 
        });
		charmap.put('p', new String[] { " ******   ",
            " **    **",
            " **     **",
            " **    **",
            " ***** ",
            " **     ",
            " **     ",
            " **     ",
            " **   "
        });
		
		charmap.put('s', new String[]  {
            " ******     ",
            " **         ",
            " **         ",
            " **         ",
            " ******    ",
            "     **     ",
            "     **     ",
            "     **     ",
            " ******   "
        });
		return charmap;
		
}
public static void displaybanner(String message, HashMap<Character,String[]> charMap){
	int patternHeight=charMap.get('o').length;
	
	char[] messages=message.toCharArray();
	for(int line =0;line<patternHeight;line++){
		StringBuilder str=new StringBuilder();
	for(int i=0;i<messages.length;i++){
		String[] temp=charMap.get(message.charAt(i));
		str.append(temp[line]);
	}
			System.out.println(str);

}

	}

public static void main(String args[]){
	HashMap<Character,String[]> hashmaps=new HashMap<>();
	hashmaps=createhashmap();
	displaybanner("oops", hashmaps);
	
	
}
}