package Assignment;

import static java.lang.System.exit;

public class Operations extends Read_file{
    public void Add_numbers(){
        try{
            Double Answer;
            System.out.println("You select Addition ");

            Double[] x=new Double[2];
            x=file_read();

            Answer=x[0]+x[1];

            System.out.println("Answer : "+Answer+"\n");
        }
        catch (NullPointerException e){
            System.out.println("Enter two number for 'Calculator.txt' ");
            exit(0);
        }
    }

    public void subtract_numbers(){
        try{
            Double Answer;
            System.out.println("You select Subtraction ");

            Double[] x=new Double[2];
            x=file_read();

            Answer=x[0]-x[1];

            System.out.println("Answer : "+Answer+"\n");
        }
        catch (NullPointerException e){
            System.out.println("Enter two number for 'Calculator.txt' ");
            exit(0);
        }
    }

    public void multypy_numbers(){
        try{
            Double Answer;
            System.out.println("You select Multiplication ");

            Double[] x=new Double[2];
            x=file_read();

            Answer=x[0]*x[1];

            System.out.println("Answer : "+Answer+"\n");

        }
        catch (NullPointerException e){
            System.out.println("Enter two number for 'Calculator.txt' ");
            exit(0);
        }
    }

    public void divide_numbers(){
        try{
            Double Answer;
            System.out.println("You select Division");

            Double[] x= new Double[2];
            x=file_read();

            Answer= x[0]/x[1];

            System.out.println( "Answer : "+Answer+"\n");

        }
        catch (NullPointerException e){
            System.out.println("Enter two number for 'Calculator.txt' ");
            exit(0);
        }
    }
}
