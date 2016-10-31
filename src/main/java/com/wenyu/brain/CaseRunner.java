package com.wenyu.brain;

import com.wenyu.brain.dp.Dungeon;
import com.wenyu.brain.math.Pow;
import com.wenyu.brain.math.Sqrt;
import com.wenyu.brain.string.AllSubstring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Wenyu
 * @since 9/18/16
 */
@SpringBootApplication
public class CaseRunner extends SpringBootServletInitializer {

    private static final Set<CanRun> Q = new HashSet<>();

    private static void runAllCases() {
        Q.add(new WhiteBoard());
//        Q.add(new Pow());
//        Q.add(new AllSubstring());
//        Q.add(new Sqrt());
        Q.add(new Dungeon());
        Q.forEach(CanRun::run);
    }

    public static void main (String... args) {
        runAllCases();

//        SpringApplication.run(CaseRunner.class, args);
    }
}
