
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/character.feature"},
        plugin = {"pretty"},
        glue = {"step_definition"}
)
public class RunTest {
}