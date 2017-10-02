package patterns;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import patterns.builder.junit.CarBuilderTest;
import patterns.builder.junit.DriverBuilderTest;
import patterns.composite.junit.DriverComponentTest;
import patterns.entity.junit.CarTest;
import patterns.entity.junit.DriverTest;
import patterns.factory.junit.FactoryDriverTest;
import patterns.strategy.junit.MarkerTest;

@RunWith(Suite.class)
@SuiteClasses({
    CarTest.class,
    DriverTest.class,
    CarBuilderTest.class,
    DriverBuilderTest.class,
    DriverComponentTest.class,
    FactoryDriverTest.class,
    MarkerTest.class
})
public class AllPatternsTests {
    
}
