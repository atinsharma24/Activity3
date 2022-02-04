import java.util.Scanner;

public class Act3Q5{

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter your reg no: ");
		String str = s.next();
		if(str.contains("BCE"))
			System.out.println("SCOPE");
		else if(str.contains("BEC"))
			System.out.println("SENSE");
		else
			System.out.println("There are no students from SCOPE and SENSE school");
		System.out.println("20BCE2618 \nAADITRY CHOUDHURY");
	}

}