package com.example.ainaaffrina.firebasedatabasecrud;

/**
 * Created by Ainaaffrina on 30/10/2017.
 */

public class Artist {

    String artistID;
    String artistName;

    public Artist(String artistID, String artistName) {
        this.artistID = artistID;
        this.artistName = artistName;
    }

    public Artist()
    {

    }

    public String getArtistID() {
        return artistID;
    }

    public String getArtistName() {
        return artistName;
    }


}
