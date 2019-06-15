package e.max.strag;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

public class OptionActivity extends AppCompatActivity implements View.OnClickListener {
    int a = 0;
    int b = 0;
    Button b1;
    ImageView v1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_option);
        Button button = (Button) findViewById(R.id.Musikbutton);

        v1 = (ImageView) findViewById(R.id.Hintergrund);
        b1 = (Button) findViewById(R.id.Backgroundändern);
        b1.setOnClickListener(this);


    }

    public void Musikanmachen(View view){

        if(a == 0) {
            Button button = (Button) view;
            ((Button) view).setText("An");
            a = 1;
        }
        else if(a == 1) {

            a = 0; Button button = (Button) view;
            ((Button) view).setText("Aus");
        }


    }

    @Override
    public void onClick(View v) {


        if(b == 0) {
            v1.setImageResource(R.drawable.dunklerbackground);

            b1.setText("Dunkel");
            b = 1;
        }else if(b == 1){

            v1.setImageResource(R.drawable.simplerbackground);
            b1.setText("Hell");
            b = 0;
        }
    }
}
