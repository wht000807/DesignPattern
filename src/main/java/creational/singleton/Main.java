package creational.singleton;

/**
 * @Author : wanghongtao
 * @Date : 2022/3/9
 * @Description :
 */
public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadT());
        Thread thread2 = new Thread(new ThreadT());
        thread1.start();
        thread2.start();
        System.out.println("Program Stop");

    }
}
