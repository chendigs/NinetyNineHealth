package health.warriors.ninetyninehealth;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RatingBar;
import android.widget.TextView;

public class AnxietyActivity extends Activity {
    private AnxietyInfo info = AnxietyInfo.getAnxietyInfo();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anxietyactivity);



        // Declare our View variables assign the views from the layout file
        final TextView anxietyLabel = (TextView) findViewById(R.id.anxietyView);
        anxietyLabel.setMovementMethod(new ScrollingMovementMethod());
        ImageButton anxietyimageButton = (ImageButton) findViewById(R.id.anxietyimageButton);
        final RatingBar ratinganxietyBar = (RatingBar) findViewById(R.id.ratinganxietyBar);
        View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //The button was clicked, so update the anxietyLabel with a new fact
                //Select the next fact

                info = AnxietyInfo.getAnxietyInfo();
                //Update the label with the next fact
                anxietyLabel.setText(Html.fromHtml(info.info));
                ratinganxietyBar.setRating(info.rating);
            }
        };
        anxietyimageButton.setOnClickListener(listener);

        ratinganxietyBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean b) {
                info.rating = rating;

            }
        });


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.anxietyactivity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}


