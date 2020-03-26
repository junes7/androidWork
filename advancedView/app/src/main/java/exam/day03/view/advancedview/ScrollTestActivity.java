package exam.day03.view.advancedview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class ScrollTestActivity extends AppCompatActivity {
    ImageView img01;
    ImageView img02;
    int index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scroll_test2);
        img01=findViewById(R.id.imgup);
        img02=findViewById(R.id.imgdown);

    }
    //버트을 클릭할 때 호출되는 메소드
    public void myclick(View v){
        imageChange();
    }
    //버튼을 선택할때마다 이미지가 교체되어 보이도록 구현
    public void imageChange(){
        if(index==1) {
            //0번에 해당하는 이미지를 화면에 보이도록 설정
            img01.setVisibility(View.VISIBLE);
            //1번은 화면에 보이지 않도록 설정
            img02.setVisibility(View.INVISIBLE);
            Log.d("vlaue","현재index값===>"+index);
            index= 0;
        }else if(index==0){
            img01.setVisibility(View.INVISIBLE);
            img02.setVisibility(View.VISIBLE);
            Log.d("vlaue","현재index값===>"+index);
            index= 1;
        }
    }
}
