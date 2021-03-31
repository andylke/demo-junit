package io.github.andylke.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathRestController {

  @Autowired private MathService mathService;

  @GetMapping(path = "/add")
  public int add(@RequestParam int value, @RequestParam int otherValue) {
    return mathService.add(value, otherValue);
  }

  @GetMapping(path = "/substract")
  public int substract(@RequestParam int value, @RequestParam int otherValue) {
    return mathService.substract(value, otherValue);
  }
}
