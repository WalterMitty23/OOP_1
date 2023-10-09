public class Slytherin extends Hogwards {
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int needForPower;

    public Slytherin(int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int needForPower) {
        super(magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.needForPower = needForPower;
    }

    @Override
    public String toString() {
        return "Слизерин " +
                "хитрость=" + cunning +
                ", решительность=" + determination +
                ", амбициозность=" + ambition +
                ", находчивость=" + resourcefulness +
                ", власть=" + needForPower +
                ", колдовство=" + magicPower +
                ", трансгрессировать =" + transgressionDistance;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getNeedForPower() {
        return needForPower;
    }

    public void compare(Slytherin slytherin) {
        int sum1 = cunning + determination + ambition + resourcefulness+ needForPower;
        int sum2 = slytherin.getCunning() + slytherin.getDetermination() + slytherin.getAmbition() + slytherin.getResourcefulness() + slytherin.getNeedForPower();

        if (sum1 > sum2) {
            System.out.println("Ученик 1 лучше ученика 2");
        } else if (sum1 < sum2) {
            System.out.println("Ученик 2 лучше ученика 1");
        } else {
            System.out.println("Ученики равны");
        }
    }


}
