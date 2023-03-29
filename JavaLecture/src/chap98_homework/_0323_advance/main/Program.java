package chap98_homework._0323_advance.main;

import practice.studentProgram.pages.Pages;

import java.util.Scanner;

public class Program {
    Scanner sc = new Scanner(System.in);
    CommonStat[] cs = new CommonStat[100];

    int sno = 0;
    int studentNum = 0;
    int studentScore = 0;
    Pages pages = new Pages();
    Pages.MainPage mainPage = pages.new MainPage();
    Pages.InputStudentInfo inputStudentInfo = pages.new InputStudentInfo();
    Pages.InputSubject inputSubject = pages.new InputSubject();


    public void start(){
        while (true){
            voidSelectPage(mainPage.mainPage());
        }
    }

    public void voidSelectPage(int n){
        switch (n){
            case 1:
                inputStudent();
                break;
            case 2:
                voidSearch();
                break;
            case 3:
                voidShowAll();
                break;
            case 4:
                voidRankAll();
                break;
            case 5:
                System.out.println("종료합니다.");
                System.exit(0);
        }
    }
    public void voidSearch(){
        System.out.println("------학생정보 검색------");
        System.out.println("검색할 학생의 학번을 입력하세요.");
        System.out.print(">>");
        int n = sc.nextInt();
        if(cs[n] != null){
            cs[n].printInfo();
        }else {
            System.out.println("검색하신 학번은 없습니다.");
            voidSearch();
        }
        System.out.println("---------");
    }

    public void voidShowAll(){
        System.out.println("------학생정보 전체출력------");
        for(int i = 0; i < cs.length; i++) {
            if(cs[i] != null) {
                cs[i].printInfo();
                System.out.println("----------------");
            }
        }
    }

    public void inputStudent(){
        System.out.println("------학생정보 입력------");
        System.out.println("1. 기본정보 입력");
        System.out.println("2. 과목정보 입력");
        System.out.print(">>");
        int n = sc.nextInt();
        if(n == 1){
            inputStudentInfo.inputStudentInfo();
            sno = inputStudentInfo.getSno();
            String name = inputStudentInfo.getName();
            String major = inputStudentInfo.getMajor();
            int[] finalExam = new int[0];
            cs[sno] = new CommonStat(sno, name, major, finalExam);
            studentNum++;
        } else if (n == 2) {
            sno = inputSubject.searchStudent();
            if(cs[sno] != null){
                inputSubject.inputSubject();
                cs[sno].setSubject(inputSubject.getSubjectArr());
                cs[sno].setFinalExam(inputSubject.getSubjectScoreArr());
                studentScore++;
            }else {
                System.out.println("검색하신 학번은 없습니다.");
                inputStudent();
            }

        } else {
            inputStudent();
        }
    }

    public void voidRankAll(){
        double[] score = new double[studentScore];
        int sa = 0;

        for(int i = 0; i < cs.length; i++) {
            if(cs[i] != null) {
                score[sa++] = cs[i].getAvg();
            }
        }

        int[] rank = new int[score.length];

        for(int i=0; i<score.length; i++){
            rank[i] = 1; //1등으로 초기화

            for (int j = 0; j < score.length; j++) { //기준데이터와 나머지데이터비교
                if(score[i]<score[j]){   //기준데이터가 나머지데이터라 비교했을때 적으면 rank[i] 카운트
                    rank[i]++; //COUNT
                }
            }
        }

        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]+"점 : "+rank[i]+"등");
        }


    }
}
