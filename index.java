import java.util.Scanner;
class Main {
    public static void main(String[] args) {
     System.out.println("enter a number");
     Scanner scn = new Scanner(System.in);
     int a = scn.nextInt();
     System.out.println("enter a number");
     int b = scn.nextInt();
      System.out.println("enter a number");
     int c = scn.nextInt();
     if(a>b){
         System.out.println("a is greater");
     }else if(b>c){
         System.out.println("b is greater");
     }else{
         System.out.println("c is greater");
     }
     }
}
