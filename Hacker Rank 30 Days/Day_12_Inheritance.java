/**
 * Day_12_Inheritance
 */
import java.util.Scanner;
class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	} 
}
class Student extends Person{
	private int[] testScores;
    Student(String firstName, String lastName, int id, int[] testScores)
    {
        super(firstName, lastName, id);
        this.testScores = testScores;
    }
    public char calculate() {
    int sum = 0;
    for (int score : testScores) {
        sum += score;
    }
    int avg = sum / testScores.length;
    return avg >= 90 ? 'O' : avg >= 80 ? 'E' : avg >= 70 ? 'A' : avg >= 55 ? 'P' : avg >= 40 ? 'D' : 'T';
    }

}
public class Day_12_Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        String lastName = sc.next();
        int id = sc.nextInt();
        int numScores = sc.nextInt();
        int[] testScores = new int[numScores];
        for(int i=0; i<numScores; i++) testScores[i] = sc.nextInt();
        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());

    }
}