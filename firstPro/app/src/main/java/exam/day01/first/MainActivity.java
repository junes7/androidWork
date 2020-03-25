package exam.day01.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //버튼을 클랙했을 때 실행할 메소드를 정의
    //메소드의 매개변수에 실행할 버튼을 정의
    //Button의 상위인 View타입으로 정의
    public void myclickMethod(View v) {
        Toast.makeText(this, "확인버튼이 눌러졌습니다.", Toast.LENGTH_LONG).show();
    }
    public void myclickMethod1(View v) {
        Toast.makeText(this, "취소버튼이 눌려졌습니다.", Toast.LENGTH_LONG).show();
    }
    public void myclickMethod2(View v){
        Toast.makeText(this, "삭제버튼이 눌려졌습니다.",Toast.LENGTH_LONG).show();
    }
}
