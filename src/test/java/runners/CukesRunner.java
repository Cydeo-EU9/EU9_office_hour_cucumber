package runners;

import io.cucumber.junit.*;
import org.junit.runner.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "pretty",

    },
        features = "src/test/resources/features",
        glue = "step_definitions",
        dryRun = false,
        tags = "@librarians"


)
public class CukesRunner {
}


