package app.examen.ejercicio21grupo5.tablas;

public class Video {
    private  Integer id;
    private String video;

    //contructor de clase
    public Video(Integer id, String video) {
        this.id = id;
        this.video = video;

    }
    //Segundo Constructor de clase:
    public Video(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }





}
