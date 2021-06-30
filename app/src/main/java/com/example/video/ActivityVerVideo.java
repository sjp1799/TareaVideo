package com.example.video;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class ActivityVerVideo extends AppCompatActivity {


    private VideoView videoView2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_video);

        videoView2 =(VideoView)findViewById(R.id.videoView2);

        Uri videoUri = Uri.parse(getIntent().getExtras().getString("videoUri"));
        videoView2.setVideoURI(videoUri);
        videoView2.start();


    }
}