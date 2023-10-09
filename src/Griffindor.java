public class Griffindor extends Hogwards {
    private final int nobility;
    private final int honor;
    private final int bravery;

    public Griffindor(int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return "Гриффиндор " +
                "благородство=" + nobility +
                ", честь =" + honor +
                ", храбрость=" + bravery +
                ", колдовство=" + magicPower +
                ", трансгрессировать =" + transgressionDistance;
    }

    public void compare(Griffindor griffindor) {
        int sum1 = nobility + honor + bravery;
        int sum2 = griffindor.getNobility() + griffindor.getHonor() + griffindor.getBravery();

        if (sum1 > sum2) {
            System.out.println("Ученик 1 лучше ученика 2");
        } else if (sum1 < sum2) {
            System.out.println("Ученик 2 лучше ученика 1");
        } else {
            System.out.println("Ученики равны");
        }

    }

}



