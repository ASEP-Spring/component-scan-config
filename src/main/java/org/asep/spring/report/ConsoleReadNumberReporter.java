package org.asep.spring.report;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("report")
public class ConsoleReadNumberReporter implements ReadNumberReporter {

    public void report(int number) {
        System.out.println("Read number " + number);
    }
}
