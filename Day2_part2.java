import java.util.Arrays;
import java.util.List;

/**
 * Created by ida on 2016-12-25.
 */
public class Day2_part2 {

    public static void main(String [] args) {

        String start = "5";

        List<String> input = Arrays.asList(
                        "RDLULDLDDRLLLRLRULDRLDDRRRRURLRLDLULDLDLDRULDDLLDRDRUDLLDDRDULLLULLDULRRLDURULDRUULLLUUDURURRD" +
                        "DLDLDRRDDLRURLLDRRRDULDRULURURURURLLRRLUDULDRULLDURRRLLDURDRRUUURDRLLDRURULRUDULRRRRRDLRLLDRRR" +
                        "DLDUUDDDUDLDRUURRLLUDUDDRRLRRDRUUDUUULDUUDLRDLDLLDLLLLRRURDLDUURRLLDLDLLRLLRULDDRLDLUDLDDLRDRR" +
                        "DLULRLLLRUDDURLDLLULRDUUDRRLDUDUDLUURDURRDDLLDRRRLUDULDULDDLLULDDDRRLLDURURURUUURRURRUUDUUURUL" +
                        "DLRULRURDLDRDDULDDULLURDDUDDRDRRULRUURRDDRLLUURDRDDRUDLUUDURRRLLRR",

                        "RDRRLURDDDDLDUDLDRURRLDLLLDDLURLLRULLULUUURLDURURULDLURRLRULDDUULULLLRLLRDRRUUDLUUDDUDDDRDURLU" +
                        "DDRULRULDDDLULRDDURRUURLRRLRULLURRDURRRURLDULULURULRRLRLUURRRUDDLURRDDUUDRDLLDRLRURUDLDLLLLDLR" +
                        "URDLLRDDUDDLDLDRRDLRDRDLRRRRUDUUDDRDLULUDLUURLDUDRRRRRLUUUDRRDLULLRRLRLDDDLLDLLRDDUUUUDDULUDDD" +
                        "UULDDUUDURRDLURLLRUUUUDUDRLDDDURDRLDRLRDRULRRDDDRDRRRLRDULUUULDLDDDUURRURLDLDLLDLUDDLDLRUDRLRL" +
                        "DURUDDURLDRDDLLDDLDRURRULLURULUUUUDLRLUUUDLDRUDURLRULLRLLUUULURLLLDULLUDLLRULRRLURRRRLRDRRLLUL" +
                        "LLDURDLLDLUDLDUDURLURDLUURRRLRLLDRLDLDRLRUUUDRLRUDUUUR",

                         "LLLLULRDUUDUUDRDUUURDLLRRLUDDDRLDUUDDURLDUDULDRRRDDLLLRDDUDDLLLRRLURDULRUUDDRRDLRLRUUULDDULDUU" +
                        "UDDLLDDDDDURLDRLDDDDRRDURRDRRRUUDUUDRLRRRUURUDURLRLDURDDDUDDUDDDUUDRUDULDDRDLULRURDUUDLRRDDRRD" +
                        "LRDLRDLULRLLRLRLDLRULDDDDRLDUURLUUDLLRRLLLUUULURUUDULRRRULURUURLDLLRURUUDUDLLUDLDRLLRRUUDDRLUD" +
                        "UDRDDRRDDDURDRUDLLDLUUDRURDLLULLLLUDLRRRUULLRRDDUDDDUDDRDRRULURRUUDLUDLDRLLLLDLUULLULLDDUDLULR" +
                        "DRLDRDLUDUDRRRRLRDLLLDURLULUDDRURRDRUDLLDRURRUUDDDRDUUULDURRULDLLDLDLRDUDURRRRDLDRRLUDURLUDRRL" +
                        "UDDLLDUULLDURRLRDRLURURLUUURRLUDRRLLULUULUDRUDRDLUL",

                        "LRUULRRUDUDDLRRDURRUURDURURLULRDUUDUDLDRRULURUDURURDRLDDLRUURLLRDLURRULRRRUDULRRULDLUULDULLULL" +
                        "DUDLLUUULDLRDRRLUURURLLUUUDDLLURDUDURULRDLDUULDDRULLUUUURDDRUURDDDRUUUDRUULDLLULDLURLRRLRULRLD" +
                        "LDURLRLDLRRRUURLUUDULLLRRURRRLRULLRLUUDULDULRDDRDRRURDDRRLULRDURDDDDDLLRRDLLUUURUULUDLLDDULDUD" +
                        "UUDDRURDDURDDRLURUDRDRRULLLURLUULRLUDUDDUUULDRRRRDLRLDLLDRRDUDUUURLRURDDDRURRUDRUURUUDLRDDDLUD" +
                        "LRUURULRRLDDULRULDRLRLLDRLURRUUDRRRLRDDRLDDLLURLLUDL",

                        "ULURLRDLRUDLLDUDDRUUULULUDDDDDRRDRULUDRRUDLRRRLUDLRUULRDDRRLRUDLUDULRULLUURLLRLLLLDRDUURDUUULL" +
                        "RULUUUDRDRDRUULURDULDLRRULUURURDULULDRRURDLRUDLULULULUDLLUURULDLLLRDUDDRRLULUDDRLLLRURDDLDLRLL" +
                        "LRDLDRRUUULRLRDDDDRUDRUULDDRRULLDRRLDDRRUDRLLDUDRRUDDRDLRUDDRDDDRLLRDUULRDRLDUDRLDDLLDDDUUDDRU" +
                        "LLDLLDRDRRUDDUUURLLUURDLULUDRUUUDURURLRRDULLDRDDRLRDULRDRURRUDLDDRRRLUDRLRRRRLLDDLLRLDUDUDDRRR" +
                        "UULDRURDLLDLUULDLDLDUUDDULUDUDRRDRLDRDURDUULDURDRRDRRLLRLDLU");

        for(String list : input) {

            for(char move : list.toCharArray()){

                switch (move){

                    case 'U':


                        if(start.equals("3")){

                            start = "1";
                        }


                        else if(start.equals("6")){

                            start = "2";
                        }

                        else if(start.equals("7")){

                            start = "3";
                        }


                        else if(start.equals("8")){

                            start = "4";
                        }

                        else if(start.equals("A")){

                            start = "6";
                        }

                        else if(start.equals("B")){

                            start = "7";
                        }

                        else if(start.equals("C")){

                            start = "8";
                        }

                        else if(start.equals("D")){

                            start = "B";
                        }

                        else{
                            start = start;
                        }
                        break;


                    case 'D':

                        if(start.equals("1")){

                            start = "3";
                        }


                        else if(start.equals("2")){

                            start = "6";
                        }

                        else if(start.equals("3")){

                            start = "7";
                        }


                        else if(start.equals("4")){

                            start = "8";
                        }

                        else if(start.equals("6")){

                            start = "A";
                        }

                        else if(start.equals("7")){

                            start = "B";
                        }

                        else if(start.equals("8")){

                            start = "C";
                        }

                        else if(start.equals("B")){

                            start = "D";
                        }

                        else{
                            start = start;
                        }
                        break;

                    case 'R':

                        if(start.equals("2")){

                            start = "3";
                        }

                        else if(start.equals("3")){

                            start = "4";
                        }

                        else if(start.equals("5")){

                            start = "6";
                        }

                        else if(start.equals("6")){

                            start = "7";
                        }
                        else if(start.equals("7")){

                            start = "8";
                        }

                        else if(start.equals("8")){

                            start = "9";
                        }

                        else if(start.equals("A")){

                            start = "B";
                        }

                        else if(start.equals("B")){

                            start = "C";
                        }
                        break;


                    case 'L':

                        if(start.equals("3")){

                            start = "2";
                        }

                        else if(start.equals("4")){

                            start = "3";
                        }

                        else if(start.equals("6")){

                            start = "5";
                        }

                        else if(start.equals("7")){

                            start = "6";
                        }
                        else if(start.equals("8")){

                            start = "7";
                        }

                        else if(start.equals("9")){

                            start = "8";
                        }

                        else if(start.equals("B")){

                            start = "A";
                        }

                        else if(start.equals("C")){

                            start = "B";
                        }
                        break;

                }
            }
            System.out.print(start);
        }
        System.out.println();
    }
}
