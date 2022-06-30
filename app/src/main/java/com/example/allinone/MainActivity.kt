package com.example.allinone

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Calender
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        pickDateBtn.setOnClickListener {
            val dpd = DatePickerDialog(this,
                DatePickerDialog.OnDateSetListener{ view, mYear, mMonth, mDay->
                //set to textView
                val dateTv = findViewById<TextView>(R.id.dateTv)
                dateTv.setText(""+ mDay + "/" + mMonth + "/" + mYear)
            },year, month,day)
            //show dialog
            dpd.show()
        }
        val btn = findViewById<Switch>(R.id.switch1)

        // set the switch to listen on checked change
        btn.setOnCheckedChangeListener { _, isChecked ->
            if (btn.isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                btn.text = "Disable dark mode"
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                btn.text = "Enable dark mode"
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.example_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.item1->{
                Toast.makeText(applicationContext,"clicked on BlueTooth", Toast.LENGTH_LONG).show()
                true
            }
            R.id.item2->{
                Toast.makeText(applicationContext, "Clicked on Setting", Toast.LENGTH_LONG).show()
                true
            }
            R.id.item3->{
                Toast.makeText(applicationContext, "Clicked on Edit", Toast.LENGTH_LONG).show()
                true
            }
            R.id.item4->{
                Toast.makeText(applicationContext, "Clicked on Share", Toast.LENGTH_LONG).show()
                true
            }R.id.subItem1->{
                Toast.makeText(applicationContext, "Clicked on WhatsApp", Toast.LENGTH_LONG).show()
                true
            }R.id.subItem2->{
                Toast.makeText(applicationContext, "Clicked on ShareIt", Toast.LENGTH_LONG).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}