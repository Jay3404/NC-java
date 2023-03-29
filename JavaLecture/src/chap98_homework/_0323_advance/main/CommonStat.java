package chap98_homework._0323_advance.main;

public class CommonStat implements Student{
//    클래스 CommonStat
//    - int sno; 학번
//    - StringBuffer name;
//	  - String[] subject;
//	  - int[] finalExam;

    int sno;
    String name;
    String major;
    String[] subject;
    int[] finalExam;

    public void setSubject(String[] subject) {
        this.subject = subject.clone();
    }

    public void setFinalExam(int[] finalExam) {
        this.finalExam = finalExam.clone();
    }

    public CommonStat(int sno, String name, String major, int[] finalExam){
        this.sno = sno;
        this.name = name;
        this.major = major;
        this.finalExam = finalExam;
    }

//    @Override
//    public void saveInfo() {
//
//    }

    @Override
    public void printInfo() {
        System.out.println("학번: " + sno);
        System.out.println("이름: " + name);
        System.out.println("학과: " + major);
        System.out.println("평균점수: " + getAvg());
    }

    @Override
    public double getAvg() {
        double avg = 0;
        for (int i : finalExam){
            avg += i;
        }
        avg = avg/finalExam.length;
        avg = Math.ceil(avg*100)/100;
        return avg;
    }
}
