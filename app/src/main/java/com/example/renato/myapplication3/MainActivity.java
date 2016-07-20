package com.example.renato.myapplication3;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.db.chart.model.BarSet;
import com.db.chart.view.BarChartView;

public class MainActivity extends AppCompatActivity {

    BarChartView graph;
    private String[] mLabels= {"W", "I", "L", "L", "I", "A", "M"};
    private float[] mValues = {2.5f, 3.7f, 4f, 8f, 4.5f, 4f, 5f};
    private int mBarBackgroundColorId = 2;
    private float mBarCornersSize = 5.54f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        graph = (BarChartView) findViewById(R.id.view);
        graph.reset();

        BarSet dataset = new BarSet(mLabels,mValues);
        dataset.setColor(10);
        graph.addData(dataset);

        graph.setBarSpacing(2.3f);
        graph.setBarBackgroundColor(mBarBackgroundColorId);
        graph.setRoundCorners(mBarCornersSize);
        graph.show();
    }
}
