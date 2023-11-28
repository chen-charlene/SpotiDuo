package edu.brown.cs.student.main.server.spotify.data;

import edu.brown.cs.student.main.server.spotify.recommendationRecords.Recommendation;
import edu.brown.cs.student.main.server.spotify.searchRecords.Song;

/**
 * Class that will be used to get the needed data from the spotify API, allowing
 * our
 * server to use it accordingly.
 */
public class SpotifyData implements IData {

  /**
   * Constructor for the SpotifyData class.
   */
  public SpotifyData() {

  }

  @Override
  public Song GetSong() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'GetSong'");
  }

  @Override
  public Recommendation GetRecommendation() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'GetRecommendation'");
  }
}
