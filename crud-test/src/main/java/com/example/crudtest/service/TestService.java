package com.example.crudtest.service;

import com.example.crudtest.dto.RedirectDto;
import com.example.crudtest.dto.TestDto;

public interface TestService {

    RedirectDto test(TestDto testDto) throws Exception;
}
