package io.hac.quarkus;

import javax.inject.Named;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.io.IOException;

@Named("stream")
public class StreamLambda implements RequestStreamHandler {

    @Override
    public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context) throws IOException {
        int letter;
        // while ((letter = inputStream.read()) != -1) {
        // int character = Character.toUpperCase(letter);
        // outputStream.write(character);
        // }

        if (inputStream != null) {
            String text = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
            outputStream.write(text.getBytes(Charset.forName("UTF-8")));
         //   System.out.println(text);
        } else {
            System.out.println("NO input Stream ...");
        }
    }
}
