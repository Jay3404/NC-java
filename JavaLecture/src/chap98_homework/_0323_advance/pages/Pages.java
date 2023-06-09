package chap98_homework._0323_advance.pages;

public class Pages {
    MainPage mainPage;
    InputStudentInfo inputStudentInfo;
    InputSubject inputSubject;

    public Pages(){
        mainPage = new MainPage();
        inputStudentInfo = new InputStudentInfo();
        inputSubject = new InputSubject();
    }

    public class MainPage implements PageInput{
        public int mainPage(){
            System.out.println("------학적관리------");
            System.out.println("1. 학생정보 입력");
            System.out.println("2. 학생정보 검색");
            System.out.println("3. 학생정보 전체출력");
            System.out.println("4. 학과별 성적 순위");
            System.out.println("5. 종료");
            System.out.print("원하시는 메뉴 입력>>");

            return Integer.parseInt(input());
        }
    }

    public class InputStudentInfo implements PageInput{

        private int sno;
        private String name;
        private String major;

        public String getName() {
            return name;
        }

        public String getMajor() {
            return major;
        }

        public int getSno() {
            return sno;
        }

        public void inputStudentInfo() {
            System.out.println("------기본정보 입력------");
            System.out.print("학번 : ");
            this.sno = Integer.parseInt(input());
            System.out.print("이름 : ");
            this.name = input();
            System.out.print("학과 : ");
            this.major = input();
        }


    }

    public class InputSubject implements PageInput{
        private String subjectArr[];
        private int subjectScoreArr[];

        public String[] getSubjectArr() {
            return subjectArr;
        }

        public int[] getSubjectScoreArr() {
            return subjectScoreArr;
        }

        public int searchStudent(){
            System.out.println("과목을 입력할 학생의 학번을 입력하세요");
            System.out.print(">>");
            return Integer.parseInt(input());
        }

        public void inputSubject(){
            System.out.println("------과목정보 입력------");
            System.out.println("과목을 입력하세요. (과목은 ,로 구분하시오)");
            System.out.print(">>");
            String[] strArr = input().split(",");
            subjectArr = strArr.clone();

            System.out.println("점수를 입력하세요. (점수는 ,로 구분하시오)");
            System.out.print(">>");
            String[] arr = input().split(",");
            subjectScoreArr = new int[arr.length];
            for(int i=0; i<arr.length; i++){
                subjectScoreArr[i] = Integer.parseInt(arr[i]);
            }
        }
    }

    public class PrintStInfo {
        public void printStInfo(){
            System.out.println("학번: ");
            System.out.println("이름: ");
            System.out.println("학과: ");
            System.out.println("평균점수: ");
        }
    }
}
