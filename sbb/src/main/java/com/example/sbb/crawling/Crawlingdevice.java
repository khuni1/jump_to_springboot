package crawling;

import jakarta.annotation.PostConstruct;
import org.jsoup.Jsoup;
import org.springframework.stereotype.Service;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;

@Service
public class Crawlingdevice {
    private static String PNU_URL = "https://eng.pusan.ac.kr/eng/23336/subview.do"; //url 설정

    @PostConstruct
    public String getPostnames() throws IOException{

        Document doc = Jsoup.connect(PNU_URL).get(); //.get() - html 요소들을 불러옴.
        //System.out.println(doc);
        Elements contents = doc.select("._artclTdTitle"); //.sellect - css쿼리의 분류에 따라 불러옴.

        String Postnames = "";
        for( Element element : contents ) {
            Postnames = Postnames + element.text() + "\n";

        }
        return Postnames;
    }

}
