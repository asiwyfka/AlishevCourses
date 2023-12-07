package lesson12.Task3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {
        List<MusicBand> listOfMusicBands = new ArrayList<>();
        MusicBand band1 = new MusicBand("At the Drive-In", 1993);
        MusicBand band2 = new MusicBand("Nirvana", 1995);
        MusicBand band3 = new MusicBand("Кино", 1986);
        MusicBand band4 = new MusicBand("DDT", 2001);
        MusicBand band5 = new MusicBand("CCR", 1965);
        MusicBand band6 = new MusicBand("The Beatles", 1999);
        MusicBand band7 = new MusicBand("Protest the hero", 1988);
        MusicBand band8 = new MusicBand("Enter Shikari", 1956);
        MusicBand band9 = new MusicBand("Metallica", 1987);
        MusicBand band10 = new MusicBand("Rammstein", 1990);
        listOfMusicBands.add(band1);
        listOfMusicBands.add(band2);
        listOfMusicBands.add(band3);
        listOfMusicBands.add(band4);
        listOfMusicBands.add(band5);
        listOfMusicBands.add(band6);
        listOfMusicBands.add(band7);
        listOfMusicBands.add(band8);
        listOfMusicBands.add(band9);
        listOfMusicBands.add(band10);
        groupsAfter2000(listOfMusicBands);
        for (MusicBand x : listOfMusicBands)
            System.out.println(x.toString());
        for (MusicBand x : groupsAfter2000(listOfMusicBands))
            System.out.println(x.toString());
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> groupsAfter2000 = new ArrayList<>();
        for (MusicBand x : bands) {
            if (x.getYear() > 2000)
                groupsAfter2000.add(x);
        }
        return groupsAfter2000;
    }
}

