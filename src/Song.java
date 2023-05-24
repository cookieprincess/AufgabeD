public class Song {
    String title;
    String performer;
    String composer;
    String lyricist;
    double duration;
    Album album = new Album(); //creating an object, album, since songs belong to an album
    
    /*
    String albumTitle = album.title; /*we could say that the album title of a song (example) depends on the parameter
                                      we pass onto the album constructor*/
    */
    
    public Song(String title, String performer, String composer, String lyricist, double duration,/*String albumTitle*/) {
        this.title = title;
        this.performer = performer;
        this.composer = composer;
        this.lyricist = lyricist;
        this.duration = duration;
        //this.albumTitle = albumTitle;
        
        //creating a constructor
  }
  
  
}