package com.guercifzone.TifnaghX;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.guercifzone.TifnaghX.Activities.Alphabet;
import com.guercifzone.TifnaghX.Activities.Game1;
import com.guercifzone.TifnaghX.Activities.Game2;
import com.guercifzone.TifnaghX.Activities.Rhytem;

import org.w3c.dom.Text;

public class Home extends AppCompatActivity {
    Button alphabet, game1, game2, rhyme;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.home);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        alphabet = findViewById(R.id.alphabet);
        game1 = findViewById(R.id.game1);
        game2 = findViewById(R.id.game2);
        rhyme = findViewById(R.id.rhyme);
       textView = findViewById(R.id.contactus);
        alphabet.setOnClickListener(v -> {
            if (alphabet.getId() == R.id.alphabet) {
                Intent intent = new Intent(Home.this, Alphabet.class);
                startActivity(intent);
            }
            else {
                Toast.makeText(this, "ⵟⵀⵉⵙ ⵛⵓⵏⵜⵏⵜ ⵉⵙ ⵏⵓⵜ ⴰⴹⴰⵉⵍⴰⴱⵍ", Toast.LENGTH_SHORT).show();
            }
        });
        game1.setOnClickListener(v -> {
            if (game1.getId() == R.id.game1) {
                Intent intent = new Intent(Home.this, Game1.class);
                startActivity(intent);
            }
            else {
                Toast.makeText(this, "ⵟⵀⵉⵙ ⵛⵓⵏⵜⵏⵜ ⵉⵙ ⵏⵓⵜ ⴰⴹⴰⵉⵍⴰⴱⵍ", Toast.LENGTH_SHORT).show();
            }
        });
        game2.setOnClickListener(v -> {
            if (game2.getId() == R.id.game2) {
                Intent intent = new Intent(Home.this, Game2.class);
                startActivity(intent);
            }
            else {
                Toast.makeText(this, "ⵟⵀⵉⵙ ⵛⵓⵏⵜⵏⵜ ⵉⵙ ⵏⵓⵜ ⴰⴹⴰⵉⵍⴰⴱⵍ", Toast.LENGTH_SHORT).show();
            }
        });
        rhyme.setOnClickListener(v -> {
            if (rhyme.getId() == R.id.rhyme) {
                Intent intent = new Intent(Home.this, Rhytem.class);
                startActivity(intent);
            }
            else {
                Toast.makeText(this, "ⵟⵀⵉⵙ ⵛⵓⵏⵜⵏⵜ ⵉⵙ ⵏⵓⵜ ⴰⴹⴰⵉⵍⴰⴱⵍ", Toast.LENGTH_SHORT).show();
            }
        });
        textView.setOnClickListener(v ->{
    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/@sadikdev"));
    startActivity(intent);
});
    }
}