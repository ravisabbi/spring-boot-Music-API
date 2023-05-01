/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

// Write your code here
package com.example.song;

import org.springframework.web.bind.annotation.*;
import java.util.*;

import com.example.song.SongService;

@RestController
public class SongController{
    SongService songservice = new SongService();

    @GetMapping("/songs")
    public ArrayList<Song> getsongs(){
        return songservice.getSongs();
    }

    @PostMapping("/songs")
    public Song addSong(@RequestBody Song song){
        return songservice.addSong(song);
    }
    @PutMapping("/songs/{songId}")
    public Song updateSong(@PathVariable("songId") int songId, @RequestBody Song song){
        return songservice.updateSong(songId, song);

    }

    @GetMapping("/songs/{songId}")
    public Song getsong(@PathVariable("songId")int songId){
       return songservice.getSong(songId);
    }

    @DeleteMapping("/songs/{songId}")
    public void deleteSong(@PathVariable("songId") int songId){
        songservice.deleteSong(songId);
    }
} 