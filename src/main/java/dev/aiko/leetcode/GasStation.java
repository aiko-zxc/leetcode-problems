package dev.aiko.leetcode;

public class GasStation {

  public int canCompleteCircuit(int[] gas, int[] cost) {
    int start = 0;
    int end = 0;
    int fuel = gas[start];
    do {
      if (canMove(end, cost, fuel)) {
        int newEnd = nextIndex(end, gas);
        if (start == newEnd) {
          return start;
        }
        fuel = fuel - cost[end] + gas[newEnd];
        end = newEnd;
      } else {
        int newStart = prevIndex(start, gas);
        fuel = fuel - cost[newStart] + gas[newStart];
        start = newStart;
      }
    } while (start != end);
    return -1;
  }

  private boolean canMove(int i, int[] cost, int fuel) {
    return fuel - cost[i] >= 0;
  }

  private int nextIndex(int i, int[] gas) {
    return (i + 1) % gas.length;
  }

  private int prevIndex(int i, int[] gas) {
    return (i - 1 + gas.length) % gas.length;
  }
}
