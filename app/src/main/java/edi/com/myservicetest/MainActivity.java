package edi.com.myservicetest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private View intentServiceView1;
    private View intentServiceView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intentServiceView1 = findViewById(R.id.intentService1);
        intentServiceView2 = findViewById(R.id.intentService2);

        intentServiceView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent serviceIntent = new Intent(MainActivity.this, MyIntentService.class);
                serviceIntent.putExtra("number", 1);
                startService(serviceIntent);
            }
        });

        intentServiceView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent serviceIntent = new Intent(MainActivity.this, MyIntentService.class);
                serviceIntent.putExtra("number", 2);
                startService(serviceIntent);
            }
        });
    }
}
