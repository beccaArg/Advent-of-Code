import java.io.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;


public class day2 {
    public static void main(String[] args) {
        FileSystem fs = FileSystems.getDefault();
        Path filePath = fs.getPath("C:\\Users\\argal\\Documents\\Other\\Advent of Code\\rock.txt");
        InputStream input = null;
        try {
            input = Files.newInputStream(filePath);
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String s = "";
            s = reader.readLine();
            int score = 0;
            while (!s.equals("QUIT")){
                System.out.println(s);
                if (s.equals("QUIT")) break;
                else if (s.charAt(0) == 'A' && s.charAt(2) == 'X') score = score + 3; // s
                else if (s.charAt(0) == 'B' && s.charAt(2) == 'Y') score = score + 3 + 2; // p
                else if (s.charAt(0) == 'C' && s.charAt(2) == 'Z') score = score + 6 + 1; // r
                else if (s.charAt(0) == 'A' && s.charAt(2) == 'Y') score = score + 3 + 1; // r
                else if (s.charAt(0) == 'B' && s.charAt(2) == 'Z') score = score + 6 + 3; // s
                else if (s.charAt(0) == 'C' && s.charAt(2) == 'X') score = score + 2; // p
                else if (s.charAt(0) == 'A' && s.charAt(2) == 'Z') score = score + 6 + 2; // p
                else if (s.charAt(0) == 'B' && s.charAt(2) == 'X') score = score + 1; // r
                else if (s.charAt(0) == 'C' && s.charAt(2) == 'Y') score = score + 3 + 3; // s

//                else if (s.charAt(0) == 'A' && s.charAt(2) == 'X') score = score + 3 + 1;
//                else if (s.charAt(0) == 'B' && s.charAt(2) == 'Y') score = score + 3 + 2;
//                else if (s.charAt(0) == 'C' && s.charAt(2) == 'Z') score = score + 3 + 3;
//                else if (s.charAt(0) == 'A' && s.charAt(2) == 'Y') score = score + 6 + 2;
//                else if (s.charAt(0) == 'B' && s.charAt(2) == 'Z') score = score + 6 + 3;
//                else if (s.charAt(0) == 'C' && s.charAt(2) == 'X') score = score + 6 + 1;
//                else if (s.charAt(0) == 'A' && s.charAt(2) == 'Z') score = score + 3;
//                else if (s.charAt(0) == 'B' && s.charAt(2) == 'X') score = score + 1;
//                else if (s.charAt(0) == 'C' && s.charAt(2) == 'Y') score = score + 2;

                s = reader.readLine();

            }
            input.close();
            System.out.println(score);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
