import java.io.*;
import java.net.*;
import java.util.*;
import static java.util.Arrays.*;


public class Day3 {

    public static void main(String[]args) {

        int counter = 0;

        try {
            URL path = Day3.class.getResource("input");

            Scanner input = new Scanner(new File(path.getFile()));

            while (input.hasNextLine()) {

                String line = input.nextLine();
                String[] split = line.split("\\s+");

                int[] sides = {0, 0, 0};

                sides[0] = Integer.parseInt(split[1]);
                sides[1] = Integer.parseInt(split[2]);
                sides[2] = Integer.parseInt(split[3]);
                sort(sides);

                if ((sides[0] + sides[1]) > sides[2]) {
                    counter++;
                }

            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        System.out.println(counter);
    }
}
