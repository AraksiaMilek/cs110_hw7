import animals.*;
import utils.*;

public class Driver {

public static void main(String[] args) {
	
	//2
	Puppy monica = new Puppy("Chandler");
	Puppy rachel = new Puppy("Ross");
	Puppy pheobe = new Puppy("Joey");
	
	System.out.println(monica.getName());
	System.out.println(rachel.getName());
	System.out.println(pheobe.getName());
	
	//3
	int[] arr = {9, 20, 3, 44, 88, 300};
	int[] arrStringify = ArrayUtils.reverse(arr);
	System.out.println(ArrayUtils.stringifyArray(arrStringify));
	
	//4	
	double a = 15.4;
	System.out.println(utils.Math.factorial((int)a));
	
}
	
	
	
}

