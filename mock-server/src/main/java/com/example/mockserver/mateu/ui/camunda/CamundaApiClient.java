package com.example.mockserver.mateu.ui.camunda;

import okhttp3.*;
import org.openapitools.client.ApiClient;
import org.openapitools.client.Configuration;

import java.io.IOException;

public class CamundaApiClient {

    private static ApiClient defaultClient;

    public static synchronized ApiClient get() {
        if (defaultClient == null) {
            defaultClient = createApiClient();
        }
        return defaultClient;
    }

    private static ApiClient createApiClient() {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://hetzner2/engine-rest");

        OkHttpClient client = new OkHttpClient.Builder()
                .authenticator(new Authenticator() {
                    @Override public Request authenticate(Route route, Response response) throws IOException {
                        if (response.request().header("Authorization") != null) {
                            return null; // Give up, we've already attempted to authenticate.
                        }

                        System.out.println("Authenticating for response: " + response);
                        System.out.println("Challenges: " + response.challenges());
                        String credential = Credentials.basic("miguel",
                                System.getProperty("basicauthpassword"));
                        return response.request().newBuilder()
                                .header("Authorization", credential)
                                .build();
                    }
                })
                .build();

        defaultClient.setHttpClient(client);
        return defaultClient;
    }


}
