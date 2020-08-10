package Assignment;

public class Divide extends Read_file{
    public void divide_numbers(){
        Double Answer;
        System.out.println("You select Division");

        Double[] x= new Double[2];
        x=file_read();

        Answer= x[0]/x[1];

        System.out.println( "Answer : "+Answer+"\n");
    }
}
