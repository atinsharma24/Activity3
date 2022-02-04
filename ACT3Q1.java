// DONE

import java.util.Scanner;

public class Q11 {

    // public static void subject(int[] arr[][]){

        // Scanner in = new Scanner(System.in);

        // int sem;
        // int subjects;

        // System.out.println("Enter number of semesters");
        // sem = in.nextInt();
        
        // for (int i = 0; i < sem; i++) {
            
        //     System.out.println("Enter marks of subjects for " + (i+1) + " sem");

        //     for (int j = 0; j < arr.length; j++) {

        //         arr[i][j] = in.nextInt();
                
        //     }
        // }

        // for (int i = 0; i < sem; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {

        //         System.out.print(arr[i][j]);
                
        //     }
        //     System.out.println();
            
        // }

        // in.close();
        
    // }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int sem;
        int subjects;

        System.out.println("Enter number of semesters");
        sem = in.nextInt();
        int arr[][] = new int[sem][];
        
        for (int i = 0; i < sem; i++) {

            System.out.print("Enter number of subjects for " + (i+1) + " Sem: ");

            subjects = in.nextInt();
            arr[i] = new int[subjects];
            
            System.out.println("Enter marks of subjects for " + (i+1) + " sem");

            for (int j = 0; j < subjects; j++) {

                arr[i][j] = in.nextInt();
                
            }
        }

        System.out.println("Given jagged array is: ");
        // ENHANCED LOOP AS FOLLOWS

        for (int i = 0; i < sem; i++) {
            for (int j:arr[i]) {

                System.out.print(arr[i][j] + " ");
                
            }

            System.out.println();
            
        }
        int pass = 0;
        int fail = 0;

        for (int i = 0; i < sem; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if(arr[i][j] >= 40){

                    pass += 1;
                }
                else if(arr[i][j] < 40){

                    fail +=1;
                }
                
            }            
        }

        System.out.println("Passed subjects: " + pass + "\nFailed Subjects: " + fail);

        in.close();
        

    }
    
}
