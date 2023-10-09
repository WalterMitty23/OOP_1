public class Hogwards {
    protected final int magicPower;
    protected final int transgressionDistance;


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

    private int getBasicSkills() {
        return magicPower + transgressionDistance;
    }

    public void basicCompare(Hogwards hogwards) {
        int basicSkills1 = getBasicSkills();
        int basicSkills2 = hogwards.getBasicSkills();

        if (basicSkills1 > basicSkills2) {
            System.out.println("Ученик 1 лучше ученика 2");
        } else if (basicSkills1 < basicSkills2) {
            System.out.println("Ученик 2 лучше ученика 1");
        } else {
            System.out.println("Ученики равны");
        }
    }


}



