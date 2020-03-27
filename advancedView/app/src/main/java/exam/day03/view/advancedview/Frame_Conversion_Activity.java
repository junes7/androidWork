package exam.day03.view.advancedview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Frame_Conversion_Activity extends AppCompatActivity {
    LinearLayout frame1;
    LinearLayout frame2;
    LinearLayout frame3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame__conversion);
        frame1 = findViewById(R.id.frame1);
        frame2 = findViewById(R.id.frame2);
        frame3 = findViewById(R.id.frame3);


    }

    public void myclick(View v){
        if(v.getId()==R.id.login){
            frame1.setVisibility(View.VISIBLE);
            frame2.setVisibility(View.INVISIBLE);
            frame3.setVisibility(View.INVISIBLE);
        } else if(v.getId()==R.id.register){
            frame1.setVisibility(View.INVISIBLE);
            frame2.setVisibility(View.VISIBLE);
            frame3.setVisibility(View.INVISIBLE);
        } else if(v.getId()==R.id.detail){
            frame1.setVisibility(View.INVISIBLE);
            frame2.setVisibility(View.INVISIBLE);
            frame3.setVisibility(View.VISIBLE);
        }
    }

  /*      Button btnsetter = findViewById(R.id.btnset);
        btngetter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = txtinfo.getText()+"";
                lblinfo.setText(msg);
            }
        });
        btnsetter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtinfo.setText("가져온 문자열: 작업완료");
            }
        });
        findViewById(R.id.)*/



}
