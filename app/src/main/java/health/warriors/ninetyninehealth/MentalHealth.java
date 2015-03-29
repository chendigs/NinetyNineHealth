package health.warriors.ninetyninehealth;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Chenry on 2015-03-24.
 */
public class MentalHealth extends Activity {

    private static Button anxietyButton;
    private static Button depressionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainlayout);
    }

    public void onClickAnxiety(View v) {
        Intent intent = new Intent(this, AnxietyActivity.class);
        startActivity(intent);
    }

    public void onClickDepression(View v) {
        Intent intent = new Intent(this, DepressionActivity.class);
        startActivity(intent);
    }

    public void onClickPTSD(View v) {
        Intent intent = new Intent(this, PTSDActivity.class);
        startActivity(intent);
    }
}






























