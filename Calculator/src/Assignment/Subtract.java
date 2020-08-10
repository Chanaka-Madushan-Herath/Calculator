package Assignment;

public class Subtract extends Read_file {
    public void subtract_numbers(){
        int Answer;
        System.out.println("You choose Subtraction ");

        int[] x=new int[2];
        x=file_read();

        Answer=x[0]-x[1];

        System.out.println("Answer : "+Answer+"\n");
    }
}
