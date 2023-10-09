public class Ravenclaw extends Hogwards {
    private final int intelligence;
    private final int wisdom;
    private final int wit;
    private final int creativity;

    public Ravenclaw(int magicPower, int transgressionDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return "Когтевран " +
                "ум=" + intelligence +
                ", мудрость=" + wisdom +
                ", остроумие=" + wit +
                ", креативность=" + creativity +
                ", колдовство=" + magicPower +
                ", трансгрессировать =" + transgressionDistance;
    }

    public void compare(Ravenclaw ravenclaw) {
        int sum1 = intelligence + wisdom + wit + creativity;
        int sum2 = ravenclaw.getIntelligence() + ravenclaw.getWisdom() + ravenclaw.getWit() + ravenclaw.getCreativity();

        if (sum1 > sum2) {
            System.out.println("Ученик 1 лучше ученика 2");
        } else if (sum1 < sum2) {
            System.out.println("Ученик 2 лучше ученика 1");
        } else {
            System.out.println("Ученики равны");
        }
    }

}
