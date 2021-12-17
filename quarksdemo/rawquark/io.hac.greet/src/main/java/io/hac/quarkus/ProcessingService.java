package io.hac.quarkus;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProcessingService {

    public static final String CAN_ONLY_GREET_NICKNAMES = "Can only greet nicknames";

    public OutputObject process(InputObject input) {
        if (input.getName().equals("Stuart")) {
            throw new IllegalArgumentException(CAN_ONLY_GREET_NICKNAMES);
        }
        String result = "Quack a Doodle Doo "+ input.getGreeting() + "  " + input.getName();
        OutputObject out = new OutputObject();
        out.setResult(result);
        return out;
    }
}
