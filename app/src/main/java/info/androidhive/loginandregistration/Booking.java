package info.androidhive.loginandregistration;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Booking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "Roboto-Medium.ttf");

    }
}
