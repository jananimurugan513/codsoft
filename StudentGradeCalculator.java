import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter the number of subjects: ");  

    int numberOfSubjects = sc.nextInt();  

    int sum = 0;  

    for (int i = 1; i <= numberOfSubjects; i++) {  
        System.out.print("Enter marks for subject " + i + ": ");  
        int marks = sc.nextInt();  
        sum += marks;  
    }  

    double avgPercentage = (double) sum / numberOfSubjects;  

     
    System.out.println("Total Marks: " + sum);  
    System.out.println("Average Percentage: " + avgPercentage + "%");  

    if (avgPercentage >= 90) {  
        System.out.println("Grade A");  
    } else if (avgPercentage >= 80) {  
        System.out.println("Grade B");  
    } else if (avgPercentage >= 70) {  
        System.out.println("Grade C");  
    } else if (avgPercentage >= 60) {  
        System.out.println("Grade D");  
    } else if (avgPercentage >= 50) {  
        System.out.println("Grade E");  
    } else {  
        System.out.println("Grade F");  
    }  
}

}
    

