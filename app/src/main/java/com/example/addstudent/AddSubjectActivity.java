package com.example.addstudent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class AddSubjectActivity extends AppCompatActivity {

    private EditText subjectIdEditText, subjectNameEditText, teacherIdEditText;
    private Button addSubjectButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_subject);
        subjectIdEditText = findViewById(R.id.subjectIdEditText);

        subjectNameEditText = findViewById(R.id.subjectNameEditText);
       teacherIdEditText = findViewById(R.id.teacherIdEditText);
        addSubjectButton = findViewById(R.id.addSubjectButton);

        addSubjectButton.setOnClickListener(v -> addSubject());
    }

    private void addSubject() {
        String subject_id = subjectIdEditText.getText().toString().trim();
        String subject_name = subjectNameEditText.getText().toString().trim();
        String teacherId = teacherIdEditText.getText().toString().trim();

        if ( subject_id.isEmpty() || subject_name.isEmpty() || teacherId.isEmpty() ) {
            Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
            return;
        }

//        StringRequest stringRequest = new StringRequest(Request.Method.POST, "http://127.0.0.1/school_api/add_subject.php",
        StringRequest stringRequest = new StringRequest(Request.Method.POST, "http://10.0.2.2/school_api/add_subject.php",

                response -> {

                    Toast.makeText(AddSubjectActivity.this, response, Toast.LENGTH_LONG).show();
                },
                error -> {

                    Toast.makeText(AddSubjectActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
                }) {

            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<>();
                params.put("subject_id", subject_id);
                params.put("subject_name", subject_name);
                params.put("teacher_id", teacherId);
                return params;
            }
        };

        Volley.newRequestQueue(this).add(stringRequest);
    }
}

//package com.example.addstudent;
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.Toast;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import com.android.volley.Request;
//import com.android.volley.Response;
//import com.android.volley.VolleyError;
//import com.android.volley.toolbox.StringRequest;
//import com.android.volley.toolbox.Volley;
//
//import java.util.HashMap;
//import java.util.Map;
//public class AddSubjectActivity extends AppCompatActivity {
//
//    private EditText subjectNameEditText, subjectCodeEditText, teacherIdEditText;
//    private Button addSubjectButton;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_add_subject);
//
//        subjectNameEditText = findViewById(R.id.subjectNameEditText);
//        subjectCodeEditText = findViewById(R.id.subjectCodeEditText);
//        teacherIdEditText = findViewById(R.id.teacherIdEditText);
//        addSubjectButton = findViewById(R.id.addSubjectButton);
//
//        addSubjectButton.setOnClickListener(v -> addSubject());
//    }
//
//    private void addSubject() {
//        String subjectName = subjectNameEditText.getText().toString().trim();
//        String subjectCode = subjectCodeEditText.getText().toString().trim();
//        String teacherId = teacherIdEditText.getText().toString().trim();
//
//        if (subjectName.isEmpty() || subjectCode.isEmpty() || teacherId.isEmpty()) {
//            Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
//            return;
//        }
//
//        StringRequest stringRequest = new StringRequest(Request.Method.POST, "http:// 172.19.36.64/school_api/add_subject.php?",               response -> {
//                    // Handle response from the server
//                    Toast.makeText(AddSubjectActivity.this, response, Toast.LENGTH_LONG).show();
//                },
//                error -> {
//                    // Handle error
//                    Toast.makeText(AddSubjectActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
//                }) {
//            // ...
//
//
//        @Override
//            protected Map<String, String> getParams() {
//                Map<String, String> params = new HashMap<>();
//                params.put("subject_name", subjectName);
//                params.put("subject_code", subjectCode);
//                params.put("teacher_id", teacherId);
//                return params;
//            }
//        };
//
//        // Add request to the queue
//        Volley.newRequestQueue(this).add(stringRequest);
//    }
//}
