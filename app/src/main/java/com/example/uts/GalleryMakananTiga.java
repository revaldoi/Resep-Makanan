package com.example.uts;


import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class GalleryMakananTiga extends AppCompatActivity{

    private static final String TAG = "GalleryMakananTiga";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_makanan);
        Log.d(TAG, "onCreate: started.");

        getIncomingIntent();
    }

    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");

        if(getIntent().hasExtra("image_url") && getIntent().hasExtra("image_name")){
            Log.d(TAG, "getIncomingIntent: found intent extras.");

            String imageUrl = getIntent().getStringExtra("image_url");
            String imageName = getIntent().getStringExtra("image_name");
            String resepText = getIntent().getStringExtra("resep_");
            String caraText = getIntent().getStringExtra("cara");

            setImage(imageUrl, imageName, resepText, caraText);
        }
    }


    private void setImage(String imageUrl, String imageName, String resepText, String caraText){
        Log.d(TAG, "setImage: setting te image and name to widgets.");

        TextView name = findViewById(R.id.image_description);
        name.setText(imageName);

        TextView resp = findViewById(R.id.resep_nya);
        resp.setText(resepText);

        TextView caraa = findViewById(R.id.cara_nya);
        caraa.setText(caraText);

        ImageView image = findViewById(R.id.image);
        Glide.with(this)
                .asBitmap()
                .load(imageUrl)
                .into(image);
    }



}

