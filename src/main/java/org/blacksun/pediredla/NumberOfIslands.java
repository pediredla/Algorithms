package org.blacksun.pediredla;

/**
 * Created by Pediredla on 11/24/16.
 */
public class NumberOfIslands {
    public NumberOfIslands() {
    }

    public int numIslands(char[][] grid) {
        if (grid != null && grid.length != 0 && grid[0].length != 0) {
            int m = grid.length;
            int n = grid[0].length;
            int[] dx = new int[]{-1, 1, 0, 0};
            int[] dy = new int[]{0, 0, -1, 1};
            int[] root = new int[m * n];
            int count = 0;

            int i;
            int j;
            for (i = 0; i < m; ++i) {
                for (j = 0; j < n; ++j) {
                    if (grid[i][j] == 49) {
                        root[i * n + j] = i * n + j;
                        ++count;
                    }
                }
            }

            for (i = 0; i < m; ++i) {
                for (j = 0; j < n; ++j) {
                    if (grid[i][j] == 49) {
                        for (int k = 0; k < 4; ++k) {
                            int x = i + dx[k];
                            int y = j + dy[k];
                            if (x >= 0 && x < m && y >= 0 && y < n && grid[x][y] == 49) {
                                int cRoot = this.getRoot(root, i * n + j);
                                int nRoot = this.getRoot(root, x * n + y);
                                if (nRoot != cRoot) {
                                    root[cRoot] = nRoot;
                                    --count;
                                }
                            }
                        }
                    }
                }
            }

            return count;
        } else {
            return 0;
        }
    }

    public int getRoot(int[] arr, int i) {
        while (arr[i] != i) {
            i = arr[arr[i]];
        }

        return i;
    }
}

