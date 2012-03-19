package player.mp3.activity;

import player.mp3.R;
import android.app.ListActivity;
import android.os.Bundle;

public class SearchLocalMp3Activity extends ListActivity
{
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.search_local_mp3);
	}
}
