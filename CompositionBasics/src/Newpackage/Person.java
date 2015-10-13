package Newpackage;
import java.util.ArrayList;

import Newpackage.Job;

public class Person {
	//composition has-a relationship
    private Job job;
    private Education education;
    public Person(){
        this.job=new Job();
        job.setSalary(1000L);
        this.education = new Education();
        
    }
    public long getSalary() {
        return job.getSalary();
        
    }
    public ArrayList<String> /*void*/ GetSchools()
    {
    	return education.getSchools();
    }
    public String toString()
    {
    	String jobber = job.toString();
    	String educat = education.toString();
    	String person = jobber+educat;
		return person;
    	
    }
}
