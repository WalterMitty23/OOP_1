public class Ravenclaw extends Hogwards {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(int magicPower, int  transgressionDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return super.toString() + ", Ум: " + intelligence + ", Мудрость: " + wisdom + ", Остроумие: " + wit + ", Творчество: " + creativity;
    }
}
