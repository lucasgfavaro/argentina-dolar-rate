package com.lf.adr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    BCRAService BCRAService;

    private static final Logger log = LoggerFactory.getLogger(Application.class);


    public static void main(String args[]) {
        SpringApplication.run(Application.class, args);
    }

    public void run(String... strings) throws Exception {




        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        log.info(quote.toString());



        System.out.println(BCRAService.getHistoricDollarRate());
    }


    // Authorization: BEARER eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1MTkwNDY3NzIsInR5cGUiOiJleHRlcm5hbCIsInVzZXIiOiJsdWNhc2dyYWNpYW5vZmF2YXJvQGdtYWlsLmNvbSJ9.JqLnSj_vReXYhTDzGWmdWY5uoA_ZgDGgN9rHreHtMVbte75vILEz8tkWeRnPbiu8tgd_y3HnKbcwsLQeiaQqow

}