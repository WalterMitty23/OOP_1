public class Hufflepuff extends Hogwards{
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(int magicPower, int transgressionDistance, int diligence, int loyalty, int honesty) {
        super(magicPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString() + ", Трудолюбие: " + diligence + ", Верность: " + loyalty + ", Честность: " + honesty;
    }
}
