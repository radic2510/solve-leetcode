class Solution {
    
    /**
    * Array로만 풀이 1
    * runtime 길고
    * memory 사용도 중간
    */
    
    public int maxAreaOfIsland(int[][] grid) {
        int y = grid.length;				// 행
        int x = grid[0].length; // 열
        int maxIslandSize = 0;

        int[][] map = new int[y][x];
        for(int i=0; i<y; i++) {
            for(int j=0; j<x; j++) {
                map[i][j] = 0;
            }
        }

        for(int i=0; i<y; i++) {
            for(int j=0; j<x; j++) {
                int curIslandSize = checkIsland(i, j, grid, map);

                if (curIslandSize > maxIslandSize)
                    maxIslandSize = curIslandSize;
            }
        }

        return maxIslandSize;

    }
    
    private int checkIsland(int y, int x, int[][] grid, int[][] map) {
        int curIslandSize = 0;

        int xlimit = (grid[0].length - 1);
        int ylimit = grid.length -1;

        if(x > xlimit || y > ylimit || x < 0 || y < 0){
            return curIslandSize;
        }

        if(grid[y][x] == 1 && map[y][x] == 0) {
            curIslandSize++;	//현재 섬
            map[y][x] = 1; 		//기 등록 섬으로
            curIslandSize += checkFourDirectionIsland(y, x, grid, map);	//연결 섬
        }

        return curIslandSize;
    }

    private int checkFourDirectionIsland(int y, int x, int[][] grid, int[][] map) {
        int curIslandSize = 0;
        // 위 (y-1)
        curIslandSize += checkIsland(y-1, x, grid, map);
        // 오른 (x+1)
        curIslandSize += checkIsland(y, x+1, grid, map);
        // 아래 (y+1)
        curIslandSize += checkIsland(y+1, x, grid, map);
        // 왼 (x-1)
        curIslandSize += checkIsland(y, x-1, grid, map);


        return curIslandSize;
    }
}