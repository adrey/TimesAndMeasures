package info.safronoff.timesandmeasures

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val entries = ArrayList<Entry>()
        var rand = Random()
        for (i in (1..10)) {

            // turn your data into Entry objects
            entries.add(Entry(i * 1f, rand.nextFloat()))
        }
        val dataSet = LineDataSet(entries, "Label") // add entries to dataset
        dataSet.color = Color.RED
        dataSet.valueTextColor = Color.RED
        chart.data = LineData(dataSet)
    }
}
