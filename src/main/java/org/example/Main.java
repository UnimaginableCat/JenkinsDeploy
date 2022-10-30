package org.example;

import static spark.Spark.get;

import spark.Request;
import spark.Response;
import spark.Route;

public class Main {

  public static void main(String[] args) {
    get("/HelloWorld", new Route() {
      @Override
      public Object handle(Request request, Response response) {
        return "Hello World!!!";
      }
    });
  }
}