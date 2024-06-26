package com.rest.junitMokito.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rest.junitMokito.model.Tourist;
import com.rest.junitMokito.service.TouristService;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;


@WebMvcTest(TouristController.class)
class TouristControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TouristService touristService;

    @Test
    void registerTouristDetails() throws Exception {

        Mockito.when(touristService.registerTourist(ArgumentMatchers.any())).thenReturn("Tourist registered..");

        Tourist tourist =new Tourist(11, "Rohan", "Bengaluru", "Diamond",45454.4);
        ObjectMapper mapper = new ObjectMapper();
        String jsonData = mapper.writeValueAsString(mapper);

        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders
                .post("/api/v1/tourist/register")
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonData);

        /*ResultActions performed  = mockMvc.perform(requestBuilder);
        MvcResult mvcResult  = performed.andReturn();
        MockHttpServletResponse response  = mvcResult.getResponse();

        int responseStatus = response.getStatus();*/

        int responseStatus = mockMvc.perform(requestBuilder)
                            .andReturn()
                            .getResponse()
                            .getStatus();

        assertEquals(201,responseStatus);
    }
}