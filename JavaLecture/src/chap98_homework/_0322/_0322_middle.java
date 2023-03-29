package chap98_homework._0322;

public class _0322_middle {
    public static void main(String[] args) {
        System.out.println("문제1");

        String s = "abcdef";
        String ss = reverseString(s);
        System.out.println(ss);

        System.out.println("\n문제 2");

        String s2 = "aabbccddeeaabbccddeeqwer";
        System.out.println(middle2(s2));

        System.out.println("\n문제 3");

        String s3 = "일이삼사오육칠팔구십";
        System.out.println(middle3(s3));

    }

//        1. Reverse라는 클래스를 만들고 메소드로
//        String reverseString(String str)를 만듭니다.
//        매개변수로 받은 str을 거꾸로 만든 String을 리턴하도록 만드세요.
    public static String reverseString(String str) {
        String reStr = "";
        char[] charArr = str.toCharArray();
        for (int i = charArr.length - 1; i >= 0; i--) {
            reStr += charArr[i];
        }
        return reStr;
    }

//        2. 사용자가 입력한 문자열에서 중복된 문자를 제거한 문자열을 출력하세요.
    public static String middle2(String str) {
        String reStr = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                reStr += str.charAt(i);
            }
        }
        return reStr;
    }

//        3. 사용자가 입력한 문자열에서 3의 배수 자리의 문자는 3으로 5의 배수 자리의 문자는 5로 변경하여 출력하세요.
    public static String middle3(String str) {
        String reStr = "";
        char[] charArr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            int n = i + 1;
            if (n % 3 == 0 && n % 5 == 0) {
                reStr += 35;
            } else if (n % 3 == 0) {
                reStr += 3;
            } else if (n % 5 == 0) {
                reStr += 5;
            } else {
                reStr += charArr[i];
            }
        }

        return reStr;
    }
}

