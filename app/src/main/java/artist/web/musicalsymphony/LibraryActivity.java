package artist.web.musicalsymphony;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);


        ImageView songView = (ImageView)findViewById(R.id.played_song);
        TextView songName = (TextView)findViewById(R.id.song_name) ;
      final String song_name= songName.getText().toString();
        TextView artistName=(TextView)findViewById(R.id.artist_name);
        final String artist_name = artistName.getText().toString();

        // Set a click listener on the Image View
        songView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Image Song View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songIntent = new Intent(LibraryActivity.this, SongPlaying.class);
                songIntent.putExtra(SongPlaying.SONG_NAME,song_name);
                songIntent.putExtra(SongPlaying.ARTIST_NAME,artist_name);
                startActivity(songIntent);
            }
        });
    }

}
