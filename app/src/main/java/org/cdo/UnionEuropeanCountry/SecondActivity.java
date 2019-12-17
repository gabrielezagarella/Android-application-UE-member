package org.cdo.UnionEuropeanCountry;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView nameCountry, surface, population;
    private ImageView flagShape;
    private Country country;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_second );

        Intent intent = getIntent();
        this.country = (Country) intent.getSerializableExtra("object");
        this.nameCountry = findViewById(R.id.nameCountry);
        this.nameCountry.setText(country.getNameCountry());
        this.surface = findViewById(R.id.surface);
        this.surface.setText(country.getSurface());
        this.population = findViewById(R.id.population);
        this.population.setText(country.getPopulation());
        this.flagShape = findViewById(R.id.flagShape);
        this.flagShape.setImageResource(country.getFlagShape());

        final MediaPlayer sound_one = MediaPlayer.create(this, R.raw.inno);
              sound_one.start();
    }

}






