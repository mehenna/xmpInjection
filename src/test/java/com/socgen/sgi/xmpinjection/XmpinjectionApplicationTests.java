package com.socgen.sgi.xmpinjection;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.socgen.sgi.xmpinjection.consummer.IConsummingInputData;

@RunWith(SpringRunner.class)
@SpringBootTest
public class XmpinjectionApplicationTests {
	
	@Autowired
	IConsummingInputData consumer;

	@Test
	public void contextLoads() throws Exception {
		assertThat(consumer).isNotNull();
	}

}
