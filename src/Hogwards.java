public class Hogwards {
    private int magicPower;
    private int transgressionDistance;

    public Hogwards(int magicPower, int transgressionDistance) {
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int  getTransgressionDistance() {
        return transgressionDistance;
    }

    @Override
    public String toString() {
        return "Сила магии: " + magicPower + ", Расстояние трансгрессии: " + transgressionDistance;
    }




}



