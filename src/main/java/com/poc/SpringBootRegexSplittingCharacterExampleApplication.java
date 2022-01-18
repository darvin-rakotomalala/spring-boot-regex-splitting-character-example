package com.poc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRegexSplittingCharacterExampleApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRegexSplittingCharacterExampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String input = "age: 28, favorite number: 26, \"salary: $1,234,108\"";
        String[] splits = input.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
        System.out.println("Output: =====================================================================");
        for (int i = 0; i < splits.length; i++) {
			System.out.println(splits[i].trim());
        }
    }
}
