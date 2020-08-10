package Assignment;

public class Multipy extends Read_file{
    public void multypy_numbers(){
        int Answer;
        System.out.println("You choose Multiplication ");

        int[] x=new int[2];
        x=file_read();

        Answer=x[0]*x[1];

        System.out.println("Answer : "+Answer+"\n");
    }
}
