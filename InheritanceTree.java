import java.util.*;

class Father {
    int f_age;

    public Father(int fa) // Father Constructor
    {
        try {
            if (f_age < 0)
                throw new Exception("Error! Age is less than 0");
            else
                f_age = fa;
        } catch (Exception e) // This never gets caught!?!
        {
            System.out.println("Caught : " + e);
        }
    }
}

class Son extends Father {
    int s_age;

    public Son(int fa, int sa) // Son's Constructor
    {
        super(fa);
        try {
            s_age=sa;
            if (s_age < 0)
                throw new Exception("Error! Son's age is less than 0");
            else if (s_age >= f_age)
                throw new Exception("Error! Son's age cannot be more than the Father's age");
            else
                s_age = sa;
        } catch (Exception e) {
            System.out.println("Caught : " + e);
        }
    }

    void display() {
        System.out.println("Father's age = " + f_age);
        System.out.println("Son's age = " + s_age);
    }
}

class InheritanceTree extends Exception 
{
    public static void main(String args[]) 
{
        int a, b;
        System.out.println("Enter the father's age");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Enter the son's age");
        b = sc.nextInt();
        Son ob1 = new Son(a, b);
        ob1.display();
    }
}