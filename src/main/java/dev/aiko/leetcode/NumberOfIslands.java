package dev.aiko.leetcode;

import java.util.List;

// https://leetcode.com/problems/number-of-islands
public class NumberOfIslands {
  public int numIslands(char[][] grid) {
    boolean[][] visited = new boolean[grid.length][grid[0].length];
    int counter = 0;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (visit(grid, visited, i, j)) {
          counter++;
        }
      }
    }
    return counter;
  }

  private boolean visit(char[][] grid, boolean[][] visited, int x, int y) {
    if (visited[x][y] || grid[x][y] == '0') {
      return false;
    }
    visited[x][y] = true;
    var nearest = getNearest(x, y, grid);
    for (var coord : nearest) {
      visit(grid, visited, coord.x(), coord.y());
    }
    return true;
  }

  private List<Coordinate> getNearest(int x, int y, char[][] grid) {
    var coords =
        List.of(
            new Coordinate(x - 1, y),
            new Coordinate(x + 1, y),
            new Coordinate(x, y - 1),
            new Coordinate(x, y + 1));
    return coords.stream()
        .filter(
            coordinate -> {
              if (coordinate.x() < 0 || coordinate.y() < 0) {
                return false;
              }
              if (coordinate.x() >= grid.length || coordinate.y() >= grid[0].length) {
                return false;
              }
              return true;
            })
        .toList();
  }

  private record Coordinate(int x, int y) {}
}
