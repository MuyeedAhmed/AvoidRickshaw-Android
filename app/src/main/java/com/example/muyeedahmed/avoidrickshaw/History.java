package com.example.muyeedahmed.avoidrickshaw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class History extends AppCompatActivity {
    LineGraphSeries<DataPoint> series1;
    LineGraphSeries<DataPoint> series2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        GraphView graph1 = (GraphView) findViewById(R.id.graph1);
        series1 = new LineGraphSeries<DataPoint>();
        series1.resetData(generateData1());
        graph1.addSeries(series1);

        GraphView graph2 = (GraphView) findViewById(R.id.graph2);
        series2 = new LineGraphSeries<DataPoint>();
        series2.resetData(generateData2());
        graph2.addSeries(series2);


    }
    private DataPoint[] generateData1() {
        int count = 7;
        DataPoint[] values = new DataPoint[count];

        values[0] = new DataPoint(1, 21.1634);
        values[1] = new DataPoint(2, 33.4233);
        values[2] = new DataPoint(3, 26.3926);
        values[3] = new DataPoint(4, 0);
        values[4] = new DataPoint(5, 22.3919);
        values[5] = new DataPoint(6, 39.5356);
        values[6] = new DataPoint(7, 54.1717);

        return values;
    }
    private DataPoint[] generateData2() {
        int count = 7;
        DataPoint[] values = new DataPoint[count];

        values[0] = new DataPoint(1, 20);
        values[1] = new DataPoint(2, 25);
        values[2] = new DataPoint(3, 20);
        values[3] = new DataPoint(4, 0);
        values[4] = new DataPoint(5, 20);
        values[5] = new DataPoint(6, 30);
        values[6] = new DataPoint(7, 35);

        return values;
    }


}
