package ex1;

public class Singers {
    private int singerId;
    private String singerName;
    private String singerAddress;
    private String dateOfBirth;
    private int albumsPublished;

    public Singers() {
    }

    public Singers(int singerId, String singerName, String singerAddress,
                   String dateOfBirth, int albumsPublished) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = dateOfBirth;
        this.albumsPublished = albumsPublished;
    }

    public void setAll(int singerId, String singerName, String singerAddress,
                       String dateOfBirth, int albumsPublished) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = dateOfBirth;
        this.albumsPublished = albumsPublished;
    }

    public void setSingerId(int singerId) { this.singerId = singerId; }
    public void setSingerName(String singerName) { this.singerName = singerName; }
    public void setSingerAddress(String singerAddress) { this.singerAddress = singerAddress; }
    public void setDateOfBirth(String dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    public void setAlbumsPublished(int albumsPublished) { this.albumsPublished = albumsPublished; }

    public int getSingerId() { return singerId; }
    public String getSingerName() { return singerName; }
    public String getSingerAddress() { return singerAddress; }
    public String getDateOfBirth() { return dateOfBirth; }
    public int getAlbumsPublished() { return albumsPublished; }
}
