package Newpackage;

import java.util.*;

public class Education {
ArrayList<String> schools = new ArrayList<String>();

	public Education()
	{
		Scanner keyboard = new Scanner(System.in);

		for (int i =0; i < 10 ;i++)
		{
			System.out.println("Enter school number "+i);
			schools.add(keyboard.nextLine());
		}
	}
	
	public ArrayList<String> /*void*/ getSchools()
	{
		
		return schools;
	}
	 public String toString()
	    {
		 	String education ="";
	    	for (int i = 0; i < 10 ; i++)
			{
	    		
	    		education = education + "\n" + schools.get(i) ;
			}
			
	    	return education;
	    }

}
