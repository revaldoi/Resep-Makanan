package com.example.uts;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MakananActivity extends AppCompatActivity {

    private static final String TAG = "MakananActivity";

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

        mImageUrls.add("https://asset.kompas.com/crops/B_DV5V6k-8yyl8Z9daS3hb6E3_M=/0x0:739x493/750x500/data/photo/2020/07/28/5f1fdcdacafc4.jpg");
        mNames.add("Sate Ayam");
        mResep.add("BAHAN :\n" +
                "1/2 ekor ayam dada fillet\n" +
                "1 buah jeruk nipis\n" +
                "3 Sdm kecap manis\n" +
                "secukupnya Merica dan garam\n\n" +
                "Bumbu saos kacang :\n" +
                "250 gr kacang tanah\n" +
                "5 siung bawang putih\n" +
                "5 siung bawang merah\n" +
                "4 cabe rawit merah / sesuai selera\n" +
                "1 buah cabai merah besar/ sesuai selera\n" +
                "1 butir kemiri\n" +
                "3 Sdm gula merah iris\n" +
                "secukupnya Garam dan penyedap\n" +
                "300 ml Air putih\n\n" +
                "Bahan olesan ayam :\n" +
                "3 Sdm bumbu saos kacang\n" +
                "3 Sdm minyak / margarin\n" +
                "2 Sdm kecap manis/ sesuai selera");
        mCara.add("LANGKAH\n" +
                "Potong dadu ayam, kemudian cuci dan bersihkan\n" +
                "Campurkan bahan marinade ke ayam dan diamkan selama 1 jam di lemari pendingin (kalau lagi buru\" paginya boleh disiapkan malamnya ya Bun, karena berpengaruh sama rasa sate nantinya)\n" +
                "Goreng kacang sebentar jangan sampai gosong, setelah itu goreng bawang merah, bawang putih, cabe rawit merah, cabe merah besar, dan kemiri sampai harum kemudian angkat\n" +
                "Haluskan bumbu saos yg sudah di goreng, kemudian tambahkan kacang yang sudah di goreng, garam, gula merah, dan penyedap secukupnya/ sesuai selera\n" +
                "Siapkan ayam yang sudah di marinade tadi dan oleskan bahan olesan ayam kemudian panggang\n" +
                "Kemudian angkat dan siram dengan saos kacang, boleh ditambahkan bawang goreng/ potongan bawang merah mentah / potongan cabe rawit dan kecap diatasnya agar rasanya lebih nikmat\n" +
                "Sate Ayam Madura siap disajikan dengan nasi hangat ataupun lontong");

        mImageUrls.add("https://img-global.cpcdn.com/recipes/9fb464bf7729a32a/751x532cq70/gulai-kambing-foto-resep-utama.jpg");
        mNames.add("Gulai Kambing");
        mResep.add("BAHAN:\n" +
                "500 gram iga kambing\n" +
                "250 gram jeroan kikil sandung lamur\n" +
                "2 batang serai\n" +
                "2 lembar daun salam\n" +
                "2 bks santan kental instan\n" +
                "secukupnya air matang\n" +
                "secukupnya garam, gula dan penyedap\n" +
                "bumbu halus :\n" +
                "12 butir bawang merah\n" +
                "8 butir bawang putih\n" +
                "6 butir kemiri\n" +
                "4 buah cabe merah besar\n" +
                "1 ruas kunyit\n" +
                "1 ruas jahe\n" +
                "1 sdt jinten");
        mCara.add("LANGKAH:\n" +
                "- Siapkan panci, didihkan air, masukkan iga kambing, rebus sampai empuk, untuk jeroan rebus terpisah, setelah empuk tiriskan dan potong kecil kecil, masukkan ke dalam rebusan iga\n" +
                "- Haluskan bumbu\n" +
                "- Tumis bumbu halus hingga harum kemudian masukkan bumbu daun, tumis sampai benar benar matang\n" +
                "- Tuang tumisan bumbu ke dalam rebusan iga aduk rata\n" +
                "- Tambahkan garam, gula dan penyedap\n" +
                "- Tuang santan, masak sampai bumbu meresap\n");

        mImageUrls.add("https://img-global.cpcdn.com/recipes/d479f15b2f017d5f/751x532cq70/nasi-goreng-kampung-foto-resep-utama.jpg");
        mNames.add("Nasi Goreng");
        mResep.add("BAHAN:\n" +
                "450 gr nasi putih\n" +
                "3 butir telur(sy pake 2)\n" +
                "3 siung bawang merah,iris\n" +
                "3 siung bawang putih,iris\n" +
                "5 buah cabe rawit\n" +
                "Secukupnya kaldu bubuk\n" +
                "Secukupnya garam");
        mCara.add("450 gr nasi putih\n" +
                "Tumis duo bawang dan cabe hingga layu dan harum\n" +
                "Masukkan telur,orak2 hingga telur kering.tambahkan garam dan juga kaldu bubuk\n" +
                "Masukkan nasi,aduk2 hingga smua bumbu tercampur rata.sambil koreksi rasa ya..jika sudah pas,sajikan bersama telur ceplok dan lalapan");

        mImageUrls.add("https://www.masakapahariini.com/wp-content/uploads/2019/02/mie-rebus-jawa-780x440.jpg");
        mNames.add("Bakmi Jawa");
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

        mImageUrls.add("https://images.unsplash.com/photo-1582254465498-6bc70419b607?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=750&q=80");
        mNames.add("Bakmi Jawa");
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
        MakananRecyclerAdapter adapter = new MakananRecyclerAdapter(this, mNames, mImageUrls, mResep, mCara);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}