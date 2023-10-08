public class Main {

    public static void main(String[] args) {
        Griffindor harryPotter = new Griffindor(80, 50, 90, 85, 95);
        Griffindor hermioneGranger = new Griffindor(85, 45, 95, 90, 100);
        Griffindor ronWeasley = new Griffindor(95, 55, 80, 95, 85);

        Slytherin dracoMalfoy = new Slytherin(70, 60, 90, 85, 95, 90);
        Slytherin grahamMontague = new Slytherin(75, 55, 85, 80, 90, 85);
        Slytherin gregoryGoyle = new Slytherin(70, 65, 80, 75, 80, 75);

        Hufflepuff zachariasSmith = new Hufflepuff(80, 50, 85, 90, 85);
        Hufflepuff cedricDiggory = new Hufflepuff(85, 45, 90, 95, 90);
        Hufflepuff justinFinchFletchley = new Hufflepuff(75, 55, 80, 85, 80);

        Ravenclaw choChang = new Ravenclaw(80, 50, 95, 90, 95, 90);
        Ravenclaw padmaPatil = new Ravenclaw(85, 45, 90, 95, 85, 80);
        Ravenclaw marcusBelby = new Ravenclaw(75, 55, 85, 80, 90, 85);

        System.out.println("Описание Гермионы Грейнджер:");
        System.out.println(hermioneGranger);

        System.out.println("Сравнение Гермионы Грейнджер и Рона Уизли:");
        compareStudents(hermioneGranger, ronWeasley);

        System.out.println("Сравнение Драко Малфой и Грэхэма Монтегю:");
        compareStudents(dracoMalfoy, grahamMontague);
    }
    public static void compareStudents(Hogwards student1, Hogwards student2) {
        int totalScore1 = student1.getMagicPower() + student1.getTransgressionDistance();
        int totalScore2 = student2.getMagicPower() + student2.getTransgressionDistance();

        if (totalScore1 > totalScore2) {
            System.out.println(student1 + " лучше, чем " + student2);
        } else if (totalScore1 < totalScore2) {
            System.out.println(student2 + " лучше, чем " + student1);
        } else {
            System.out.println(student1 + " и " + student2 + " равны по магической мощности и расстоянию трансгрессии.");
        }
    }
}