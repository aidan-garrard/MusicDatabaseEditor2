import java.io.FileNotFoundException;

public class TestAlbum {

    public static void main(String args[]) {
        System.out.println(System.getProperty("user.dir")); 
        try {
            Album anAlbum = new Album("Mirror Reaper", "20/10/2017", "/Users/aidangarrard/Documents/workspace/MusicDatabaseEditor/bin/images/bwitch.png");
            System.out.println(anAlbum);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }

}   