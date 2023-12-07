package lesson12.Task4;

import lesson12.Task5.MusicArtist;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;

    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public List<String> getMusiciant() {
        return members;
    }

    public void setMusiciant(List<String> musiciant) {
        this.members = musiciant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static void transferMembers(MusicBand A, MusicBand B) {
        for (String musiciant : A.getMusiciant())
            B.getMusiciant().add(musiciant);
        A.getMusiciant().clear();

    }

public static void printMembers(MusicBand A){
    System.out.println(A.getMusiciant().toString());


}


    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", musiciant=" + members.toString() +
                '}';
    }
}
