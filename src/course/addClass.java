package course;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class addClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("ClassInfo.txt"));
            String contentLine = br.readLine();
            while(contentLine != null) {
                System.out.println(contentLine);
                contentLine = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if(br != null) {
                    br.close();
                }
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}
