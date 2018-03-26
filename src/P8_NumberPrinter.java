import java.util.Scanner;

/*
	ISYS 320
	Name(s):AlfurhudSolomon
	Date: March25, 2018
*/

 public class P8_NumberPrinter {

	
    public static void main(String[] args) {
       int x=1;
        int y=2;

        
        PrintNumbers(x);
        printStepRange(x,y);

       
    }
    public static void PrintNumbers(int upperbound){
        System.out.println("Enter maximum number");
         Scanner bound=new Scanner(System.in);
        upperbound=bound.nextInt();

     
        int lowerbound=1;
        for(int number=lowerbound;number<=upperbound;number++){
            System.out.print("["+number+"],");
        }
    }
    public static void printStepRange(int upperbound,int step){
        Scanner bound=new Scanner(System.in);
        System.out.println("Enter maximum number");
        System.out.println("Enter step range");

         
        upperbound=bound.nextInt();
        step=bound.nextInt();

     
        int lowerbound=1;
        for(int number=lowerbound;number<=upperbound;number+=step){

           
            System.out.print("["+number+"],");
        }
    }
}

