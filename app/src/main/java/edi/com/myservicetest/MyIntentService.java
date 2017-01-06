package edi.com.myservicetest;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Edi on 1/6/2017.
 */

public class MyIntentService extends IntentService {

    public MyIntentService() {
        super("intent service");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
            for(int i=0; i< 10; i++){
            int num = intent.getIntExtra("number", -1);
            Log.d("MyIntentService", num + "");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
