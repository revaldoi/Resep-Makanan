package com.example.uts;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MakananDuaActivity extends AppCompatActivity {

    private static final String TAG = "MakananDuaActivity";

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

        mImageUrls.add("https://www.theflavorbender.com/wp-content/uploads/2019/01/Easy-Chicken-Ramen-Featured-500x375.jpg");
        mNames.add("Mie Ramen");
        mResep.add("BAHAN :\n" +
                "Mie (kalau bisa pakai mie basah agar tekstur nya lebih bagus)\n" +
                "1/2 sdm kaldu (bebas kalau bisa dashi/kaldu ikan, me : ayam)\n" +
                "secukupnya Garam\n" +
                "Gula pasir secukupnya (optional)\n" +
                "sejumput Lada bubuk\n" +
                "Bubuk bawang putih (me : bawang cincang)\n" +
                "1 sdt minyak wijen\n" +
                "1 sdt kecap asin\n" +
                "Cabai bubuk (optional)\n" +
                "sesuai selera Bon nori\n" +
                "Bahan toping\n" +
                "Telur rebus\n" +
                "Pak choy rebus\n" +
                "Nori\n" +
                "Bawang bombai tumis/panggang\n" +
                "Biji wijen (optional)");
        mCara.add("LANGKAH\n" +
                "- Cacah bawang putih, lalu tumis sebentar hingga harum.\n" +
                "- Rebus mie lalu tata dimangkuk.\n" +
                "- Masukan air dan semua bahan ke tumisan bawang putih tadi kecuali bahan toping. Aduk rata lalu masak hingga mendidih.\n" +
                "- Siramkan kuah ke mie dan tata toping.\n" +
                "- Selesai ");

        mImageUrls.add("https://www.recipetineats.com/wp-content/uploads/2020/05/Pepperoni-Pizza_5-SQjpg.jpg");
        mNames.add("Pizza");
        mResep.add("BAHAN:\n" +
                "400 gr Tepung terigu tinggi protein\n" +
                "Susu bubuk 1 sachet (saya pakai dancow)\n" +
                "250 ml Air\n" +
                "2 butir Kuning telur\n" +
                "Pengembang (saya pakai fermipan)\n" +
                "1 sdt Garam\n" +
                "Gula 2 sdm peres");
        mCara.add("LANGKAH:\n" +
                "- Air,susu bubuk,fermipan,dan telur di aduk jdi 1 (sisihkan)\n" +
                "- Tepung dan garam aduk rata stlah trcmpur rata msukan campuran air susu tdi.\n" +
                "- Uleni smpai kalis. Diamkan / profing selama 60 menit\n" +
                "- Setelah itu adonan di bagi sesuai selera mau sebesar apa ukuran pizzanya,pipihkan bentul bulat atau sesuai selera. Kemudian berikan toping sesuai selera jg.\n" +
                "- Kemudian diamkan/profing kembali selama 30 menit. Lalu panggang selama 25 mnit di dalam oven dengan api kecil. Matang.. dan sajikan selagi hangat\n");

        mImageUrls.add("https://food.fnr.sndimg.com/content/dam/images/food/fullset/2010/4/13/0/GC_alton-brown-french-toast_s4x3.jpg.rend.hgtvcom.826.620.suffix/1382539328476.jpeg");
        mNames.add("French Toast");
        mResep.add("BAHAN:\n" +
                "5 lbr Roti Tawar\n" +
                "1 sdm Butter\n" +
                "Bahan Pelapis;\n" +
                "1 btr Telur\n" +
                "60 ml Susu Cair\n" +
                "1 sdt Gula Pasir halus\n" +
                "1/4 sdt Kayu Manis bubuk\n" +
                "1/4 sdt Vanili bubuk");
        mCara.add("Panaskan pan dengan api kecil saja,olesi sedikit butter lalu Campur semua bahan pelapis sampai rata lalu ambil selembar roti,celupkan ke pelapis lalu panggang di pan sampai kedua sisinya kecoklatan,lakukan hal yang sama sampai selesai");

        mImageUrls.add("https://cdns.klimg.com/dream.co.id/resized/640x480/news/2019/07/24/113116/resep-kebab-turki-mudah-dan-otentik-190724k.jpg");
        mNames.add("Kebab");
        mResep.add("BAHAN\n" +
                "200 gr tepung protein sedang\n" +
                "10 gr susu bubuk\n" +
                "1/2 sdt baking powder/Baking soda\n" +
                "1/2 sdt garam\n" +
                "40 ml minyak goreng\n" +
                "120 ml air hangat\n" +
                "Isian :\n" +
                "Tuna (saya tuna dibakar ambil dagingnya)\n" +
                "secukupnya Jagung manis yg sudah direbus/kukus\n" +
                "Mayonaise\n" +
                "Selada, iris2\n" +
                "1 Bawang putih\n" +
                "1/2 buah Bawang bombay, iris memanjang");
        mCara.add("LANGKAH\n" +"Campurkan smua bahan aduk rata bila masih terasa lengket bisa ditambah tepung sedikit\n" +
                "Bagi adonan sesuai dgn ukuran teflon (43gr)\n" +
                "Gilas adonan sampai pipih bentuk bulat, bakar menggunakan teflon tanpa menggunakan minyak\n" +
                "Bahan isian : Tumis bawang putih, bawang bombay masukkan ikan tuna yg sudah disuir, aduk rata kasih jagung tambahkan garam penyedap rasa, angkat simpan dipiring campur mayonaise aduk rata, koreksi rasa\n" +
                "Isi kebab dgn isian tambah irisan selada, saos tomat, saos sambel, lipat... bisa langsung di nikmati tanpa di panggang lagi");

        mImageUrls.add("https://images.unsplash.com/photo-1582254465498-6bc70419b607?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=750&q=80");
        mNames.add("Hot Dog");
        mResep.add("BAHAN\n" +
                "1/2 ekor ayam, dibuat kaldu +- 2 gelas lalu suwir2 dagingnya\n" +
                "1/4 kubis\n" +
                "1/2 bungkus mie telur\n" +
                "1/2 tomat merah\n" +
                "sesuai selera Daun bawang\n" +
                "6 siung bawang putih\n" +
                "2 telur\n" +
                "Cabe rawit hijau\n" +
                "Garam");
        mCara.add("LANGKAH\n" +"Potong2 bawang putih, tumis sampai harum dan kecoklatan\n" +
                "Masukkan telur, aduk hingga tercampur bawang dan matang\n" +
                "Tuang kaldu ayam lalu masukkan mie\n" +
                "Setelah mie setengah matang tambahkan air, garam lalu masukkan kubis dan ayam suwir\n" +
                "Masukkan cabe rawit utuh, daun bawang dan potongan tomat");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        MakananDuaRecyclerAdapter adapter = new MakananDuaRecyclerAdapter(this, mNames, mImageUrls, mResep, mCara);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}