import java.io.*;

public class SumCalculate {
    public static void main(String[] args) {
        try {
            int sum = calculate();
            System.out.println("Tong = "+sum);
        } catch (IOException ioException){
            System.out.println("file chua noi dung khong hop le");
        }
        catch (NumberFormatException e){
            System.out.println("file chua noi dung khong phai so");
        }
    }
    public static int calculate() throws IOException {
        File file = new File("num.txt");
        FileReader fileReader = null;
            fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            int sum = 0;
            while ((line=reader.readLine())!=null) {
                sum+=Integer.parseInt(line);
            }
        return sum;

    }
}
