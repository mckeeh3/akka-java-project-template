package actor;

import akka.actor.UntypedActor;
import akka.event.Logging;
import akka.event.LoggingAdapter;

public class Actor2 extends UntypedActor {
    final LoggingAdapter logger = Logging.getLogger(getContext().system(), this);

    @Override
    public void onReceive(Object message) throws Exception {

    }
}
