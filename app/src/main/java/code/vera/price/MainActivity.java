package code.vera.price;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
   private LuckPan luckPan;
    private ImageView ivStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        addListener();
    }

    private void addListener() {
        ivStart.setOnClickListener(this);
    }

    private void initView() {
        luckPan= (LuckPan) findViewById(R.id.luckpan);
        ivStart= (ImageView) findViewById(R.id.iv_start);
    }

    @Override
    public void onClick(View v) {
        if (!luckPan.isStart()){
            luckPan.luckyStart(0);//1---ipad
            ivStart.setImageResource(R.drawable.stop);

        }else{
            if (!luckPan.isShouldEnd()){
                luckPan.luckyEnd();
                ivStart.setImageResource(R.drawable.start);
            }


        }
    }
}
