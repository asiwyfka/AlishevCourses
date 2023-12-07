package lesson12.Task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Task4 {
    public static void main(String[] args) {

        List<String> members1 = new ArrayList<>();
        members1.add("Курт Кобейн");
        MusicBand musicBand1 = new MusicBand("Nirvana", 1993, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("Вася Пупкин");
        MusicBand musicBand2 = new MusicBand("ГDK", 2010, members2);

        MusicBand.printMembers(musicBand1);
        MusicBand.printMembers(musicBand2);

        MusicBand.transferMembers(musicBand1,musicBand2);


        MusicBand.printMembers(musicBand1);
        MusicBand.printMembers(musicBand2);
    }

}
