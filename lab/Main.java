package lab;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Instance();
		new Instance(9);
		
	}

}
/*
1st Static Initialization block
2nd Static Initialization block
1st Instance Initialization block
2nd Instance Initialization block
1st constructor call
1st Instance Initialization block
2nd Instance Initialization block
2nd constructor call
*/

/** 
 * 1st Static Initialization block:
 * 	is called because of the presence of a static variable field which is run first and once on 
 * 	every execution
 * 2nd Static Initialization block:
 * 	It is because the program first runs all static field initializations before any other 
 * 
 * 1st Instance Initialization block
 * 2nd Instance Initialization block
 * 	It is the next in sequence ti ensure that all method instances variables are instantiated for 
 * proper execution
 * 
 * 1st constructor call
 * 	this is the first method or function to run on any class to initialize the class.
 * 
 * 2nd constructor call
 * 	on this one there  is no need to run the static initialization block again since they run once on
 * every execution.
 * Instance Initialization block
 * 	this runs to ensure resetting of values on the instance fields of the class is captured.
 * 
 * */
 