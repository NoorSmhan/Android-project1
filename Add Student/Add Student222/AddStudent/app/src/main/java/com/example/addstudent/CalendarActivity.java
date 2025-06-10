//package com.example.addstudent;
//
//import android.os.Bundle;
//import android.widget.CalendarView;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//
//public class CalendarActivity extends AppCompatActivity {
//
//    private CalendarView calendarView;
//    private TextView selectedDateText;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_calendar);
//
//        calendarView = findViewById(R.id.calendarView);
//        selectedDateText = findViewById(R.id.selectedDateText);
//
//        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
//            @Override
//            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
//                String date = "Selected Date: " + dayOfMonth + "/" + (month + 1) + "/" + year;
//                selectedDateText.setText(date);
//            }
//        });
//    }
//}
