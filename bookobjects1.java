import java.util.*;
class book{
     String name,author;
     int price,num_page;
     book(String n,String a,int p,int np){
                   name=n;
                   author=a;
                   price=p;
                   num_page=np;
                   }
     void gets(){
          System.out.println("The details of the objects are \n It contains name,author,price,no of pages");
          }
     public String toString(){
          return name+" "+author+" "+price+" "+num_page;
     }
}

class bookobjects1{
      public static void main(String args[]){
                 Scanner sc=new Scanner(System.in);
                 String n,a;
                 int p,np;
                 int n1;
                 n1=sc.nextInt();
                 book b[]=new book[n1];
                 for(int i=0;i<n1;i++){
                     System.out.println("Name of Book");
                     n=sc.next();
                     System.out.println("Author of Book");
                     a=sc.next();
                     System.out.println("Price of Book");
                     p=sc.nextInt();
                     System.out.println("Number of pages in Book");
                     np=sc.nextInt();
                     b[i]=new book(n,a,p,np);
                     }
                 for(int i=0;i<n1;i++){
                     b[i].gets();
                     System.out.println((i+1)+"th"+" "+"book");
                     System.out.println(b[i]);
                     }
                 }
} 
