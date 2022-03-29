package io.camunda.getstarted;

import io.camunda.zeebe.client.ZeebeClient;

public class ZeebeClientFactory {

  public static ZeebeClient getZeebeClient() {
    ZeebeClient client = ZeebeClient.newClientBuilder().usePlaintext().build();
    return client;
  }

}
