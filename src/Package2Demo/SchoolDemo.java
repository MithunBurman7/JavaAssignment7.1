package Package2Demo;

// Here by Importing Package1

import Package1Demo.StudentDemo;

//Class extending the Class StudentDemo.

     public class SchoolDemo extends StudentDemo {

	       public static void main(String[] args) { 
	    	   
	 	     SchoolDemo sc = new SchoolDemo();
		       
	 	     // Here by calling the protected method
		   
	 	     sc.display();

	}

}
