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

public class PTSDActivity extends Activity {
    private PTSDInfo info;

    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptsdactivity);

        final TextView PTSDlabel = (TextView) findViewById(R.id.ptsdView);
        PTSDlabel.setMovementMethod(new ScrollingMovementMethod());
        ImageButton ptsdImageButton = (ImageButton) findViewById(R.id.ptsdimageButton);
        final RatingBar ratingptsdbar = (RatingBar) findViewById(R.id.ratingptsdBar);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                info = PTSDInfo.getPTSDInfo();

                PTSDlabel.setText(Html.fromHtml(info.info));
                ratingptsdbar.setRating(info.rating);


            }
        };
        ptsdImageButton.setOnClickListener(listener);
        ratingptsdbar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean b){
                info.rating = rating;


            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.ptsdactivity, menu);
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


