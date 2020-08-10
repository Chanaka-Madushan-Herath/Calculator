package Assignment;

public class Multipy extends Read_file{
    public void multypy_numbers(){
        Double Answer;
        System.out.println("You select Multiplication ");

        Double[] x=new Double[2];
        x=file_read();

        Answer=x[0]*x[1];

        System.out.println("Answer : "+Answer+"\n");
    }
}
