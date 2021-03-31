package io.github.andylke.demo;

import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(controllers = {MathRestController.class})
class MathRestControllerTests {

  @Autowired private MockMvc mvc;

  @MockBean private MathService mathService;

  @Test
  void add() throws Exception {
    when(mathService.add(1, 2)).thenReturn(3);

    mvc.perform(
            get("/add")
                .param("value", "1")
                .param("otherValue", "2")
                .contentType(MediaType.APPLICATION_JSON_VALUE))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$", is(3)));
  }

  @Test
  void substract() throws Exception {
    when(mathService.substract(2, 1)).thenReturn(1);

    mvc.perform(
            get("/substract")
                .param("value", "2")
                .param("otherValue", "1")
                .contentType(MediaType.APPLICATION_JSON_VALUE))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$", is(1)));
  }
}
