package com.example.uts;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MakananTigaActivity extends AppCompatActivity {

    private static final String TAG = "MakananTigaActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mResep = new ArrayList<>();
    private ArrayList<String> mCara = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanan);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://www.kitchentreaty.com/wp-content/uploads/2012/04/IMG_6368.jpg");
        mNames.add("Coffee Ice Cube");
        mResep.add("BAHAN :\n" +
                "2 sachet Nescafe classic\n" +
                "2 sdm gula pasir\n" +
                "200 ml air panas\n" +
                "1 kotak susu uht full cream");
        mCara.add("LANGKAH\n" +
                "- Seduh kopi dan gula dengan air panas\n" +
                "- Cetak dengan cetakan es.. masukkan freezer stelah suhu ruang\n" +
                "- Setelah keras, masukkan dlm gelas.. lalu tuang susu");

        mImageUrls.add("https://i.pinimg.com/originals/e9/c4/fd/e9c4fd0b7698f7b77b20dda0f86a5e36.jpg");
        mNames.add("Ice CIncau");
        mResep.add("BAHAN:\n" +
                "1 bungkus nutrijel cincau\n" +
                "50 gr gula pasir\n" +
                "500 ml air\n" +
                "300 ml susu cair plain\n" +
                "2 sdm whipecream bubuk\n" +
                "SKM, sesuai selera manis saya pakai 3sdm");
        mCara.add("LANGKAH:\n" +
                "- Buat cincau nutrijel, campur bubuk nutrijel dengan 50gr gula dan 500ml air. Diinginkan, potong kotak\n" +
                "- Buat kuahnya, campur susu cair, whipecream bubuk adanya kental manis, aduk rata\n" +
                "- Campur nutrijel dan kuahnya, masukkan kulkas. Nikmati dalam keadaan dingin");

        mImageUrls.add("https://asset.kompas.com/crops/-jfwZZoqb-Qge9WZ6HKk64Ui-Hg=/0x46:1000x713/750x500/data/photo/2020/04/24/5ea2b867d1c11.jpg");
        mNames.add("Es Buah");
        mResep.add("BAHAN:\n" +
                "1 buah alpukat\n" +
                "1 buah naga\n" +
                "2 sdm selasi(rendam)\n" +
                "secukupnya SKM\n" +
                "bahan kuah\n" +
                "150 gr gula pasir\n" +
                "2 gelas air\n" +
                "1 lembar daun pandan\n" +
                "bahan jely\n" +
                "1 bungkus nutrijel melon\n" +
                "50 gr gula pasir\n" +
                "3 gelas air");
        mCara.add("LANGKAH:\n" +
                "- Masak nutrijel. 3 gelas air. 50gr gula.. masak sesui petunjuk dikemasan. tuang dlm cetakan. dingin.. baru potong2. @krn ini untuk jely jadi ga begitu manis.\n" +
                "- Rebus sisa gula pasir 150gr. dengan 2 gelas air. dan pandan. masak sampi mendidih\n" +
                "- Kupas buah naga. potong2. keruk buah alpukat. dan rendam biji selaaih\n" +
                "- Dalam mangkuk tata esbatu secukupnya. buah.jely.selasih. siram gula dan susu kental manis. siap dihidangkan. mau ditambah sirup cocopandan boleh banget.");

        mImageUrls.add("https://selerasa.com/wp-content/uploads/2019/04/Resep-es-lidah-buaya.jpg");
        mNames.add("Es Lidah Buaya");
        mResep.add("BAHAN\n" +
                "250 grm lidah buaya\n" +
                "600 ml air (rebus)\n" +
                "4 sdm gula pasir (sesuai selera)\n" +
                "3 helai daun pandan\n" +
                "sesuai selera Sirup melon\n" +
                "sesuai selera Gula batu\n" +
                "biji selasih sesuai selera\n" +
                "400 ml air");
        mCara.add("LANGKAH\n" +"- Kupas kulit buaya hingga bersih, lalu potong dadu\n" +
                "- Cuci hingga lendirnya hilang (3-5 kali pencucian)\n" +
                "- Masuukkan 600 ml air ke panci lalu masukkan lidah buaya dan daun pandan, rebus hingga mendidih, lalu saring lagi lidah buaya\n" +
                "- Panaskan air 400 ml tambahakan 4 sendok makan gula + 2 helai daun pandan. Rebus hingga mendidih.\n" +
                "- Matikan kompor lalu biarkan hingga gula meresap, dan dingin\n" +
                "- Lalu masukkan sirup melon, dan air lidah buaya, tambahkan gula batu dan biji selasih");

        mImageUrls.add("https://content.jwplatform.com/thumbs/NXpZl0sj-720.jpg");
        mNames.add("Thai Tea");
        mResep.add("BAHAN\n" +
                "250 ml air\n" +
                "2 kantong Jasmine tea\n" +
                "1 sachet susu kental manis");
        mCara.add("LANGKAH\n" +"- Masak semua bahan. Siapkan es batu dalam gelas saji.\n" +
                "- Ice Thai Tea langkah memasak 1 foto\n" +
                "- Siapkan 2 gelas. Tuang dengan ketinggian yang maksimal berkali-kali hingga menghasilkan busa. Tuang ke gelas saji.");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        MakananTigaRecyclerAdapter adapter = new MakananTigaRecyclerAdapter(this, mNames, mImageUrls, mResep, mCara);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}