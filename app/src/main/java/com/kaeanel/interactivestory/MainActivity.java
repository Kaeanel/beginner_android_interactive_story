package com.kaeanel.interactivestory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nameField;
    private Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameField = (EditText) findViewById(R.id.nameEditText);
        startButton = (Button) findViewById(R.id.startButton);

        startButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String name = nameField.getText().toString();
                startStory(name);
            }
        });
    }

    private void startStory(String name) {
        Intent intent = new Intent(this, StoryActivity.class);
        intent.putExtra("name", name);
        startActivity(intent);
    }
}
