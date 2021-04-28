package edu.wctc.isp;
import java.time.Duration;

public interface Album extends Product{
    Duration getPlayingTime();
    String getArtist();
}
