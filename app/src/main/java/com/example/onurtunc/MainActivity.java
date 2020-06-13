package com.example.onurtunc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText1,editText2,editText3,editText4,editText5;
    CheckBox checkBox;
    Button button;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1=findViewById(R.id.text1);
        editText2=findViewById(R.id.text2);
        editText3=findViewById(R.id.text3);
        editText4=findViewById(R.id.text4);
        editText5=findViewById(R.id.text5);
        button=findViewById(R.id.btn);
        checkBox=findViewById(R.id.checkbox);

       button.setEnabled(false);

  checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
          if (isChecked)
          {
              button.setEnabled(true);
          }
          else
              button.setEnabled(false);
      }
  });

  button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          count++;
          if(count>=5)
          {
              Toast.makeText(MainActivity.this, "Your Right is Over", Toast.LENGTH_SHORT).show();
              button.setEnabled(false);
              checkBox.setEnabled(false);
          }
          else {
              if (!editText1.getText().toString().isEmpty() && !editText2.getText().toString().isEmpty() && !editText3.getText().toString().isEmpty() && !editText4.getText().toString().isEmpty() && !editText5.getText().toString().isEmpty() && checkBox.isEnabled()) {
                  Toast.makeText(MainActivity.this, "Successfully Registered", Toast.LENGTH_SHORT).show();
              } else {
                  Toast.makeText(MainActivity.this, "Fill All Fields", Toast.LENGTH_SHORT).show();
              }
          }
      }
  });


    }
}
