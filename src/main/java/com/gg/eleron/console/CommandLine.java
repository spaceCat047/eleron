package com.gg.eleron.console;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.Console;

@Slf4j
@Component
public class CommandLine implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        log.info("EXECUTING : command line runner");
        for (int i = 0; i < args.length; ++i) {
            log.info("args[{}]: {}", i, args[i]);
        }

        Console console = System.console();

        if (console == null) {
            System.out.print("No console available");
            return;
        }

        String progLanguauge = console.readLine("Enter your favourite programming language: ");
        console.printf(progLanguauge + " is very interesting!");

        char[] pass = console.readPassword("To finish, enter password: ");

        if ("BAELDUNG".equals(pass.toString().toUpperCase()))
            console.printf("Good! Regards!");
        else
            console.printf("Nice try. Regards.");

    }

}
