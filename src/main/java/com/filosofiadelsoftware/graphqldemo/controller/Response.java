package com.filosofiadelsoftware.graphqldemo.controller;

public class Response<T> {

  T data;
  String error;

  public Response(T data) {
    this.data = data;
  }

  public Response(String error) {
    this.error = error;
  }
}
