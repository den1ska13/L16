import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        byteRead();
        System.out.println(readFile("C:\\Users\\Denis\\IdeaProjects\\L16\\Test.txt"));
    }


    public static void byteRead() throws IOException {
        System.out.println("---------------Чтение по байтам---------------");
        InputStream is = new FileInputStream("C:\\Users\\Denis\\IdeaProjects\\L16\\Test.txt");
        byte[] temp = new byte[500];
        is.read(temp);
        System.out.println(new String(temp));
        System.out.println("---------------------------------------------");
    }

    public static String readFile(String filename) throws IOException {
        // создание символьного потока для чтения
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        StringBuilder sb = new StringBuilder();
        // чтение открытого файла построчно:
        while ((s = in.readLine()) != null)
            sb.append(s + "\n");
        in.close();
        return sb.toString();
    }
}