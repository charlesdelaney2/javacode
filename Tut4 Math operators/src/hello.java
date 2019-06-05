import java.util.Scanner;

class hello
{
public static void main(String args[]) {
	Scanner bucky = new Scanner(System.in);
	
	int girls, boys, people, remainder;
	girls = 11;
	boys = 3;
	people = girls / boys;
	remainder = girls % boys;
	System.out.println("there are "+people +" people with "+ 
	remainder + " left over");
	girls = 11;
	boys = 3;
	people = girls + boys;
	System.out.println(people);
	girls = 11;
	boys = 3;
	people = girls - boys;
	System.out.println(people);
	girls = 11;
	boys = 3;
	people = girls * boys;
	System.out.println(people);
}
}