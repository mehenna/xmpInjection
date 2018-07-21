package com.socgen.sgi.xmpinjection.consummer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component 
public class ConsummingInputDataImpl implements IConsummingInputData {
	
	/**	
	 * Consuming input data
	 * @param strings
	 */
	public void consum(String ...strings){
		Arrays.asList(strings).stream().forEach(System.out::println);
		System.out.println("------------------------------");
		Arrays.asList(strings).stream().forEach( s -> System.out.println(s) );
	}
	/**
	 * 
	 */
	public void consumfils(String ...strings) throws Exception {
		if (Arrays.asList(strings)!=null && strings.length > 0 ) {
			byte[] file = Files.readAllBytes(Paths.get(strings[0]));
			System.out.println("file  ------------------------------>  " + file.length);
		}else {
			System.out.println("------------------------------ NO DATA FOUNDED ");
		}

	}
}
