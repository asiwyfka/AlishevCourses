package lesson7;

public class Player {

    private int stamina;
    static final int MAX_STAMINA = 100;
    static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player() {
        this.stamina = (int) (Math.random() * (MAX_STAMINA - 90 + 1) + 90);
        if (countPlayers < 6)
            countPlayers++;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public int getStamina() {
        return stamina;
    }

    void run() {
        this.stamina--;
        if (this.stamina == MIN_STAMINA)
            countPlayers--;
    }

    static void info() {
        if (countPlayers < 6)
            System.out.println("Команды неполные, на поле еще есть " + (6 - countPlayers) + " свободных мест");
        else System.out.println("На поле нет свободных мест");
    }

}
