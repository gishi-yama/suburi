package com.example.tdd20210410;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


@DisplayName("整数間区間を表す IntClosedRange")
public class IntClosedRangeTest {

  private IntClosedRange range;

  @BeforeEach
  void setUp() {
    range = new IntClosedRange(3, 7);
  }

  @Nested
  class 整数区間は下端点と上端点を含む {
    @Test
    void 下端点は3() throws Exception {
      assertEquals(3, range.lower());
    }

    @Test
    void 上端点は7() throws Exception {
      assertEquals(7, range.upper());
    }
  }

  @Test
  @DisplayName("文字列表記は[3, 7]")
  void notation() throws Exception {
    assertEquals("[3, 7]", range.notation());
  }
}
