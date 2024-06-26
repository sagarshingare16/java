package com.rest.junitMokito.controller;

import com.rest.junitMokito.service.GreetingService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(GreetingController.class)
class GreetingControllerTest {

    @MockBean
    private GreetingService greetingService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void generateGreetings() throws Exception {
        // mocking for method of service class called by controller.
        Mockito.when(greetingService.generateWish()).thenReturn("Good Night"); // any string value as return of generateWish() is String.

        // Request object
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/v1/greeting/greet");

        /*ResultActions performed  = mockMvc.perform(requestBuilder);
        MvcResult mvcResult  = performed.andReturn();
        MockHttpServletResponse response  = mvcResult.getResponse();

        int responseStatus = response.getStatus();*/

        int responseStatus = mockMvc.perform(requestBuilder)
                                    .andReturn()
                                    .getResponse()
                                    .getStatus();

        assertEquals(200,responseStatus);

    }
}