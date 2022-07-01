package com.example.crudtest.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
@RequiredArgsConstructor //생성자가 알아서 만들어줌
public class IndexController {

/*    @GetMapping // page를 보여줄 때 (자주 씀)
    @PostMapping // 보여진 페이지에서 뭔가 로직을 필요로 할 때
    @PutMapping //모든걸삭제, 이걸로 덮어쓰기, 잘 안씀
    @PatchMapping //부분만 덮어쓰기 ,잘안씀*/
    
    //인덱스 페이지
    @GetMapping("/index")
    public String index() {
        log.info("index start");
        return "/index";
}
    // 리다이렉트 페이지
    @GetMapping("/redirect")
    public String redirect() {
        return "redirect";
    }
}
