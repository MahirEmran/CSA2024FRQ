
public class GridPath
{
/** Initialized in the constructor with distinct values that never change */
private int[][] grid;
/**
* Returns the Location representing a neighbor of the grid element at row and col,
* as described in part (a)
* Preconditions: row is a valid row index and col is a valid column index in grid.
* row and col do not specify the element in the last row and last column of grid.
*/
    public Location getNextLoc(int row, int col)
    {
        boolean rightNeighbor = (col+1 < grid[0].length);
        boolean bottomNeighbor = (row+1 < grid.length);
        if(rightNeighbor && bottomNeighbor) {
            if(grid[row+1][col] < grid[row][col+1]) {
                return new Location(row+1, col);
            } else {
                return new Location(row, col+1);
            }
        } else {
            if(rightNeighbor) {
                return new Location(row, col+1);
            } else {
                return new Location(row+1, col);
            }
        }
    }
/**
* Computes and returns the sum of all values on a path through grid, as described in
* part (b)
* Preconditions: row is a valid row index and col is a valid column index in grid.
* row and col do not specify the element in the last row and last column of grid.
*/
    public int sumPath(int row, int col) {
        int sum = 0;
        while(row != grid.length-1 || col != grid[0].length-1) {
            sum += grid[row][col];
            Location l = getNextLoc(row, col);
            row = l.getRow();
            col = l.getCol();
        }
        return sum+grid[row][col];
}
// There may be instance variables, constructors, and methods that are not shown.
}
