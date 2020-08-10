package Assignment;

public class Sum extends Read_file{
    public void Add_numbers(){
        int Answer;
        System.out.println("You choose Addition ");

        int[] x=new int[2];
        x=file_read();

        Answer=x[0]+x[1];

        System.out.println("Answer : "+Answer+"\n");
    }
}
