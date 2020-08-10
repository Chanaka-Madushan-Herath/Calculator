package Assignment;

public class Sum extends Read_file{
    public void Add_numbers(){
        Double Answer;
        System.out.println("You select Addition ");

        Double[] x=new Double[2];
        x=file_read();

        Answer=x[0]+x[1];

        System.out.println("Answer : "+Answer+"\n");
    }
}
