package spread;
import cells.Cell;

public class Spreadsheet {
    private Cell[][] cells;
    private int row;
    private int column;

    public Spreadsheet() {
        row = 0;
        column = 0;
        this.cells = new Cell[row][column];

    }

     public Spreadsheet(int r, int c) {
        if (r >= 0 && c >= 0) {
            row = r;
            column = c;
            this.cells = new Cell[r][c];
        }
    }

    public void setCellAt(int r, int c, Cell cl) {
        if (r >= 0 && c >= 0) {
            cells[r][c] = cl;
        }
    }

    public void setCellAt(int r, int c, String s) {
        if (r >= 0 && c >= 0) {
            this.cells[r][c].setValue(s);
        }
    }

    public Cell getCellAt(int r, int c) {
        if (r >= 0 && c >= 0) {
            return this.cells[r][c];
        } else {
            return null;
        }
    }

    public void addRow(int r) {
        if (r >= 0) {
            Cell[][] tmp = this.cells;
            tmp = new Cell[this.row + 1][this.column];
            for (int i = this.row; i >= 0; --i) {
                if (i == r) {
                    break;
                }
                for (int j = 0; j < this.column; ++j) {
                    tmp[i + 1][j] = this.cells[i][j];
                    tmp[i][j] = null;
                }
            }
            this.cells = tmp;
        }
    }

    public void removeRow(int r) {
        Cell[][] tmp = new Cell[this.row - 1][this.column];
        for (int i = 0; i < this.row; ++i) {
            if (i == r) {
                continue;
            }
            for (int j = 0; j < this.column; ++j) {
                if (i < r) {
                    tmp[i][j] = this.cells[i][j];
                } else {
                    tmp[i - 1][j] = this.cells[i][j];
                }
            }
        }
        this.cells = tmp;
    }

    public void addColumn(int c) {
        if (c >= 0) {
            Cell[][] tmp = this.cells;
            tmp = new Cell[this.row][this.column + 1];
            for (int i = 0; i < this.row; ++i) {
                for (int j = this.column - 1; j >= 0; --j) {
                    if (j == c) {
                        break;
                    }
                    tmp[i][j + 1] = this.cells[i][j];
                    tmp[i][j] = null;

                }
            }
            this.cells = tmp;
        }
    }

    public void removeColumn(int c) {
        Cell[][] tmp = new Cell[this.row][this.column - 1];
        for (int i = 0; i < this.row; ++i) {
            for (int j = 0; j < this.column; ++j) {
                if (j == c) {
                    continue;
                }
                if (i > c) {
                    tmp[i][j] = cells[i][j];
                } else {
                    tmp[i][j - 1] = cells[i][j];
                }
            }
        }
        this.cells = tmp;
    }

    public void swapRows(int r1, int r2) {
        Cell[] tmpRow = this.cells[r1];
        this.cells[r1] = this.cells[r2];
        this.cells[r2] = tmpRow;
    }

    public void swapColumn(int c1, int c2) {
        for (int i = 0; i < this.row; ++i) {
            Cell tmpColumn = this.cells[i][c1];
            this.cells[i][c1] = this.cells[i][c2];
            this.cells[i][c2] = tmpColumn;
        }
    }

}
