package com.example.renato.myapplication3;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.db.chart.model.Bar;
import com.db.chart.model.BarSet;
import com.db.chart.view.BarChartView;
import com.db.chart.view.animation.Animation;
import com.db.chart.view.animation.easing.LinearEase;

public class MainActivity extends AppCompatActivity{

    BarChartView graph;
    private String[] mLabels= {"W", "I", "L", "L", "I", "A", "M"};
    private float[] mValues = {2.5f, 3.7f, 4f, 8f, 4.5f, 4f, 5f};
    private int mBarBackgroundColorId = 1;
    private float mBarCornersSize = 25.54f; //arredonda as quinas

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        graph = (BarChartView) findViewById(R.id.view);
        graph.reset();


        BarSet dataset = new BarSet();

        Bar barra = new Bar("Seg.", 10.5f);
        barra.setColor(49151);

        dataset.addBar(barra);

        graph.addData(dataset);

        graph.setBarSpacing(2.3f);
        graph.setBarBackgroundColor(mBarBackgroundColorId);
        graph.setRoundCorners(mBarCornersSize);
        graph.show();

    }
}
