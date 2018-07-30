package pl.coderslab.test;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AnotherClassTest.class, KickOfTheJamTest.class, SimpleSampleTest.class })
public class AllTests {

}
