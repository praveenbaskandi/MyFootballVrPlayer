package com.wordpress.httpsapplicationsfan.myfootballvrplayer.mainFirstInterface;

/**
 * Created by Praveen Baskandi on 22-12-2017.
 */

public class ModelPlayerData {
    private String playerImage;
    private String playerName;
    private String playerClub;


    public ModelPlayerData(String playerImage, String playerName, String playerClub) {
        this.playerImage = playerImage;
        this.playerName = playerName;
        this.playerClub = playerClub;
    }

    public String getPlayerImage() {
        return playerImage;
    }

    public void setPlayerImage(String playerImage) {
        this.playerImage = playerImage;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerClub() {
        return playerClub;
    }

    public void setPlayerClub(String playerClub) {
        this.playerClub = playerClub;
    }


}
