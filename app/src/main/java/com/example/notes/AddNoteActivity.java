package com.example.notes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class AddNoteActivity extends AppCompatActivity {

    EditText inputNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);
        inputNote = findViewById(R.id.addNote);

        Intent intent = getIntent();

        if (intent.getStringExtra("Note") != null){
            inputNote.setText(intent.getStringExtra("Note"));
            inputNote.setSelection(intent.getStringExtra("Note").length());
        }
    }

    @Override
    public void onBackPressed() {
        Intent intent = getIntent();
        intent.putExtra("AddedNote", inputNote.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }


}