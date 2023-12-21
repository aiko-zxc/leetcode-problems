package dev.aiko.leetcode;
import java.util.*;

// https://leetcode.com/problems/surrounded-regions
public class SurroundedRegions {
    public void solve(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                Set<Coordinate> visited = new HashSet<>();
                List<Coordinate> list = new ArrayList<>();
                if (fillCoordsToClear(new Coordinate(row, col), board, list, visited)) {
                    for (var coordinate : list) {
                        board[coordinate.row()][coordinate.col()] = 'X';
                    }
                }
            }
        }
    }

    private boolean fillCoordsToClear(Coordinate coordinate, char[][] board, List<Coordinate> list, Set<Coordinate> visited) {
        int row = coordinate.row();
        int col = coordinate.col();
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length) {
            return false;
        }
        if (board[row][col] == 'X') {
            return true;
        }
        // if O
        if (visited.contains(coordinate)) {
            return true;
        }
        visited.add(coordinate);
        list.add(coordinate);
        for (var nearest : getNearest(row, col)) {
            if (!fillCoordsToClear(nearest, board, list, visited)) {
                return false;
            }
        }
        return true;
    }

    private List<Coordinate> getNearest(int row, int col) {
        return List.of(
                new Coordinate(row - 1, col),
                new Coordinate(row + 1, col),
                new Coordinate(row, col - 1),
                new Coordinate(row, col + 1));
    }

    private record Coordinate(int row, int col) {}
}
