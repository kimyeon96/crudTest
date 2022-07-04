package com.example.crudtest.service.impl;

import com.example.crudtest.dto.RedirectDto;
import com.example.crudtest.dto.TestDto;
import com.example.crudtest.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Override
    public RedirectDto test(TestDto testDto) throws Exception {

        RedirectDto redirectDto = new RedirectDto();

        if (!testDto.getName().equals("김연")) {
            redirectDto.setMsg("같지 않다");
            redirectDto.setUrl("/test/test");
            return redirectDto;
        }

        redirectDto.setMsg("같다.");
        redirectDto.setUrl("/test/test");
        return redirectDto;
    }
}
