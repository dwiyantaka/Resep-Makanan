package com.example.wildanifqie.resepmakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Resep> dataResep;
    RecyclerView listResep;
    ResepAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateData();
        listResep = (RecyclerView) findViewById(R.id.list_resep);
        adapter = new ResepAdapter(this, dataResep);
        listResep.setAdapter(adapter);
        listResep.setLayoutManager(new LinearLayoutManager(this));
        listResep.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }

    private void generateData() {
        dataResep = new ArrayList<>();
        //1
        dataResep.add(new Resep("Perkedel Tempe",
                "Bosan dengan tempe goreng? Jangan bosan dulu karena Anda dapat mengolah tempe menjadi perkedel. Rasa perkedel tempe ini lembut, pedas dan pastinya sangat nikmat. Kencur yang dicampurkan bersama adonan pekedel tempe ini juga memberikan rasa harum yang khas. Sangat menggoda selera makan Anda.",
                "Bahan-bahan\n\n" +
                        "Bahan:\n" +
                        "300 gram tempe\n" +
                        "2 sdm tepung sagu\n" +
                        "1 putih telur\n" +
                        "3 lembar daun jeruk, iris halus\n" +
                        "minyak secukupnya, untuk menggoreng\n\n" +
                        "Bumbu yng dihaluskan:\n" +
                        "3 buah cabai merah\n" +
                        "7 buah cabai rawit merah\n" +
                        "5 butir bawang merah\n" +
                        "2 siung bawang putih\n" +
                        "2 cm kencur\n" +
                        "1 sdt terasi matang\n" +
                        "½ sdt garam\n" +
                        "¼ sdt merica bubuk\n" +
                        "1 sdt gula pasir\n\n" +
                        "Cara membuat\n" +
                        "Haluskan tempe dengan tepung sagu, putih telur, irisan daun jeruk, dan bumbu yang dihaluskan. Aduk rata.\n" +
                        "Ambil sesendok makan, bentuk bulat lonjong.\n" +
                        "Panaskan minyak, goreng hingga matang dan berwarna kecokelatan. Angkat dan tiriskan.\n" +
                        "Sajikan hangat.",
                R.drawable.perkedeltempe));
        dataResep.add(new Resep("Orek Tempe",
                "Memasak hidangan ini tidak membutuhkan banyak waktu. Dengan kepraktisannya, resep orek tempe ini sangat cocok bagi anda yang tidak ingin berlama-lama di dapur pada dini hari. Tidak lebih dari 30 menit masakan Anda akan siap dihidangkan.",
                "Bahan-bahan\n" +
                        "500 gram tempe, potong dadu, goreng ½ matang\n" +
                        "150 gram udang segar ukuran kecil, buang kepalanya, cuci bersih\n" +
                        "4 buah cabai hijau, iris serong\n" +
                        "4 buah cabai merah, iris serong\n" +
                        "2 siung bawang putih, iris tipis\n" +
                        "4 butir bawang merah, iris tipis\n" +
                        "2 cm lengkuas\n" +
                        "2 lembar daun salam\n" +
                        "1 sdm kecap manis\n" +
                        "1 sdt garam\n" +
                        "½ sdt terasi\n" +
                        "50 ml air\n" +
                        "2 sdm minyak untuk menumis\n\n" +
                        "Cara membuat\n" +
                        "Panaskan minyak goreng, tumis semua bumbu iris hingga layu, masukkan udang, tumis terus hingga keluar aroma harum.\n" +
                        "Masukkan tempe yang sudah digoreng, tambahkan kecap manis dan air. Masak dalam api kecil hingga kecap meresap ke dalam tempe.\n" +
                        "Sajikan hangat.",
                R.drawable.orektempe));
        dataResep.add(new Resep("Tempe Tumis Kecap",
                "Olahan tempe yang paling sederhana dan sangat mudah tapi juga lezat adalah resep Tempe Tumis Kecap berikut ini, karena tempe hanya dipotong-potong lalu digoreng kemudian ditumis bersama bawang merah, bawang putih, cabai dan terakhir diberi kecap.\n",
                "Bahan-bahan\n" +
                        "1 bungkus tempe dipotong dadu (1 cm x 1 cm)\n" +
                        "5 siung bawang merah diiris halus\n" +
                        "2 siung bawang putih diiris halus\n" +
                        "3 buah cabai hijau dipotong-potong sepanjang 1 cm\n" +
                        "1 batang daun bawang\n" +
                        "Garam secukupnya\n" +
                        "4 sendok makan kecap manis\n" +
                        "Penyedap rasa secukupnya\n" +
                        "Minyak goreng untuk menumis\n\n" +
                        "Cara membuat\n" +
                        "Siapkan bumbu tumis (bawang merah, bawang putih, cabai hijau, daun salam dan lengkuas).\n" +
                        "Tumis bawang merah dan bawang putih hingga harum, masukkan cabai hijau.\n" +
                        "Kemudian daun bawang.\n" +
                        "Masukkan potongan tempe, tumis hingga kecokelatan.\n" +
                        "Tuangkan kecap manis\n" +
                        "Buuhkan garam dan penyedap rasa.\n" +
                        "Angkat bila sudah matang.",
                R.drawable.tempetumiskecap));
        dataResep.add(new Resep("Tempe Burger",
                "Tempe Burger ini bisa dijadikan salah satu varian menu sehat bagi orang-orang tersayang Anda, karena daging juga diolah bersama tempe yang kemudian dihaluskan lalu dijadikan burger. Soal rasa pun tidak akan kalah saing dengan burger asli dari luar negeri.",
                "Bahan-bahan\n" +
                        "300 gram tempe, kukus 15 menit, sedikit dihaluskan\n" +
                        "1 siung bawang Bombay, cincang\n" +
                        "100 gram daging cincang, sangrai sampai air daging habis\n" +
                        "1 siung bawang putih, cincang\n" +
                        "1 batang daun bawang, iris tipis bagian yang putih\n" +
                        "1 sendok makan seledri cincang\n" +
                        "1 butir telur, pisahkan\n" +
                        "1 sendok makan kecap manis\n" +
                        "1 sendok the merica bubuk\n" +
                        "1 sendok the garam\n" +
                        "¼ sendok the pala bubuk\n" +
                        "2 sendok makan margarin untuk menggoreng\n\n" +
                        "Cara membuat\n" +
                        "Tumis bawang putih sampai harum, masukkan bawang Bombay dan daun bawang, aduk sampai layu, angkat.\n" +
                        "Campur dan aduk semua bahan kecuali putih telur.\n" +
                        "Adonan dibentuk bulat dengan garis tengah 7 cm. Lumuri seluruh permukaannya dengan putih telur.\n" +
                        "Goreng dengan margarin sampai kecokelatan. Selipkan diantara roti dengan diberi daun salada dan saus tomat. Hidangkan panas.",
                R.drawable.tempeburger));
    }
}
