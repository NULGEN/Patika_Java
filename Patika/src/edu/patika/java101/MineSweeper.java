package edu.patika.java101;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private String[][] mineField;
    private String[][] playerField;
    private int rows, cols, mineCount;
    private boolean gameOver;

    public MineSweeper(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.mineCount = (rows * cols) / 4;
        this.mineField = new String[rows][cols];
        this.playerField = new String[rows][cols];
        this.gameOver = false;
        initializeFields();
        placeMines();
    }

    private void initializeFields() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mineField[i][j] = "-";
                playerField[i][j] = "-";
            }
        }
    }

    private void placeMines() {
        Random rand = new Random();
        int placedMines = 0;

        while (placedMines < mineCount) {
            int r = rand.nextInt(rows);
            int c = rand.nextInt(cols);
            if (!mineField[r][c].equals("*")) {
                mineField[r][c] = "*";
                placedMines++;
            }
        }
    }

    private int countAdjacentMines(int r, int c) {
        int count = 0;
        int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int i = 0; i < 8; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];
            if (nr >= 0 && nr < rows && nc >= 0 && nc < cols && mineField[nr][nc].equals("*")) {
                count++;
            }
        }
        return count;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        int revealedCells = 0;
        int totalCells = rows * cols - mineCount;

        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz!");
        while (!gameOver) {
            printField(playerField);
            System.out.print("Satır Giriniz: ");
            int r = scanner.nextInt();
            System.out.print("Sütun Giriniz: ");
            int c = scanner.nextInt();

            if (r < 0 || r >= rows || c < 0 || c >= cols) {
                System.out.println("Geçersiz koordinat! Lütfen tekrar giriniz.");
                continue;
            }
            if (!playerField[r][c].equals("-")) {
                System.out.println("Bu koordinat daha önce seçildi, başka bir koordinat girin.");
                continue;
            }
            if (mineField[r][c].equals("*")) {
                System.out.println("Game Over!!");
                gameOver = true;
                revealMines();
                break;
            }
            int mineCount = countAdjacentMines(r, c);
            playerField[r][c] = String.valueOf(mineCount);
            revealedCells++;

            if (revealedCells == totalCells) {
                System.out.println("Oyunu Kazandınız!");
                break;
            }
        }
        printField(playerField);
        scanner.close();
    }

    private void printField(String[][] field) {
        for (String[] row : field) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    private void revealMines() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mineField[i][j].equals("*")) {
                    playerField[i][j] = "*";
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows, cols;
        do {
            System.out.print("Satır sayısını giriniz (min 2): ");
            rows = scanner.nextInt();
            System.out.print("Sütun sayısını giriniz (min 2): ");
            cols = scanner.nextInt();
            if (rows < 2 || cols < 2) {
                System.out.println("Matris boyutu en az 2x2 olmalıdır. Tekrar deneyin.");
            }
        } while (rows < 2 || cols < 2);

        MineSweeper game = new MineSweeper(rows, cols);
        game.play();
        scanner.close();
    }
}
