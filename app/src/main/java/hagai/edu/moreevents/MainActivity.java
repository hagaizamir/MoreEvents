package hagai.edu.moreevents;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    private TextView tvResult;
    private SeekBar sbRed;
    private  SeekBar sbGreen;
    private SeekBar sbBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        (tvResult) = (TextView) findViewById(R.id.tvResult);
        (sbRed) = (SeekBar) findViewById(R.id.sbRed);
        (sbGreen) = (SeekBar) findViewById(R.id.sbGreen);
        (sbBlue) = (SeekBar) findViewById(R.id.sbBlue);


        sbRed.setOnSeekBarChangeListener(this);
        sbGreen.setOnSeekBarChangeListener(this);
        sbBlue.setOnSeekBarChangeListener(this);


    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//        tvResult.setTextSize(sbTextSize.getProgress());
//        tvResult.setTextSize(progress);
        int rgb = Color.rgb(sbRed.getProgress(),sbGreen.getProgress(),sbBlue.getProgress());
        tvResult.setBackgroundColor(rgb);
//        int x = 0xff00ff;
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
