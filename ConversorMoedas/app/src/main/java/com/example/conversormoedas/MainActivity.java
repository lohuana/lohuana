package com.example.conversormoedas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder nViewHolder = new ViewHolder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.nViewHolder.editvalue = findViewById(R.id.edit_value);
        this.nViewHolder.textDollar = findViewById(R.id.text_dollar);
        this.nViewHolder.textEuro = findViewById(R.id.text_euro);
        this.nViewHolder.buttonCalculate = findViewById(R.id.button_calculate);

        this.nViewHolder.buttonCalculate.setOnClickListener(this);
        this.clearValues();
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.button_calculate) {
            // logica do botao
            Double value = Double.valueOf(this.nViewHolder.editvalue.getText().toString());
            this.nViewHolder.textDollar.setText(String.format("%.2f", value * 3));
            this.nViewHolder.textEuro.setText(String.format("%.2f", value * 4));


        }
    }

    private void clearValues(){
        this.nViewHolder.textDollar.setText("");
        this.nViewHolder.textEuro.setText("");

    }


    private static class ViewHolder{
        EditText editvalue;
        TextView textDollar;
        TextView textEuro;
        Button buttonCalculate;
    }
}

