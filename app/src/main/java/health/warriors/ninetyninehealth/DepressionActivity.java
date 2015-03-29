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

/**
 * Created by Chenry on 2015-03-26.
 */
public class DepressionActivity extends Activity {
    private DepressionInfo info;

    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depressionactivity);

     final TextView depressionLabel = (TextView) findViewById(R.id.depressionView);
        depressionLabel.setMovementMethod(new ScrollingMovementMethod());
        ImageButton depressionImageButton = (ImageButton) findViewById(R.id.depressionimageButton);
        final RatingBar ratingdepressionBar = (RatingBar) findViewById(R.id.ratingdepressionBar);
        View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                info = DepressionInfo.getDepressionInfo();

                depressionLabel.setText(Html.fromHtml(info.info));
                ratingdepressionBar.setRating(info.rating);
            }
        };
        depressionImageButton.setOnClickListener(listener);

        ratingdepressionBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean b) {
                info.rating = rating;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_depressionactivity, menu);
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
