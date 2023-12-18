package com.example.project1442.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.project1442.Adapter.PopularListAdapter;
import com.example.project1442.Domain.PopularDomain;
import com.example.project1442.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterPupolar;
    private RecyclerView recyclerViewPupolar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerview();
        bottom_navigation();

    }

    private void bottom_navigation() {
        LinearLayout homeBtn = findViewById(R.id.homeBtn);
        LinearLayout cartBtn = findViewById(R.id.cartBtn);

        homeBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, MainActivity.class)));
        cartBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, CartActivity.class)));
    }

    private void initRecyclerview() {
        ArrayList<PopularDomain> items = new ArrayList<>();
        items.add(new PopularDomain("MacBook Pro 13 M2 Chip", "Laptop Mumpuni Di Segala Medan\n" +
                "Laptop pro Apple paling portabel kini semakin andal dengan chip M2 baru. " +
                "dan desain yang tetap ringkas. Tenaga untuk menuntaskan alur kerja berat " +
                "sepanjang hari dengan kekuatan baterai hingga 20 jam dan sistem pendingin aktif " +
                "untuk mempertahankan kinerja yang ditingkatkan.\n" +
                "MacBook Pro 13 M2 chip.", "macbook", 15, 4, 500));

        items.add(new PopularDomain("Play Station 5", "Console Game Terbaru\n" +
                "Play Station 5 (PS5) adalah konsol permainan video rumahan yang dikembangkan " +
                "oleh Sony Interactive Entertainment. PS5 diumumkan pada April 2019 dan " +
                "diluncurkan pada 12 November 2020.\n" +
                "PS5 adalah konsol pertama dengan DualSense gamepad, Tempest Audio Engine, " +
                "dan dukungan gameplay 8K. PS5 juga mendukung grafis 8K pada 60Hz dan output" +
                " 4K di kecepatan refresh 120Hz. \n", "pic2", 10, 4.5, 450));

        items.add(new PopularDomain("iPhone 12", "Handphone ter Worth It\n" +
                "Layar Super Retina XDR 6,1 inci yang begitu cerah.1 Ceramic Shield dengan " +
                "ketahanan jatuh empat kali lebih baik.2 Fotografi pencahayaan rendah yang " +
                "menakjubkan dengan mode Malam di semua kamera. Mampu merekam, mengedit, dan" +
                " memutar video sekelas sinema dengan Dolby Vision. Chip A14 Bionic yang andal." +
                " Dan aksesori MagSafe baru untuk kemudahan pemasangan dan pengisian daya nirkabel"
                , "ip12", 13, 4.2, 800));

        items.add(new PopularDomain("iPad Pro Gen 6", "iPad Pro Terbaru\n" +
                "IPad Pro. Dengan performa yang menakjubkan, konektivitas nirkabel super cepat, " +
                "dan pengalaman Apple Pencil generasi berikutnya. Ditambah, fitur produktivitas " +
                "dan kolaborasi baru yang andal di iPadOS 16. iPad Pro adalah pengalaman iPad terbaik.\n"
                , "ipad", 18, 4.4, 968));

        items.add(new PopularDomain("AirPods Pro", "AirPods Terbaru\n" +
                "AirPods Pro adalah satu-satunya headphone in-ear dengan Peredam Kebisingan Aktif " +
                "yang terus beradaptasi dengan telinga Anda dan pas dikenakan — mencegah suara luar agar " +
                "Anda dapat fokus pada apa yang sedang Anda dengarkan. Mikrofon hadap luar mendeteksi suara dari luar. "
                , "airpods", 22, 4.8, 271));

        items.add(new PopularDomain("iPhone 15 Pro Max", "iPhone Terbaru Sekarang\n" +
                "iPhone 15 Pro Max. Lahir dari titanium dan dilengkapi chip A17 Pro terobosan," +
                "tombol Tindakan yang dapat disesuaikan, dan sistem kamera iPhone paling andal yang pernah ada.\n"
                , "ip15", 32, 4.7, 1614));

        recyclerViewPupolar = findViewById(R.id.view1);
        recyclerViewPupolar.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        adapterPupolar = new PopularListAdapter(items);
        recyclerViewPupolar.setAdapter(adapterPupolar);
    }
}