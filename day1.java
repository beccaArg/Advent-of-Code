import java.nio.file.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class calories {
    public static void main(String[] args) {
        FileSystem fs = FileSystems.getDefault();
        Path filePath = fs.getPath("C:\\Users\\argal\\Documents\\Advent of Code\\Advent of Code 1\\calories.txt");
        InputStream input = null;
        try {
            input = Files.newInputStream(filePath);
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String s = null;
            s = reader.readLine();
            int biggestTotal = 0;
            int secondBiggestTotal = 0;
            int thirdBiggestTotal = 0;
            int currentTotal = 0;
            ArrayList<Integer> totals = new ArrayList<Integer>();
            while (!s.equals("QUIT")){
                System.out.println(s);
                s = reader.readLine();
                if (s.isEmpty() || s.equals("QUIT")) {
                    totals.add(currentTotal);
                    currentTotal = 0;
                }
                else {
                    currentTotal = currentTotal + Integer.parseInt(s);
                    }
                }
            input.close();
            Collections.sort(totals, Collections.reverseOrder());
            System.out.println(totals);
            int biggest = totals.get(0);
            int second = totals.get(1);
            int third = totals.get(2);
            System.out.println(biggest + second + third);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
