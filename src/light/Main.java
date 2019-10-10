package light;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int numberOFLEDs=scanner.nextInt();
        LED[] LED =new LED[numberOFLEDs];
        for (int i=0;i<numberOFLEDs;i++){

            String colourName=scanner.next();
            boolean working=scanner.nextBoolean();
            LED[i]=new LED(colourName,working);
        }
        LEDStrip strip= new LEDStrip(LED);
        strip.printResult();

        }


    }

