package io.hac.quarkus;

import javax.inject.Inject;
import javax.inject.Named;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

@Named("test")
public class TestLambda implements RequestHandler<InputObject, OutputObject> {

    @Inject
    ProcessingService service;

    @Override
    public OutputObject handleRequest(InputObject input, Context context) {
        System.out.println("Started Lambda proceeing AM ......");

        OutputObject out = new OutputObject();
        out.setResult("Basic response from test handler v2");
        return out;
    }
}
