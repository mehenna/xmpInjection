package com.socgen.sgi.xmpinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.socgen.sgi.xmpinjection.consummer.IConsummingInputData;

@SpringBootApplication
public class XmpinjectionApplication implements CommandLineRunner {

	@Autowired
	IConsummingInputData consum;

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(XmpinjectionApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		consum.consumfils(args);
	}

}
