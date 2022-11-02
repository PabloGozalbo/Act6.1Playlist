public class Song implements IPlayList{
    private String nombre;
    private String autor;

    public Song(String nombre, String autor){
        this.nombre=nombre;
        this.autor=autor;
    }

    @Override
    public void play() {
        System.out.println("Escuchando..." + nombre + " BY " + autor);
    }
}
