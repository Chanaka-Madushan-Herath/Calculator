package Assignment;

import java.io.*;

public abstract class Read_file {
    public int[] file_read(){

        int[] inputs =new int[2];

        File new_file = new File("Calculator.txt");
        try {
            FileReader read_file = new FileReader(new_file);
            BufferedReader buf_reader = new BufferedReader(read_file);

            String numbers;
            int x=0;

            while((numbers = buf_reader.readLine())!=null){
                inputs[x]=Integer.parseInt(numbers);
                x++;
            }
            read_file.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return inputs;
    }
}
