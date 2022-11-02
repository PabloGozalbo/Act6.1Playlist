import java.util.ArrayList;
import java.util.List;

public class PlayList implements IPlayList{
    private List<IPlayList> canciones;
    private String nombre;

    public PlayList(String nombre){
        this.nombre=nombre;
        canciones = new ArrayList<>();
    }

    @Override
    public void play() {

        for (IPlayList song:canciones) {
            System.out.println("----"+nombre+"----");
            song.play();
        }
    }

    public void add(IPlayList song){
        canciones.add(song);
    }


}
