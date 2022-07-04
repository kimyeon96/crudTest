package com.example.crudtest.controller;

import com.example.crudtest.dto.RedirectDto;
import com.example.crudtest.dto.TestDto;
import com.example.crudtest.dto.UserDto;
import com.example.crudtest.service.TestService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Controller
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("/test/test")
    public String testPage() {
        log.info("### testPage pass");
        return "/test/test";
    }

    @PostMapping("/test/test")
    public String test(HttpServletRequest request, Model model) throws Exception {
        log.info("### test pass");

        // 컨트롤 + 알트 + V
        // new TestDto(); || 이때 사용
        TestDto testDto = new TestDto();
        testDto.setName(request.getParameter("test"));

        RedirectDto redirectDto = testService.test(testDto);

        model.addAttribute("msg",redirectDto.getMsg());
        model.addAttribute("url",redirectDto.getUrl());

        log.info("### test end");
        return "/redirect";
    }
}
