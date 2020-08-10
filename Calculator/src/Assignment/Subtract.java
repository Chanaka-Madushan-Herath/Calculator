package Assignment;

public class Subtract extends Read_file {
    public void subtract_numbers(){
        Double Answer;
        System.out.println("You select Subtraction ");

        Double[] x=new Double[2];
        x=file_read();

        Answer=x[0]-x[1];

        System.out.println("Answer : "+Answer+"\n");
    }
}
