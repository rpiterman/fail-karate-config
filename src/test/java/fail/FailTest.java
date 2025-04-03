package fail;

import com.intuit.karate.junit5.Karate;

public class FailTest {

    @Karate.Test
    public Karate test() {
        //throw new RuntimeException();
        return Karate.run("classpath:features/foo.feature");
    }
}
