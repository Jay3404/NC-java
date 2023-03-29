package chap98_homework._0323_advance.pages;

import java.util.Scanner;

public interface PageInput {
    default String input(){
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
}
