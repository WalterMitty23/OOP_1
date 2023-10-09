public class Griffindor extends Hogwards {
    private int nobility;
    private int honor;
    private int bravery;

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
        return super.toString() + ", Благородство : " + nobility + ", Честь: " + honor + ", Храбрость: " + bravery;
    }

    public static void compareGriffindorStudents(Griffindor student1, Griffindor student2) {
        int totalScore1 = student1.getNobility() + student1.getHonor() + student1.getBravery();
        int totalScore2 = student2.getNobility() + student2.getHonor() + student2.getBravery();

        if (totalScore1 > totalScore2) {
            System.out.println(student1 + " лучше, чем " + student2);
        } else if (totalScore1 < totalScore2) {
            System.out.println(student2 + " лучше, чем " + student1);
        } else {
            System.out.println(student1 + " и " + student2 + " равны по своим свойствам в Гриффиндоре.");
        }
    }
}



