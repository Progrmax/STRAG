package e.max.strag;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.Window;


public class SpielActivity extends AppCompatActivity {

public static int level = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_spiel);
    }
    public void Level1starten(View view){

        Intent GameActivity = new Intent(SpielActivity.this, GameActivity.class );
        startActivity(GameActivity);

        level = 1;
    }

    public void Level2starten(View view){

        Intent GameActivity = new Intent(SpielActivity.this, GameActivity.class );
        startActivity(GameActivity);

        level = 2;
    }
    public void Level3starten(View view){

        Intent GameActivity = new Intent(SpielActivity.this, GameActivity.class );
        startActivity(GameActivity);


    }
    public void Level4starten(View view){

        Intent GameActivity = new Intent(SpielActivity.this, GameActivity.class );
        startActivity(GameActivity);


    }
    public void Level5starten(View view){

        Intent GameActivity = new Intent(SpielActivity.this, GameActivity.class );
        startActivity(GameActivity);


    }
    public void Level6starten(View view){

        Intent GameActivity = new Intent(SpielActivity.this, GameActivity.class );
        startActivity(GameActivity);

    }
}
