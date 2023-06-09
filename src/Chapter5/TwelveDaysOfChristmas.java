package Chapter5;

import java.util.Scanner;

public class TwelveDaysOfChristmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("THE FIRST DAY OF CHRISTMAS SONG");
        System.out.println("PRESS 1 FOR FIRST STANZA\n" +
                "PRESS 2 FOR SECOND STANZA\n" +
                "PRESS 3 FOR THIRD STANZA\n" +
                "PRESS 4 FOR FOURTH STANZA\n" +
                "PRESS 5 FOR FIFTH STANZA\n" +
                "PRESS 6 FOR SIXTH STANZA\n" +
                "PRESS 7 FOR SEVENTH STANZA\n" +
                "PRESS 8 FOR EIGHT STANZA\n" +
                "PRESS 9 FOR NINTH STANZA\n" +
                "PRES 10 FOR TENTH STANZA\n" +
                "PRESS 11 FOR ELEVENTH STANZA\n" +
                "PRESS 12 FOR TWELFTH STANZA\n" +
                "PRESS 99 TO QUIT");
        for(int counter = 0; counter <= 12; counter++){
        int lyrics = input.nextInt();


            switch (lyrics) {
                case 1:
                    System.out.println("on the first day of christmas my true love gave to me, a partridge in a pear tree ");
                    break;
                case 2:
                    System.out.println("on the second day of christmas my true love gave to me, " +
                            "2 turtle doves and a partridge in a pear tree");
                    break;
                case 3:
                    System.out.println("on the third day of christmas my true love gave to me three french hens\n two turtle doves\n and a partridge in a pear tree");
                    break;
                case 4:
                    System.out.println("on the fourth day of christmas my true gave to me\n four colly birds,\n three french hens,\n two turtle doves\n and a partridge in a pear tree");
                    break;
                case 5:
                    System.out.println("on the fifth day of christmas my true love gave to me five golden rings, four colly birds, three french hens two turtle doves and a partridge in a pear tree  ");
                    break;
                case 6:
                    System.out.println("on the sixth day of christmas my true love gave to me six geese a-laying, five golden rings, four colly birds, three french hens two turtle doves and a partridge in a pear tree");
                    break;
                case 7:
                    System.out.println("on the seventh day of christmas my true love gave to me Seven swans are swimming,six geese a-laying, five golden rings, four colly birds, three french hens two turtle doves and a partridge in a pear tree");
                    break;
                case 8:
                    System.out.println("on the eight day of christmas my true love gave to me eight maids are milking, Seven swans are swimming,six geese a-laying, five golden rings, four colly birds, three french hens two turtle doves and a partridge in a pear tree");
                    break;
                case 9:
                    System.out.println("on the ninth day of christmas my true love gave to me nine drummers drumming,eight maids are milking, Seven swans are swimming,six geese a-laying, five golden rings, four colly birds, three french hens two turtle doves and a partridge in a pear tree");
                    break;
                case 10:
                    System.out.println("on the tenth day of christmas my true love gave to me Ten pipers pipping,nine drummers drumming,eight maids are milking, Seven swans are swimming,six geese a-laying, five golden rings, four colly birds, three french hens two turtle doves and a partridge in a pear tree");
                    break;
                case 11:
                    System.out.println("on the eleventh day of christmas my true love gave to me Eleven ladies dancing,Ten pipers pipping,nine drummers drumming,eight maids are milking, Seven swans are swimming,six geese a-laying, five golden rings, four colly birds, three french hens two turtle doves and a partridge in a pear tree");
                    break;
                case 12:
                    System.out.println("on the twelfth day of christmas my true love gave to me twelve fiddlers fiddling,  Eleven ladies dancing,Ten pipers pipping,nine drummers drumming,eight maids are milking, Seven swans are swimming,six geese a-laying, five golden rings, four colly birds, three french hens two turtle doves and a partridge in a pear tree");
                    break;
                case 13:
                    if (lyrics == 99) {
                        break;
                    }

            }


        }


    }
}
