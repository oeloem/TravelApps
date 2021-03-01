package com.example.oeloem.travelapps.folder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.oeloem.travelapps.R;

public class HomeActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstantState) {
        super.onCreate(savedInstantState);
        setContentView(R.layout.home_dasboard);
        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);

        }

        Button btnwisata = (Button) findViewById(R.id.btnWisata);
        Button btnhotel = (Button) findViewById(R.id.btnHotel);
        Button btnlogin = (Button) findViewById(R.id.btnLogin);
        Button btnfeedback = (Button) findViewById(R.id.btnFeedback);
        Button btnshare = (Button) findViewById(R.id.btnSetting);
        Button btnabout = (Button) findViewById(R.id.btnAbout);

        btnwisata.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this, "Tombol Wisata", Toast.LENGTH_SHORT).show();
            }});

        btnhotel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this, "Tombol Hotel", Toast.LENGTH_SHORT).show();
            }});

        btnlogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this,"Tombol Login", Toast.LENGTH_SHORT).show();
            }});

        btnabout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this,"Tombol About", Toast.LENGTH_SHORT).show();
            }});

        btnfeedback.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this,"Tombol Feedback", Toast.LENGTH_SHORT).show();
            }});

        btnshare.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this, "Tombol Share", Toast.LENGTH_SHORT).show();
                Intent sharingIntent;
                sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");

                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Download Aplikasi Travel Apps");
                String shareMessege = "Klik Link Untuk Download Aplikasi \\n http://www.mediafire.com/download/jq1ks6e46bvm6el/TravelApps.apk";
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareMessege);
                startActivity(Intent.createChooser(sharingIntent, "Share Via"));
                }});
        }
    }

