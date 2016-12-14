public class Day1 {

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
        int dir = 1;
        int y = 0;
        int x = 0;
        int dis;
        char turn = ' ';

        for (int i=0;i<inputArr.length;i++){

            dis = Integer.parseInt(inputArr[i].substring(1));
            turn = inputArr[i].charAt(0);

            switch(turn) {
                case 'R':
                    switch(dir) {
                        case 2:
                            dir = -1;
                            y -= dis;
                            break;

                        case 1:
                            dir = 2;
                            x += dis;
                            break;

                        case -1:
                            dir = -2;
                            x -= dis;
                            break;

                        case -2:
                            dir = 1;
                            y += dis;
                            break;
                    }
                    break;

                case 'L':
                    switch(dir) {
                        case 2:
                            dir = 1;
                            y += dis;
                            break;

                        case 1:
                            dir = -2;
                            x -= dis;
                            break;

                        case -1:
                            dir = 2;
                            x += dis;
                            break;

                        case -2:
                            dir = -1;
                            y -= dis;
                            break;
                    }
                    break;
            }
        }

        System.out.print("Easter Bunny HQ is ");
        System.out.println(Math.abs(x) + Math.abs(y) + " blocks away");
    }
}
