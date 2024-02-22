package academy.devdojo.maratonajava.javacore.Cmethodoverload.exercises.domain;

/*Create a class representing a multimedia player.
Implement overloaded methods for playing media files of
different types (e.g., audio, video) and from different sources (e.g., file path, URL).*/
public class MultiMediaPlayer {
    String fileName;
    private String typeName;
    private String source;
    private String platform;

    public void playMediaFiles(String fileName, String typeName, String source){
        this.fileName = fileName;
        this.typeName = typeName;
        this.source = source;
    }
    public void playMediaFiles(String fileName, String typeName, String source, String platform){
        this.playMediaFiles(fileName,typeName,source);
        this.platform = platform;
    }
    public void print(){
        System.out.println(this.getFileName());
        System.out.println(this.getTypeName());
        System.out.println(this.getSource());
        System.out.println(this.getPlatform());
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}
