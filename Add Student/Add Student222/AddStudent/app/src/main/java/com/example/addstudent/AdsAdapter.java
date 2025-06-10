//
//package com.example.addstudent;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.List;
//
//public class AdsAdapter extends RecyclerView.Adapter<AdsAdapter.AdsViewHolder> {
//
//    private List<Advertisement> adsList;
//
//    public AdsAdapter(List<Advertisement> adsList) {
//        this.adsList = adsList;
//    }
//
//    @NonNull
//    @Override
//    public AdsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ads_item_layout, parent, false);
//        return new AdsViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull AdsViewHolder holder, int position) {
//        Advertisement advertisement = adsList.get(position);
//        holder.titleText.setText(advertisement.getTitle());
//        holder.descriptionText.setText(advertisement.getDescription());
//        holder.imageView.setImageResource(advertisement.getImageResource());
//    }
//
//    @Override
//    public int getItemCount() {
//        return adsList.size();
//    }
//
//    public class AdsViewHolder extends RecyclerView.ViewHolder {
//        TextView titleText, descriptionText;
//        ImageView imageView;
//
//        public AdsViewHolder(@NonNull View itemView) {
//            super(itemView);
//            titleText = itemView.findViewById(R.id.adTitle);
//            descriptionText = itemView.findViewById(R.id.adDescription);
//            imageView = itemView.findViewById(R.id.adImage);
//        }
//    }
//}
