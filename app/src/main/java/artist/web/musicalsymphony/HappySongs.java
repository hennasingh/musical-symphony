package artist.web.musicalsymphony;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class HappySongs extends AppCompatActivity {

    public static final String HAPPY_SONGS="happy_Songs";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_songs);

        ImageView happyImage = (ImageView)findViewById(R.id.mood_image);
        happyImage.setImageResource(R.drawable.happy_mood);

        //getting list of songs from Json data otherwise, for now manual creating
        ArrayList<String> moodSongs = new ArrayList<>();

        moodSongs.add("Artist Name \nSong Name");
        moodSongs.add("Artist Name \nSong Name");
        moodSongs.add("Artist Name \nSong Name");
        moodSongs.add("Artist Name \nSong Name");
        moodSongs.add("Artist Name \nSong Name");
        moodSongs.add("Artist Name \nSong Name");
        moodSongs.add("Artist Name \nSong Name");
        moodSongs.add("Artist Name \nSong Name");

        ArrayAdapter<String> songsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, moodSongs);

        ListView songList = (ListView) findViewById(R.id.songs_list);

        songList.setAdapter(songsAdapter);
    }
}
