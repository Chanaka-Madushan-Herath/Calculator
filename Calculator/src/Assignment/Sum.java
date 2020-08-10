package Assignment;

import static java.lang.System.exit;

public class Sum extends Read_file{
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
}
