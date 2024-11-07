package com.github.bgrebennikovv;

public class Main {

    public static void main(String[] args) {

        // Task 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.printf("Task 1\nDog: %s\nCat: %s\nPaper: %s\n\n", dog, cat, paper);

        // Task 2
        dog += 4;
        cat += 4;
        paper += 4;

        System.out.printf("Task 2, New values:\nDog: %s\nCat: %s\nPaper: %s\n\n", dog, cat, paper);

        // Task 3
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7637;

        System.out.printf("Task 3, New values:\nDog: %s\nCat: %s\nPaper: %s\n\n", dog, cat, paper);

        // Task 4
        var friend = 19;
        System.out.printf("Task 4\nFriend: %s\n", friend);
        friend +=2;
        System.out.printf("(Upd) Friend: %s\n", friend);
        friend /= 7;
        System.out.printf("(Upd) Friend: %s\n\n", friend);

        // Task 5
        var frog = 3.5;
        System.out.printf("Task 5\nFrog: %s\n", frog);
        frog *= 10;
        System.out.printf("(Upd) Frog: %s\n", frog);
        frog /= 3.5;
        System.out.printf("(Upd) Frog: %s\n", frog);
        frog+=4;
        System.out.printf("(Upd) Frog: %s\n", frog);

    }

}