package com.guercifzone.TifnaghX.Activities;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.guercifzone.TifnaghX.R;

public class Alphabet extends AppCompatActivity implements View.OnClickListener{
    ImageButton previous, refresh, next;
    TextView text;
    int count;
    MediaPlayer audio;
    int[] id = {R.raw.a,R.raw.b,R.raw.c,R.raw.d,R.raw.e,
            R.raw.f,R.raw.g,R.raw.h,R.raw.i,R.raw.j,
            R.raw.k,R.raw.l,R.raw.m,R.raw.n,R.raw.o,
            R.raw.p,R.raw.q,R.raw.r,R.raw.s, R.raw.t,
            R.raw.u,R.raw.v,R.raw.w,R.raw.x,R.raw.y,
            R.raw.z};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.alphabet);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        previous = findViewById(R.id.previous);
        refresh = findViewById(R.id.refresh);
        next = findViewById(R.id.next);
        text = findViewById(R.id.letter);
        audio = MediaPlayer.create(this, id[count]);
        audio.start();

        previous.setOnClickListener(this);
        refresh.setOnClickListener(this);
        next.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

    }
}