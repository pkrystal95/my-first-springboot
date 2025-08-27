package com.example.firstboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloJspController {

    // 💡 @GetMapping: HTTP GET 요청을 특정 URL 경로와 매핑합니다.
    // 클라이언트가 "/hello-jsp" 경로로 GET 요청을 보내면 이 메소드가 호출됩니다.
    @GetMapping("/hello-jsp")
    public String helloJsp() {
        // 💡 반환값 "hello"는 뷰의 논리적인 이름입니다.
        // application.properties의 설정(prefix, suffix)에 따라,
        // 스프링은 "/WEB-INF/views/hello.jsp" 파일을 찾아 렌더링합니다.
        return "hello";
    }
}