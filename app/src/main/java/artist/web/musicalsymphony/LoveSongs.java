package artist.web.musicalsymphony;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class LoveSongs extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_songs);


        ImageView loveImage = (ImageView)findViewById(R.id.mood_image);
        loveImage.setImageResource(R.drawable.love_mood);

        //getting list of songs from Json data otherwise, for now manual creating
        ArrayList<String> moodSongs = new ArrayList<String>();

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
