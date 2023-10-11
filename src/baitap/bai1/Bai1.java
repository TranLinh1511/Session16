package baitap.bai1;

import java.io.*;

public class Bai1 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/baitap/bai1/text.txt");
        boolean check = file.createNewFile();
        FileWriter fileWriter = new FileWriter("src/baitap/bai1/text.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Em yêu bác Hồ");
        bufferedWriter.close();
        FileReader reader = new FileReader("src/baitap/bai1/text.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String ces = bufferedReader.readLine();
        String text  = "";
        while (ces != null) {
            System.out.println(ces);
            text += ces;
            ces = bufferedReader.readLine();
        }

        System.out.println("Số từ trong file là: " + text.split(" ").length);
        bufferedReader.close();
    }
}
