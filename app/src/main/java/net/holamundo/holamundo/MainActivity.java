package net.holamundo.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bt;
    TextView tv;
    RelativeLayout bod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt= (Button) findViewById(R.id.btbutton);
        tv = (TextView) findViewById(R.id.tv);
        bod= (RelativeLayout) findViewById(R.id.body);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("cambie");
                tv.setTextColor(getResources().getColor(android.R.color.white));
                bod.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));

            }
        });

    }
}
