package artist.web.musicalsymphony;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SongPlaying extends AppCompatActivity {

    public static final String SONG_NAME ="songName";
    public static final String ARTIST_NAME ="artistName";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_playing);

        Intent song_to_play= getIntent();
        String song_name= song_to_play.getStringExtra(SONG_NAME);
        String artist_name=song_to_play.getStringExtra(ARTIST_NAME);

        TextView songPlaying = (TextView)findViewById(R.id.song_name);
        songPlaying.setText(song_name+ " - "+ artist_name);
        songPlaying.setSelected(true);
    }
}
