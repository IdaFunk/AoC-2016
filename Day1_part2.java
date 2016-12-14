import java.util.ArrayList;

public class Day1_part2 {

    public static void main(String[] args) {

        String input = "L5, R1, R3, L4, R3, R1, L3, L2, R3, L5, L1, L2, " +
                "R5, L1, R5, R1, L4, R1, R3, L4, L1, R2, R5, R3, " +
                "R1, R1, L1, R1, L1, L2, L1, R2, L5, L188, L4, R1, " +
                "R4, L3, R47, R1, L1, R77, R5, L2, R1, L2, R4, L5, " +
                "L1, R3, R187, L4, L3, L3, R2, L3, L5, L4, L4, R1, " +
                "R5, L4, L3, L3, L3, L2, L5, R1, L2, R5, L3, L4, " +
                "R4, L5, R3, R4, L2, L1, L4, R1, L3, R1, R3, L2, " +
                "R1, R4, R5, L3, R5, R3, L3, R4, L2, L5, L1, L1, " +
                "R3, R1, L4, R3, R3, L2, R5, R4, R1, R3, L4, R3, " +
                "R3, L2, L4, L5, R1, L4, L5, R4, L2, L1, L3, L3, " +
                "L5, R3, L4, L3, R5, R4, R2, L4, R2, R3, L3, R4, " +
                "L1, L3, R2, R1, R5, L4, L5, L5, R4, L5, L2, L4, " +
                "R4, R4, R1, L3, L2, L4, R3";


        String[] inputArr = input.split(", ");

        ArrayList<int[]> visited = new ArrayList<>();

        int[] firstDoubleVisited = null;
        int dir = 1;
        int x = 0, y = 0;
        int xOffset, yOffset;

        for (String in : inputArr) {

            if (in.startsWith("L")) {
                dir++;
            } else {
                dir--;
            }


            int value = Integer.valueOf(in.substring(1));

            yOffset = (int) (Math.sin(dir * (Math.PI / 2)) * (value));
            xOffset = (int) (Math.cos(dir * (Math.PI / 2)) * (value));
            x += xOffset;
            y += yOffset;


            //x
            if (xOffset > 0) for (int i = 1; i <= xOffset; i++) {
                visited.add(new int[]{x - xOffset + i, y});
            }
            if (xOffset < 0) for (int i = -1; i >= xOffset; i--){
                visited.add(new int[]{x - xOffset + i, y});
            }

            //y
            if (yOffset > 0) for (int i = 1; i <= yOffset; i++) {
                visited.add(new int[]{x, y - yOffset + i});
            }
            if (yOffset < 0) for (int i = -1; i >= yOffset; i--) {
                visited.add(new int[]{x, y - yOffset + i});
            }



            if (firstDoubleVisited == null){

                for (int i = 0; i < visited.size(); i++) {

                    for (int n = 0; n < visited.size(); n++) {

                        if (n != i && visited.get(i)[0] == visited.get(n)[0] && visited.get(i)[1] == visited.get(n)[1]) {
                            firstDoubleVisited = visited.get(i);
                            break;
                        }
                    }
                }
            }
        }

        if (firstDoubleVisited != null) {
            System.out.println("First double visited length: " + (Math.abs(firstDoubleVisited[0])
                    + Math.abs(firstDoubleVisited[1])));
        }
    }
}
