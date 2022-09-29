public class Main {
    private static Flover[] flovers = new Flover[4];


    public static void main(String[] args) {

        Human human1 = new Human("Максим", " Минск", 35, " бренд - менеджер");
        Human human2 = new Human("Аня", "Москва", 29, " методист образовательных программ");
        Human human3 = new Human("Катя", "Калининград", 28, " продакт-менеджер");
        Human human4 = new Human("Артем", "Москва", 27, " директор по развитию бизнеса");
        Human human5 = new Human("Владимир", "Казань", 27, " безработный");

        System.out.println(human1.toString());
        System.out.println(human2.toString());
        System.out.println(human3.toString());
        System.out.println(human4.toString());
        System.out.println(human5.toString());

        Flover flover1 = new Flover(" Роза обыкновенная", "", " Голландии", 35.59, 0);
        Flover flover2 = new Flover(" Хризантема", " ", " ", 15.00, 5);
        Flover flover3 = new Flover(" Пион", "", " Англии", 69.9, 1);
        Flover flover4 = new Flover(" Гипсофила", "", " Турция", 19.5, 10);
        System.out.println(flover1.toString());
        System.out.println(flover2.toString());
        System.out.println(flover3.toString());
        System.out.println(flover4.toString());

        flovers[0] = flover1;
        flovers[1] = flover2;
        flovers[2] = flover3;
        flovers[3] = flover4;
        /*sumFlovers(1, 0, 0, 0);
        isLifeSpam(0, 1, 0, 0);*/
        buyerMessage(1, 5, 6, 9);
        buyerMessage(0,1,0,0);
    }

    /*(flovers[0].getCost() + flovers[1].getCost() + flovers[2].getCost() + flovers[3].getCost())*0.1;*/
    public static double sumFlovers(int roses, int chrizantema, int pion, int gipsofila) {
        double sum = ((roses * flovers[0].getCost()) + (chrizantema * flovers[1].getCost()) +
                (pion * flovers[2].getCost()) + (gipsofila * flovers[3].getCost())) + (((roses * flovers[0].getCost()) + (chrizantema * flovers[1].getCost()) +
                (pion * flovers[2].getCost()) + (gipsofila * flovers[3].getCost())) * 0.1);
        System.out.println(" Букет состоит из "+roses+" роз обыкновенных, "+ chrizantema+" Хризантем, "+pion+" пионов, "+ gipsofila+" гипсофил"+" Стоимость букета равна - " + sum + " рублей");
        return sum;
    }

    public static void isLifeSpam(int roses, int chrizantema, int pion, int gipsofila) {
        if (pion > 0) {
            System.out.println(" срок годности букета " + flovers[2].getLifeSpam() + " день");

        } else if (pion <= 0 && roses > 0) {
            System.out.println(" срок годности букета " + flovers[0].getLifeSpam() + " дней");

        } else if (roses <= 0 && pion <= 0 && chrizantema > 0) {
            System.out.println(" срок годности букета " + flovers[1].getLifeSpam() + " дней");

        } else if (roses <= 0 && pion <= 0 && chrizantema <= 0 && gipsofila > 0) {
            System.out.println(" срок годности букета " + flovers[3].getLifeSpam() + " дней");
        }

    }

    public static void buyerMessage(int roses, int chrizantema, int pion, int gipsofila) {
        sumFlovers(roses, chrizantema, pion, gipsofila);
        isLifeSpam(roses, chrizantema, pion, gipsofila);


    }

}