// Write your code here
package com.example.song;
import java.util.ArrayList;
public interface SongRepository{
   ArrayList<Song> getSongs();
   Song addSong(Song song);
   Song updateSong(int songId,Song song);

   Song getSong(int songId);
   void deleteSong(int songId);
}