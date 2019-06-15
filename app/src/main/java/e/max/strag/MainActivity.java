package e.max.strag;


import android.content.Intent;
import android.graphics.Path;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class MainActivity extends AppCompatActivity{



    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void buttonOnClick (View view){
        Intent SpielIntent = new Intent(MainActivity.this, SpielActivity.class );
        startActivity(SpielIntent);
    }

    public void button2OnClick (View view){

        Intent OptionIntent = new Intent(MainActivity.this, OptionActivity.class);
        startActivity(OptionIntent);
    }
    }

