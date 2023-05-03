import JUnitTest.AssertTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

    @RunWith(Suite.class)
    @Suite.SuiteClasses({
            CalculatorTest.class,
            CodeUpTest.class,
            MyCalculatorTest.class,
            AssertTests.class
    })

    public class FeatureTestSuite {
        // the class remains empty,
        // used only as a holder for the above annotations
    }

