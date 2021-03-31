package io.github.andylke.demo;

import org.springframework.stereotype.Service;

@Service
public class MathService {

  public int add(int value, int otherValue) {
    return value + otherValue;
  }

  public int substract(int value, int otherValue) {
    return value - otherValue;
  }
}
