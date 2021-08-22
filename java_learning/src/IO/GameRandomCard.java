package IO;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//明日方舟抽卡
public class GameRandomCard {
    public static void main(String[] args) throws IOException {
        ArrayList<String> cards = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("javaIO\\InputFrom.txt"));
        String line = new String();
        while ((line=br.readLine())!=null){
            cards.add(line);
        }
        br.close();
//        System.out.println(cards);
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        while (sc.nextInt() == 1){
            System.out.println(cards.get(ra.nextInt(11)));
        }
    }
}
