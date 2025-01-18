package CONCEPTS;

public class Singleton {
  public void driver(){
      Video v1 = new Video();

      v1.setLikes(100);
      v1.setTitle("MY First Vlog");
      v1.setTotalVideo(10);
      v1.setVideoId(2728);
      v1.getVideoId();
      v1.getTitle();
      v1.getLikes();
      v1.getTotalVideo();

  }
}

class Video{
    private int videoId;
    private String title;
    private int likes , totalVideo;

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getTotalVideo() {
        return totalVideo;
    }

    public void setTotalVideo(int totalVideo) {
        this.totalVideo = totalVideo;
    }
}
