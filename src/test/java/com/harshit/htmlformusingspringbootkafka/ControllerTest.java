package com.harshit.htmlformusingspringbootkafka;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.Mockito.verify;

@WebMvcTest(Controller.class)
class ControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Mock
    private Producer producer;

    @InjectMocks
    private Controller controller;

    @Test
    public void testSendAccountDetails() throws Exception {
        AccountDetails accountDetails = new AccountDetails();
        accountDetails.setFname("John");
        accountDetails.setLname("Doe");

        mockMvc.perform(MockMvcRequestBuilders.post("/send")
                        .flashAttr("accountDetails", accountDetails))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Account Details Sent Successfully"));

        verify(producer).send(accountDetails);
    }
}