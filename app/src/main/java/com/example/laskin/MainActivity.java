package com.example.laskin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText numberInput;
    private EditText numberInput2;
    private TextView numberOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberInput = findViewById(R.id.editNumber);
        numberInput2 = findViewById(R.id.editNumber2);
        numberOutput = findViewById(R.id.textView);
    }

    public void summa(View view){

        if ((numberInput.getText().toString().length() ==0) || (numberInput2.getText().toString().length()==0)){
            numberOutput.setText("Syötä numerot molempaan tekstikenttään ensimmäiseksi.");
        }

        else {

            int ensimmainenNumero = Integer.parseInt(numberInput.getText().toString());
            int toinenNumero = Integer.parseInt(numberInput2.getText().toString());

            int summa = ensimmainenNumero + toinenNumero;
            numberOutput.setText("="+Integer.toString(summa));

        }

    }

    public void miinusLaskuFunktio(View view){

        if ((numberInput.getText().toString().length() ==0) || (numberInput2.getText().toString().length()==0)){
            numberOutput.setText("Syötä numerot molempaan tekstikenttään ensimmäiseksi.");
        }

        else {

            int ensimmainenNumero = Integer.parseInt(numberInput.getText().toString());
            int toinenNumero = Integer.parseInt(numberInput2.getText().toString());

            int miinus = ensimmainenNumero - toinenNumero;
            numberOutput.setText("="+Integer.toString(miinus));

        }


    }

    public void kertaFunktio(View view){

        if ((numberInput.getText().toString().length() ==0) || (numberInput2.getText().toString().length()==0)){
            numberOutput.setText("Syötä numerot molempaan tekstikenttään ensimmäiseksi.");
        }

        else {

            int ensimmainenNumero = Integer.parseInt(numberInput.getText().toString());
            int toinenNumero = Integer.parseInt(numberInput2.getText().toString());

            int kerta = ensimmainenNumero * toinenNumero;
            numberOutput.setText("="+Integer.toString(kerta));

        }

    }

    public void jakoLasku(View view){

        if ((numberInput.getText().toString().length() ==0) || (numberInput2.getText().toString().length()==0)){
            numberOutput.setText("Syötä numerot molempaan tekstikenttään ensimmäiseksi.");
        }

        else {

            double ensimmainenNumero = Double.parseDouble(numberInput.getText().toString());
            double toinenNumero = Double.parseDouble(numberInput2.getText().toString());

            double jako = Math.round((ensimmainenNumero / toinenNumero) * 10) / 10.0;
            numberOutput.setText("="+Double.toString(jako));

        }


    }





}