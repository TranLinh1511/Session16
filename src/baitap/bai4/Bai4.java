package baitap.bai4;

import java.io.*;
import java.util.Arrays;

public class Bai4 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/baitap/bai4/text.txt");
        boolean check = file.createNewFile();
        FileWriter fileWriter = new FileWriter("src/baitap/bai4/text.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Em yêu bác Hồ\n");
        bufferedWriter.close();
        FileReader reader = new FileReader("src/baitap/bai4/text.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String ces = bufferedReader.readLine();
        String text = "";
        while (ces != null) {
            text += ces.toLowerCase();
            ces = bufferedReader.readLine();
        }
        String[] texts = text.split(" ");
        Arrays.sort(texts);
        System.out.println(Arrays.toString(texts));
    }
}
