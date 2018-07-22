package com.socgen.sgi.xmpinjection;

import java.util.Arrays;

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
		System.out.println("-----------------------------------------------------");
		if (Arrays.asList(args)!=null && args.length > 0 ) {
			consum.consumfils(args);
			System.out.println("-----------------------------------------------------");
			System.out.println(args[2]);
			System.out.println("-----------------------------------------------------");
			
			//consum.consumXml(args[2]);
			consum.consumXml("");
			
		}else {
			
		}

	}

}
