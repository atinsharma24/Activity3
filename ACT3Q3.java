import java.util.*;

public class Q22 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        String reg_no, mob_no;

        System.out.println("Enter your registration no. followed by mobile number");

        reg_no = in.nextLine();
        mob_no = in.nextLine();

        if(reg_no.length() != 9){

            System.out.println("ERROR: INVALID LENGTH OF REG. NO.!");
        } 
        else if(!reg_no.matches("[A-Za-z0-9]+")){

            System.out.println("INVALILD REG NO.");
        }
        else{

            System.out.println("VALID REG. NO.");
        }               

        if(mob_no.length() != 10){

            System.out.println("ERROR: INVALID LENGTH OF MOB.NO.!");
        }
        
        int i=0;

        for (i = 0; i < mob_no.length(); i++) {
            
            if(!Character.isDigit(mob_no.charAt(i))){
                System.out.println("ERROR MOBILE NUMBER INVALID!");
                break;
            }
        }

        if(i == mob_no.length()-1){

            System.out.println("VALID MOBILE NUMBER");
        }

        in.close();

    }
    
    
}
