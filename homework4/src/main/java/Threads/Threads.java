package Threads;

/*/
*
* Создает три потока, каждый из которых выводит одну букву: А, В, С
*
**/
public class Threads {

    private static Letters letters = new Letters('A', 'B', 'C');

    public static void main(String[] args) {
        final Thread letter1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (letters) {
                    for (int i = 0; i < 5; i++) {
                        letters.notify();
                        System.out.println(letters.getSymb1());
                        try {
                            letters.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        Thread letter2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (letters) {
                    for (int i = 0; i < 5; i++) {
                        letters.notify();
                        System.out.println(letters.getSymb2());
                        try {
                            letters.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        Thread letter3 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (letters) {
                    for (int i = 0; i < 5; i++) {
                        letters.notify();
                        System.out.println(letters.getSymb3());
                        try {
                            letters.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        letter1.start();
        letter2.start();
        letter3.start();
    }
}
