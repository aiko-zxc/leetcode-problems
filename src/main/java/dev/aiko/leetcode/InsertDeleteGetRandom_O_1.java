package dev.aiko.leetcode;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

// https://leetcode.com/problems/insert-delete-getrandom-o1
class InsertDeleteGetRandom_O_1 {

  private final List<Integer> values;
  private final Map<Integer, Integer> valueToIndex;
  private final Random random;

  public InsertDeleteGetRandom_O_1() {
    values = new ArrayList<>();
    valueToIndex = new HashMap<>();
    random = new Random();
  }

  public boolean insert(int val) {
    if (valueToIndex.containsKey(val)) {
      return false;
    }
    values.add(val);
    valueToIndex.put(val, values.size() - 1);
    return true;
  }

  public boolean remove(int val) {
    if (!valueToIndex.containsKey(val)) {
      return false;
    }
    int indexToClear = valueToIndex.remove(val);
    int lastValue = values.remove(values.size() - 1);
    if (lastValue != val) {
      valueToIndex.put(lastValue, indexToClear);
      values.set(indexToClear, lastValue);
    }
    return true;
  }

  public int getRandom() {
    int randomIndex = random.nextInt(values.size());
    return values.get(randomIndex);
  }
}
