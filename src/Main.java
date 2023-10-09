public class Main {

    public static void main(String[] args) {
        Griffindor harryPotter = new Griffindor(80,  50, 90, 85, 95);
        Griffindor hermioneGranger = new Griffindor(85, 45, 95, 90, 100);
        Griffindor ronWeasley = new Griffindor(95, 55, 80, 95, 85);

        Slytherin dracoMalfoy = new Slytherin(70,70, 60, 90, 85, 95, 90);
        Slytherin grahamMontague = new Slytherin(75,75, 55, 85, 80, 90, 85);
        Slytherin gregoryGoyle = new Slytherin(70,70, 65, 80, 75, 80, 75);

        Hufflepuff zachariasSmith = new Hufflepuff(80, 50, 85, 90, 85);
        Hufflepuff cedricDiggory = new Hufflepuff(85, 45, 90, 95, 90);
        Hufflepuff justinFinchFletchley = new Hufflepuff(75, 55, 80, 85, 80);

        Ravenclaw choChang = new Ravenclaw(90, 90, 95, 90, 95, 90);
        Ravenclaw padmaPatil = new Ravenclaw(85, 45, 90, 95, 85, 80);
        Ravenclaw marcusBelby = new Ravenclaw(75, 55, 85, 80, 90, 85);

        System.out.println("Описание Гермионы Грейнджер:");
        System.out.println(hermioneGranger);
        System.out.println();
        System.out.println("Сравнение Гермионы Грейнджер и Рона Уизли:");
        hermioneGranger.compare(ronWeasley);
        System.out.println();
        System.out.println("Сравнение Драко Малфой и Чжоу Чанг:");
        dracoMalfoy.basicCompare(choChang);

    }

}