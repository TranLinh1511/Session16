package baitap.bai2;

import java.io.*;

public class Bai2 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/baitap/bai2/text.txt");
        boolean check = file.createNewFile();
        FileWriter fileWriter = new FileWriter("src/baitap/bai2/text.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Em yêu bác Hồ\n");
        bufferedWriter.write("Em yêu bác Hồ\n");
        bufferedWriter.close();
        FileReader reader = new FileReader("src/baitap/bai2/text.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String ces = bufferedReader.readLine();
        int numberOfLine = 0;
        while (ces != null) {
            numberOfLine++;
            System.out.println(ces);
            ces = bufferedReader.readLine();
        }
        System.out.println("Số dòng của text là: " + numberOfLine);
        bufferedReader.close();
    }
}
