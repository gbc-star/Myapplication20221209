package top.bochuangao.myapplicatio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        tv1 = findViewById(R.id.result);

        btn1.setOnClickListener(view -> {
            int a = 10;
            Random random = new Random();
            int b = random.nextInt(a);
            tv1.setText("" + b);
        });
    }
}