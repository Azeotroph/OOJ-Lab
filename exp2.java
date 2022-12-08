import java.util.Scanner;
class student {
    String usn;
    String name;
    int credits[]= new int[9];
    int marks[]= new int[9];

    public void enterInfo(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the usn");
        this.usn=sc.nextLine();
        System.out.println("enter the name");
        this.name=sc.nextLine();
        System.out.println("enter the credits");
        for(int i=0;i<9;i++){
            this.credits[i]=sc.nextInt();
        }
        System.out.println("enter the marks");
        for(int i=0;i<9;i++){
            this.marks[i]=sc.nextInt();
        }
    }

    public void displayInfo(){
        System.out.println("\nPRINTING STUDENT INFO: \n");
        System.out.println("USN: "+this.usn);
        System.out.println("NAME: "+this.name);
        System.out.print("CREDITS: ");
        for(int i=0;i<9;i++){
            System.out.print(this.credits[i]+" ");;
        }
        System.out.println();
        System.out.print("MARKS: ");
        for(int i=0;i<9;i++){
            System.out.print(this.marks[i]+" ");;
        }
    }

    public float calculateSGPA(){
        float sgpa;
        float totalcreds=0;
        for(int i=0;i<9;i++){
            totalcreds+=this.credits[i];
        }
        float gp=0;
        for(int i=0;i<9;i++){
            gp+=this.credits[i]*(((this.marks[i])/10)+1);
        }
        sgpa=gp/totalcreds;
        return sgpa;
    }
}

public class exp2{
    public static void main(String args[]){
        student s1= new student();
        s1.enterInfo();
        s1.displayInfo();
        float sgpa=s1.calculateSGPA();
        System.out.println("\nSGPA: "+sgpa);
    }
}