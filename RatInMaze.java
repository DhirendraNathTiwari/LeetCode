public class RatInMaze {
   public static boolean pathPossible(int [][] maze){
        int n=maze.length;
        int[][] path = new int[n][n];
        return solveMaze(maze,0,0,path);
    }
    public static boolean solveMaze(int maze[][], int i, int j, int[][] path){
        int n = maze.length;
        if(i<0 || i>=n || j<0 || j>=n || maze[i][j]==0 || path[i][j]==1){
            return false;
        }
        if(i==n-1 && j==n-1){
            return true;
        }
        path[i][j]=1;
         if(solveMaze(maze,i-1,j,path)){
            return true;
         }
         if(solveMaze(maze,i,j+1,path)){
            return true;
         }
         if(solveMaze(maze,i,j-1,path)){
            return true;
         }
         if(solveMaze(maze,i+1,j,path)){
            return true;
         }
         else{
            return false;
         }
    }
    public static void main(String[] args) {
        int [][]maze ={{1,1,0},{1,1,1},{1,0,1}};
        System.out.println(pathPossible(maze));
    }
}
