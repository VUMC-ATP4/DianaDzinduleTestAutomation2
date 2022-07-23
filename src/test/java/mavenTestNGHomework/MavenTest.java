package mavenTestNGHomework;
import com.github.lalyos.jfiglet.FigletFont;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class MavenTest {

    public static void main(String[] args) throws IOException {
        String asciiArt = FigletFont.convertOneLine("Uzdevums Nr.3 + Diāna Dzindule");
        System.out.println(asciiArt);
        }
    }
