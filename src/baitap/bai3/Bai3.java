package baitap.bai3;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai3 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/baitap/bai3/text.txt");
        file.createNewFile();
        FileWriter fileWriter = new FileWriter("src/baitap/bai3/text.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Đề bài: Viết chương trình đọc nội dung từ file text và hiển thị các từ trùng lặp trong file đó.\n");
        bufferedWriter.write("Em yêu bác Hồ\n");
        bufferedWriter.close();
        FileReader reader = new FileReader("src/baitap/bai2/text.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String ces = bufferedReader.readLine();
        String text = "";
        while (ces != null) {
            text += ces;
            ces = bufferedReader.readLine();
        }
        String[] texts = text.split(" ");
        List<String> str = new ArrayList<>();
        for (int i = 0; i < texts.length; i++) {
            int cout = 0;
            for (int j = 0; j < texts.length; j++) {
                if (texts[i].equals(texts[j])) {
                    cout++;
                    if (cout > 1) {
                        if (!str.contains(texts[i])) {
                            str.add(texts[i]);
                        }
                    }
                }
            }
        }
        System.out.println(str);
        bufferedReader.close();
    }
}
