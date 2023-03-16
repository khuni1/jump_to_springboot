package crawling;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
@RequiredArgsConstructor
@Controller
public class Hellocontroller {
    private final Crawlingdevice crawlingdevice;
    @GetMapping("/hello")
    @ResponseBody
    public String hello() throws IOException {
        String postnames = crawlingdevice.getPostnames();
        postnames = postnames.replaceAll("\n","<br>"); //\n을 <br>로 대체 -
        return postnames;
    }
}