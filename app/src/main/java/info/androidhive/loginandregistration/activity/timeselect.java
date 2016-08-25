package info.androidhive.loginandregistration.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import info.androidhive.loginandregistration.R;

public class timeselect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeselect);
        RecyclerView.LayoutManager timeselectmanager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        RecyclerView timeselectmainview = (RecyclerView) findViewById(R.id.timeselectview);
        timeselectmainview.setLayoutManager(timeselectmanager);
        timeselectmainview.setAdapter(new timeviewadapter(timeselect.this));
    }
}
