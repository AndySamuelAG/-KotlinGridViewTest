package com.example.testgridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var frutas = ArrayList<Fruta>()

        frutas.add(Fruta("Manzana", R.drawable.manzana, "15"))
        frutas.add(Fruta("Platano", R.drawable.platano, "13"))
        frutas.add(Fruta("Sandia", R.drawable.sandia, "14"))
        frutas.add(Fruta("Durazno", R.drawable.durazno, "10"))

        var grid : GridView = findViewById(R.id.grid)

        //val adaptador = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, frutas)

        val adaptador = AdaptadorCustom(this, frutas)
        grid.adapter = adaptador

        grid.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, frutas.get(position).nombre, Toast.LENGTH_LONG).show()
        }
    }
}
