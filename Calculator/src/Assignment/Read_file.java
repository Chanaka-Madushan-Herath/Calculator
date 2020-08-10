package Assignment;

import java.io.*;

import static java.lang.System.exit;

public abstract class Read_file {
    public Double[] file_read(){

        Double[] inputs = new Double[2];
        try {
            FileReader read_file = new FileReader("Calculator.txt");
            BufferedReader buf_reader = new BufferedReader(read_file);

            String numbers;
            int x=0;

            while((numbers = buf_reader.readLine())!=null){
                inputs[x]=Double.parseDouble(numbers);
                x++;
            }
            read_file.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Unable to find input file");
            exit(0);
        }
        catch (NumberFormatException e){
            System.out.println("Input only numbers for 'Calculator.txt' ");
            exit (0);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return inputs;
    }
}
