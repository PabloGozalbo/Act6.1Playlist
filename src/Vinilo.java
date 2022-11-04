public class Vinilo extends DecoradorBase{
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
