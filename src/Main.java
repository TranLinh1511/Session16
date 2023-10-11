import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File outputDic = new File("output");
        outputDic.mkdir();
        File output = new File("output/hello.txt");
        if (output.createNewFile()) {
            File subFolder = new File("output/subfolder");
            subFolder.mkdir();
            new File("output/subfolder/output1").mkdir();
            new File("output/subfolder/output").createNewFile();
            System.out.println("Tạo hoàn thành!!");
            boolean subfolder1 = subFolder.renameTo(new File("output/subfolder1"));
            if (subfolder1) {
                System.out.println("Đổi tên thành công!!");
            } else {
                System.out.println("Đổi tên thất bại!!");
            }
        }
//        renderFile(outputDic);
        FileReader fileReader = new FileReader("output.txt");
        int c = fileReader.read();
        System.out.println(c);
        BufferedReader reader = new BufferedReader(fileReader);
        String s = reader.readLine();
        while (s != null) {
            System.out.println(s);
            s =reader.readLine();
        }
        reader.close();
        FileWriter reader1 = new FileWriter("output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(reader1);
        char[] av = {'H', 'e', 'l', 'l', 'o'};
        bufferedWriter.write(av);
        bufferedWriter.write("Vcl em");
        bufferedWriter.close();
    }

    public static void renderFile(File file) throws StackOverflowError {
        System.out.println(file.getName());
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println("-" + file1.getName());
            if (file1.isDirectory()) {
                File[] files1 = file1.listFiles();
                for (File file2 : files1) {
                    System.out.println("--" + file2.getName());
                }
            }
        }

    }
}