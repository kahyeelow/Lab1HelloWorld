package my.edu.tarc.lab1helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Global Variables
    EditText editTextName, editTextAge;
    TextView textViewMessage;

    //onCreate() = Main() function in java
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContainView() = show UI
        //R = resources class
        setContentView(R.layout.activity_main);

        //Link UI to java program
        editTextName = (EditText)findViewById(R.id.editTextName);
        editTextAge = (EditText)findViewById(R.id.editTextAge);
        textViewMessage = (TextView)findViewById(R.id.textViewMessage);
    }

    //view = anything you see on the screen are called view, eg: button
    public void displayMessage(View view){
        //To retrieve text from input
        String name;
        int age;
        name = editTextName.getText().toString();
        //Integer.parseInt to convert string to integer
        age = Integer.parseInt(editTextAge.getText().toString()) + 1;

        //change text use setter
        textViewMessage.setText("Hi " + name + ", You will be " + age + " in 2018.");
    }

    public void resetText(View view){
        editTextName.setText("");
        editTextAge.setText("");
        textViewMessage.setText("");
    }


}
