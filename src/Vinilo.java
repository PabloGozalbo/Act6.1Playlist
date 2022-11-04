public class Vinilo implements IPlayList{
    private IPlayList cancion;

    public Vinilo(IPlayList cancion){
        this.cancion = cancion;
    }
    @Override
    public void play() {
        cancion.play();
        System.out.println("ON Vinyl");
    }
}
