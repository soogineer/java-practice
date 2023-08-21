package sec03.chap01;

public class Ex04 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        //  int끼리 연산은 int 반환
        int c = a + b;

        long d = a + b;
//        short e = a + b; // ⚠️ 묵시적으로는 불가
        short f = (short) (a + b);
    }
}
