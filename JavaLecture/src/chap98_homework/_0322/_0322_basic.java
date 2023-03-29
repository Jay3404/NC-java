package chap98_homework._0322;

public class _0322_basic {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("\n문제 1");
        String str = "가나다라마바사";
        String str1 = "나다라마사";
        System.out.println(home1(str));

        System.out.println("\n문제 2");
        home2(str);
        home2(str1);

        System.out.println("\n문제 3");
        String str3 = "aeiouAEIOU가나다라";
        System.out.println(home3(str3));

        System.out.println("\n문제 4");
        String str4 = "다라";
        home4(str3, str4);

    }

//	1. 사용자가 입력한 문자열을 받아서 가운데 문자를 출력하세요.
//  문자열의 길이가 짝수면 가운데 두 글자 출력. ex) 비둘기 -> 둘, 비트캠프 -> 트캠
    public static String home1(String str) {
        String s = "";
        int sLen = str.length();
        if (sLen % 2 == 0) {
            s = str.substring(sLen / 2 - 1, sLen / 2 + 1);
        } else {
            s += str.charAt(sLen / 2);
        }
        return s;
    }

//	2. 사용자가 입력한 문자열에서 가, 바의 개수를 새서 출력하세요.
//	   0개면 '가, 바가 존재하지 않습니다.'라고 출력.
    public static void home2(String str) {
        char ga = '가';
        char ba = '바';
        int n = countChar(str, ga) + countChar(str, ba);
        if (n > 0) {
            System.out.println(ga + "의 개수: " + countChar(str, ga));
            System.out.println(ba + "의 개수: " + countChar(str, ba));
        } else {
            System.out.println("가, 바가 존재하지 않습니다.");
        }
    }

    public static int countChar(String str, char ch) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        return count;
    }

//	3. 사용자가 입력한 문자열에서 알파벳의 모음을 제거하여 출력하세요.
//	   대문자 모음, 소문자 모음 모두 제거. 모음은 a, e, i, o, u

    public static String home3(String str) {
        String s = "";
        s = str.replaceAll("[aeiouAEIOU]", "");
        return s;
    }

//	4. 사용자가 입력한 문자열1, 문자열2 문자열1이 문자열2를 포함하면
//	   '포함합니다.'를 출력, 아니면 '포함하지 않습니다.'를 출력

    public static void home4(String str1, String str2) {
        if (str1.contains(str2)) {
            System.out.println("포함합니다");
        } else {
            System.out.println("포함하지 않습니다.");
        }
    }
}
