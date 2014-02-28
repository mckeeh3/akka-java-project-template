import akka.actor.ActorSystem;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Actor1Test {
    private ActorSystem actorSystem;

    @Test
    public void t() {

    }

    @BeforeClass
    public void beforeClass() {
        actorSystem = ActorSystem.create();
    }

    @AfterClass
    public void afterClass() {
        actorSystem.shutdown();
    }
}
