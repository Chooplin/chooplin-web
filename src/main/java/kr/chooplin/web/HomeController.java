package kr.chooplin.web;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class HomeController {

    @GetMapping("/")
    public String index(HttpServletRequest request) {
        log.info("[Request Remote Address : {}]" ,request.getRemoteAddr());
        return "index";
    }
}
