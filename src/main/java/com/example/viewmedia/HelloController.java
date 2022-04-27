package com.example.viewmedia;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private MediaView mediaView;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Media media=new Media("file:///C:/Users/odhis/Downloads/messi.mp4");
        MediaPlayer player=new MediaPlayer(media);
        mediaView.setMediaPlayer(player);
        player.setVolume(0);
        player.play();

    }
}