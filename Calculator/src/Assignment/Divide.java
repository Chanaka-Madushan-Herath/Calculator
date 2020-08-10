package Assignment;

public class Divide extends Read_file{
    public void divide_numbers(){
        float Answer;
        System.out.println("You choose Division");

        int[] x=new int[2];
        x=file_read();

        Answer=(float) x[0]/x[1];

        System.out.println( "Answer : "+Answer+"\n");
    }
}
