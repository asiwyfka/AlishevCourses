package lesson12.Task5;

public class MusicArtist {

    private String nameOfArtist;
    private int yearBirth;

    public MusicArtist(String name, int yearBirth) {
        this.nameOfArtist = name;
        this.yearBirth = yearBirth;
    }

    public String getName() {
        return nameOfArtist;
    }

    public void setName(String name) {
        this.nameOfArtist = name;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    @Override
    public String toString() {
        return "MusicArtist{" +
                "name='" + nameOfArtist + '\'' +
                ", yearBirth=" + yearBirth +
                '}';
    }
}
