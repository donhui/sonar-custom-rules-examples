package org.sonar.samples.java.checks;

/**
 * Created by shendepu on 2017/5/4.
 */


import org.junit.Test;
import org.sonar.java.checks.verifier.JavaCheckVerifier;

public class MyFirstCustomCheckTest {

    @Test
    public void test() {
        JavaCheckVerifier.verify("src/test/files/MyFirstCustomCheck.java", new MyFirstCustomCheck());
    }

}