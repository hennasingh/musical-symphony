package artist.web.musicalsymphony;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainMusicalUI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_musical_ui);

        Button playlists = (Button) findViewById(R.id.playlists);
        Button library = (Button) findViewById(R.id.library);
        Button radio = (Button) findViewById(R.id.radio);
        Button musicOnDemand = (Button) findViewById(R.id.musicDemand);
        ImageView happyFace = (ImageView)findViewById(R.id.happy_face);
        ImageView sadFace = (ImageView)findViewById(R.id.sad_face);
        ImageView loveFace=(ImageView)findViewById(R.id.love_face);
        ImageView angryFace = (ImageView)findViewById(R.id.angry_face);

        // Set a click listener on the happyFace button View
        happyFace.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlists View is clicked on.
            @Override
            public void onClick(View view) {
                Intent moodIntent = new Intent(MainMusicalUI.this, HappySongs.class);
                startActivity(moodIntent);
            }
        });

        // Set a click listener on the sadFace button View
        sadFace.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlists View is clicked on.
            @Override
            public void onClick(View view) {
                Intent moodIntent = new Intent(MainMusicalUI.this, SadSongs.class);
                startActivity(moodIntent);
            }
        });

        // Set a click listener on the loveFace button View
        loveFace.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlists View is clicked on.
            @Override
            public void onClick(View view) {
                Intent moodIntent = new Intent(MainMusicalUI.this, LoveSongs.class);
                startActivity(moodIntent);
            }
        });

        // Set a click listener on the angryFace button View
        angryFace.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlists View is clicked on.
            @Override
            public void onClick(View view) {
                Intent moodIntent = new Intent(MainMusicalUI.this, AngrySongs.class);
                startActivity(moodIntent);
            }
        });

        // Set a click listener on the playlist button View
        playlists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlists View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(MainMusicalUI.this, Playlists.class);
                startActivity(playlistIntent);
            }
        });

        // Set a click listener on the library button View
        library.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the library View is clicked on.
            @Override
            public void onClick(View view) {
                Intent libraryIntent = new Intent(MainMusicalUI.this, LibraryActivity.class);
                startActivity(libraryIntent);
            }
        });

        // Set a click listener on the radio View
        radio.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the radio View is clicked on.
            @Override
            public void onClick(View view) {
                Intent radioIntent = new Intent(MainMusicalUI.this, RadioActivity.class);
                startActivity(radioIntent);
            }
        });

        // Set a click listener on the music on Demand View
        musicOnDemand.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the music on Demand View is clicked on.
            @Override
            public void onClick(View view) {
                Intent musicDemandIntent = new Intent(MainMusicalUI.this, MusicOnDemand.class);
                startActivity(musicDemandIntent);
            }
        });
    }
}
