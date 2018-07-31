/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maze;

import java.util.Random;

/**
 *
 * @author alexguntermann
 */
public class Maze {

    private char[][] maze;
    private int size;
    private char wall;
    private char path;
    private Random r;
    private int start;
    private int end;

    public Maze(int size, char wall, char path) {
        this.size = size;
        this.wall = wall;
        this.path = path;
        this.maze = new char[this.size][this.size];
        this.r = new Random();
        createMaze();
        printMaze();
        //put method
        mazeTraversal(start, 0);
        printMaze();
        checkWin(start, end);
    }

    private void createMaze() {
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                if (j == 0 || j == size - 1 || i == 0 || i == size - 1) {
                    this.maze[i][j] = this.wall;
                    continue;
                }

                if (r.nextInt(20) > 15) {
                    this.maze[i][j] = this.wall;
                } else {
                    this.maze[i][j] = this.path;
                }
            }
        }
        start = r.nextInt(size - 2) + 1;
        end = r.nextInt(size - 2) + 1;
        this.maze[start][0] = this.path;

        this.maze[end][size - 1] = this.path;
    }

    private void printMaze() {
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < this.size; i++) {

            for (int j = 0; j < this.size; j++) {

                System.out.print(this.maze[i][j] + " ");
            }
            System.out.println();

        }
    }

    public void checkWin(int start, int end) {
        if (this.maze[end][size-1] == 'X') {
            System.out.println("You won!");
        } else {
            System.out.println("Unsolvable");
        }

    }

    public void mazeTraversal(int posY, int posX) {
        this.maze[posY][posX] = 'X';

        if (posX == size-1 && posY == end) {
        } else{ //to the right
        if (posX + 1 <= size - 1 && maze[posY][posX + 1] == this.path) {
            printMaze();
            mazeTraversal(posY, posX + 1);
            //upwards
        } else if (posY - 1 >= 0 && maze[posY - 1][posX] == this.path) {
            printMaze();
            mazeTraversal(posY - 1, posX);
            //down
        } else if (posY + 1 <= size - 1 && maze[posY + 1][posX] == this.path) {
            printMaze();
            mazeTraversal(posY + 1, posX);
            //left
        } else if (posX - 1 >= 0 && maze[posY][posX - 1] == this.path) {
            printMaze();
            mazeTraversal(posY, posX - 1);
            //backtracking
        } else {
            printMaze();
            this.maze[posY][posX] = '0';
            //right
            if (posX + 1 <= size - 1 && maze[posY][posX + 1] == 'X') {
                printMaze();
                mazeTraversal(posY, posX + 1);
                //up
            } else if (posY - 1 >= 0 && maze[posY - 1][posX] == 'X') {
                printMaze();
                mazeTraversal(posY - 1, posX - 1);
                //down
            } else if (posY + 1 <= size - 1 && maze[posY + 1][posX] == 'X') {
                printMaze();
                mazeTraversal(posY + 1, posX);
                //left
            } else if (posX - 1 >= 0 && maze[posY][posX - 1] == 'X') {
                printMaze();
                mazeTraversal(posY, posX - 1);

            }
        }
    }
    }
}
