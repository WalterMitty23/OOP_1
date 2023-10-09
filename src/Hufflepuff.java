public class Hufflepuff extends Hogwards{
    private final int diligence;
    private final int loyalty;
    private final int honesty;

    public Hufflepuff(int magicPower, int transgressionDistance, int diligence, int loyalty, int honesty) {
        super(magicPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return "Пуффендуй " +
                "трудолюбие=" + diligence +
                ", верность=" + loyalty +
                ", честность=" + honesty +
                ", колдовство=" + magicPower +
                ", трансгрессировать =" + transgressionDistance;
    }

    public void compare(Hufflepuff hufflepuff) {
        int sum1 = diligence + loyalty + honesty;
        int sum2 = hufflepuff.getHonesty() + hufflepuff.getLoyalty() + hufflepuff.getDiligence();

        if (sum1 > sum2) {
            System.out.println("Ученик 1 лучше ученика 2");
        } else if (sum1 < sum2) {
            System.out.println("Ученик 2 лучше ученика 1");
        } else {
            System.out.println("Ученики равны");
        }

    }


}
