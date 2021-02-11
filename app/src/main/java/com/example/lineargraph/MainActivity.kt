package com.example.lineargraph

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.jjoe64.graphview.series.DataPoint
import com.jjoe64.graphview.series.DataPointInterface
import com.jjoe64.graphview.series.LineGraphSeries
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.IllegalArgumentException

class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        graph.visibility = View.VISIBLE
        addButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val firstInput_1: String
        val secondInput_1: String
        val firstInput_2: String
        val secondInput_2: String
        val firstInput_3: String
        val secondInput_3: String
        val firstInput_4: String
        val secondInput_4: String
        //  1 and 5
        //  1 and 5
        firstInput_1 = firstNum_1.text.toString()
        secondInput_1 = secondNum_1.text.toString()
        firstInput_2 = firstNum_2.text.toString()
        secondInput_2 = secondNum_2.text.toString()
        firstInput_3 = firstNum_3.text.toString()
        secondInput_3 = secondNum_3.text.toString()
        firstInput_4 = firstNum_4.text.toString()
        secondInput_4 = secondNum_4.text.toString()
        try {
                val series = LineGraphSeries(arrayOf(
                        DataPoint(0.0, 0.0),
                        DataPoint(firstInput_1.toDouble(), secondInput_1.toDouble()),
                        DataPoint(firstInput_2.toDouble(), secondInput_2.toDouble()),
                        DataPoint(firstInput_3.toDouble(), secondInput_3.toDouble()),
                        DataPoint(firstInput_4.toDouble(), secondInput_4.toDouble()))
                )
            graph.addSeries(series);
        }catch (e:IllegalArgumentException){
            Toast.makeText(this,e.message,Toast.LENGTH_SHORT)
        }
    }




}
