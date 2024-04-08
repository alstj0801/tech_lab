package ch3;


public class NumType {
    public static void main(String[] args) {
        // 숫자연산
        int a = 10;
        int b = 5;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);


        // 증감연산
        int i = 0;
        int j = 10;
        i++;
        j--;

        System.out.println(i);
        System.out.println(j);

        int k = 17;
        System.out.println(k++);
        System.out.println(k);
    }
}