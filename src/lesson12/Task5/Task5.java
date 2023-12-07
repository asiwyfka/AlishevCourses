package lesson12.Task5;


import java.util.ArrayList;
import java.util.List;

public class Task5 {

    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        MusicArtist musicArtist1 = new MusicArtist("Курт Кобейн", 1965);
        members1.add(musicArtist1);
        MusicBand musicBand1 = new MusicBand("Nirvana", 1993, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        MusicArtist musicArtist2 = new MusicArtist("Вася Пупкин", 1993);
        members2.add(musicArtist2);
        MusicBand musicBand2 = new MusicBand("Nirvana", 1993, members2);

        MusicBand.printMembers(musicBand1);
        MusicBand.printMembers(musicBand2);

        MusicBand.transferMembers(musicBand1, musicBand2);

        MusicBand.printMembers(musicBand1);
        MusicBand.printMembers(musicBand2);


    }

}
