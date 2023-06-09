package chap98_homework._0323_advance;

public class Rank {

    public static void main(String[] args) {

        //https://velog.io/@esohui/JAVA-배열-순위-알고리즘
        double[] scoreArr = {30, 10, 23, 6, 100};
        int[] rankArr = new int[scoreArr.length];

        for (int i = 0; i < scoreArr.length; i++) {
            rankArr[i] = 1;
            for (int j = 0; j < scoreArr.length; j++) {
                if(scoreArr[i] < scoreArr[j]){
                    rankArr[i] = rankArr[i] + 1;
                }
            }
        }

        for (int i : rankArr) {
            System.out.println(i);
        }
        System.out.println("------------------");

        //https://m.blog.naver.com/javaking75/140176250512
        //[1] 입력
        int[] score = {90,87,100, 95, 80};
        int[] rank = {1,1,1,1,1};

        //[2] 처리

        for(int i=0; i<score.length; i++){
            rank[i] = 1; //1등으로 초기화

            for (int j = 0; j < score.length; j++) { //기준데이터와 나머지데이터비교
                if(score[i]<score[j]){   //기준데이터가 나머지데이터라 비교했을때 적으면 rank[i] 카운트
                    rank[i]++; //COUNT
                }
            }
        }

        //[3] 출력
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]+"점 : "+rank[i]+"등");
        }
    }
}
