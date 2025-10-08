package dev.aiko.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import dev.aiko.leetcode.array.GasStation;
import org.junit.jupiter.api.Test;

class GasStationTest {
  private final GasStation gasStation = new GasStation();

  @Test
  void canCompleteCircuit() {
    // given
    int[] gas = new int[] {1, 2, 3, 4, 5};
    int[] cost = new int[] {3, 4, 5, 1, 2};
    // when
    int result = gasStation.canCompleteCircuit(gas, cost);
    // then
    assertEquals(3, result);
  }
}
