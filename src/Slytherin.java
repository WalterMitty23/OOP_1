public class Slytherin extends Hogwards {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;

    public Slytherin(int magicPower, int  transgressionDistance, int cunning, int determination, int ambition, int resourcefulness) {
        super(magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
    }

    @Override
    public String toString() {
        return super.toString() + ", Хитрость: " + cunning + ", Решительность: " + determination + ", Амбициозность: " + ambition + ", Находчивость: " + resourcefulness;
    }

}
