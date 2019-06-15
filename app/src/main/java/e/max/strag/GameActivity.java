package e.max.strag;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity implements View.OnClickListener {

    Button b1;
    Button b2;
    ImageView v1;
    ImageView friendhaus;
    ImageView feindhaus;
    TextView anzahlSoldaten;

    int spielgewinnen = 0;
    int o = 0;
    int anzahlsoldatennummer = 0;
    String anzahlsoldaten = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_game);
        v1 = (ImageView) findViewById(R.id.Hintergrund7);
        friendhaus = (ImageView) findViewById(R.id.friendhaus);
        feindhaus = (ImageView) findViewById(R.id.feindhaus);
        anzahlSoldaten = (TextView) findViewById(R.id.feindhausanzahl);

        Button button = (Button) findViewById(R.id.pausebutton);

        b1 = (Button) findViewById(R.id.spielstartenbutton);
        b2 = (Button) findViewById(R.id.pausebutton);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        o = SpielActivity.level;
    }


    public void onClick(View view) {

        if (o == 1) {
            v1.setImageResource(R.drawable.battlebackgroundeins);
            b1.setVisibility(View.GONE);
            friendhaus.setVisibility(View.VISIBLE);
            feindhaus.setVisibility(View.VISIBLE);
            anzahlSoldaten.setVisibility(View.VISIBLE);
            b2.setVisibility(View.VISIBLE);


        } else if (o == 2) {
            v1.setImageResource(R.drawable.battlebackgroundzwei);
            b1.setVisibility(View.GONE);
        }
    }

    public void Pause() {


    }
    public void onClick1(View view) {
           // while (anzahlsoldatennummer <= 50) {

                //anzahlsoldatennummer += 1;
                //anzahlsoldaten = Integer.toString(anzahlsoldatennummer);
               Button button = (Button) view;
                ((Button) view).setText("An");
               // anzahlSoldaten.setText(anzahlsoldaten);
                /*try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                */

            }

    }
