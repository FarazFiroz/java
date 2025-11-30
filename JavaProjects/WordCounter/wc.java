import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class wc {
    public static void main(String[] args) throws IOException{
        String option = "";
        String filename = "";
        String content = "";

        /* System.out.println("Hello, welcome to word counter(wc) \n \n" +
                "Usage: \n" +
                "Use java wc -c filename -> to count bytes \n" +
                "Use java wc -l filename -> to count lines \n" +
                "Use java wc -w filename -> to count words \n" +
                "Use java wc -m filename -> to count characters \n" +
                "Use java wc filename -> to count all"); */
        
        if(args.length == 0){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            String line;
            while((line = br.readLine()) != null){
                sb.append(line + "\n");
            }
            content = sb.toString();
            if(content.isEmpty()) return;
        } else if(args.length == 1){
            filename = args[0];
            content = Files.readString(Path.of(filename));
        } else {
            option = args[0];
            filename = args[1];
            content = Files.readString(Path.of(filename));
        }

        switch(option){
            case "-c": // byte count 
                long byteCount = content.getBytes().length;
                System.out.println(byteCount + " bytes in " + filename);
                break;
            
            case "-l": // count lines
                long linesCount = content.lines().count();
                System.out.println(linesCount + " lines in " + filename);
                break;
            
            case "-w": // count words
                long wordCount = Arrays.stream(content.split("\\s"))
                                        .filter(s -> !s.isEmpty())
                                        .count();
                System.out.println(wordCount + " words in " + filename);
                break;

            case "-m": // count characters
                long charCount = content.length();
                System.out.println(charCount + " characters in " + filename);
                break;

            default:
                long byteCountAll = content.getBytes().length;
                long linesCountAll = content.lines().count();
                long wordCountAll = Arrays.stream(content.split("\\s"))
                                        .filter(s -> !s.isEmpty())
                                        .count();
                long charCountAll = content.length();

                System.out.println(byteCountAll + " bytes \n" +
                                    linesCountAll + " lines \n" +
                                    wordCountAll + " words \n" +
                                    charCountAll + " characters ");
            
        }
    }
}