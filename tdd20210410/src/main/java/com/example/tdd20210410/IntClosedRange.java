package com.example.tdd20210410;

public record IntClosedRange(int lower, int upper) {

  public String notation() {
      return String.format("[%d, %d]", lower, upper);
  }
}
