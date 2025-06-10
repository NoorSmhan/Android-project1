//
//package com.example.addstudent;
//
//import android.os.Bundle;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class AdsActivity extends AppCompatActivity {
//
//    private RecyclerView recyclerView;
//    private AdsAdapter adapter;
//    private List<Advertisement> advertisementList;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_ads);
//
//
//        recyclerView = findViewById(R.id.recyclerViewAds);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//
//        advertisementList = new ArrayList<>();
//        // Populate the list with sample data or data from the database
//        loadAds();
//
//        adapter = new AdsAdapter(advertisementList);
//        recyclerView.setAdapter(adapter);
//    }
//
//    private void loadAds() {
//        // Example Ads, in a real app, this data can come from a REST API or database
//        advertisementList.add(new Advertisement("New Offer on Books", "50% discount on textbooks", R.drawable.book_discount_image));
//        advertisementList.add(new Advertisement("Semester Sale", "Get 30% off on all accessories", R.drawable.sale_image));
//    }
//}