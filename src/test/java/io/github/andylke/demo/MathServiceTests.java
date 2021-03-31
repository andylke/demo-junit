package io.github.andylke.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MathServiceTests {

  @Test
  void add() {
    final MathService mathService = new MathService();
    final int result = mathService.add(1, 2);

    assertThat(result).isEqualTo(3);
  }

  @Test
  void substract() {
    final MathService mathService = new MathService();
    final int result = mathService.substract(2, 1);

    assertThat(result).isEqualTo(1);
  }
}
