package com.example.andreza.calculator;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

public class MainCalculator extends AppCompatActivity {
    private TextView textResultOnTheScreen;
    private Math settingNumber = new Math();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__calculator_);

        textResultOnTheScreen = findViewById(R.id.text_res_id);

    }

    public void clear (View view){
        textResultOnTheScreen.setText("");
        settingNumber.setFirstNumbertyped(0);
        settingNumber.setLastNumberTyped(0);
    }

    public void showResult(View view){
        float value = Float.parseFloat(textResultOnTheScreen.getText().toString());
        float resultOfOperation = settingNumber.doOperation();
        textResultOnTheScreen.setText(String.valueOf(resultOfOperation));
    }

    public void addValue(View view){
        String actualValue = textResultOnTheScreen.getText().toString();
            if (actualValue.contains("+") || actualValue.contains("-") || actualValue.contains("x") || actualValue.contains("÷")){
                actualValue = "";
            String clicked = ((TextView) view).getText().toString();
            textResultOnTheScreen.setText(actualValue + clicked);
            }
            else {
                actualValue = textResultOnTheScreen.getText().toString();

            String clicked = ((TextView) view).getText().toString();
            textResultOnTheScreen.setText(actualValue + clicked);
            }
    }

    public void operation(View view){
        float value = Float.parseFloat(textResultOnTheScreen.getText().toString());
        settingNumber.setFirstNumbertyped(value);
        String signal = ((TextView)view).getText().toString();
        settingNumber.setOperation(OperatorSignal.searchBySignal(signal));
        textResultOnTheScreen.setText(signal);
    }

}
