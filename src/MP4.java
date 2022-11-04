public class MP4 extends DecoradorBase{
    private IPlayList cancion;

    public MP4(IPlayList cancion){
        this.cancion = cancion;
    }
    @Override
    public void play() {
        cancion.play();
        System.out.println("ON MP4");
    }
}
