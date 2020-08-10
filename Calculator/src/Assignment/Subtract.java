package Assignment;

import static java.lang.System.exit;

public class Subtract extends Read_file {
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
}
