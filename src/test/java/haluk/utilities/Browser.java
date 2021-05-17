package haluk.utilities;

import java.util.concurrent.TimeUnit;

public class Browser extends Driver{
    public static void waitImplisit (int second){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }



}
