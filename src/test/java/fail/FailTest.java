package fail;

import com.intuit.karate.junit5.Karate;

import org.junit.jupiter.api.Test;

public class FailTest {

    @Karate.Test
    public Karate test() {
        return Karate.run("classpath:features/foo.feature");
    }
}
