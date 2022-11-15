package com.app.demo;

import java.security.cert.CollectionCertStoreParameters;
import java.util.Collections;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.app.demo.dao.personRepo;

@ExtendWith(SpringRunner.class)
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT , classes=ImplementTestingApplication.class)
@AutoConfigureMockMvc
@TestPropertySource(locations="classpath:application-test.properties")
class ImplementTestingApplicationTests {

	@Autowired
	MockMvc mockMvc;
	
	
	@Test
	void contextLoads() throws Exception{
		
		MvcResult mvcResult =mockMvc.perform(MockMvcRequestBuilders.get("/persons")
				.accept(MediaType.APPLICATION_JSON)
				).andReturn();
		System.out.println(mvcResult.getResponse());
		}
 
}
