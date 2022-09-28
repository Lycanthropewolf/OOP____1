public class Main {

    public static void main(String[] args) {

        Human human1 = new Human("Максим", " Минск",  35, " бренд - менеджер");
        Human human2 = new Human("Аня", "Москва", 29," методист образовательных программ");
        Human human3 = new Human("Катя", "Калининград",  28, " продакт-менеджер");
        Human human4 = new Human("Артем", "Москва", 27," директор по развитию бизнеса");
        Human human5 = new Human("Владимир", "Казань", 27," безработный");

        System.out.println(human1.toString());
        System.out.println(human2.toString());
        System.out.println(human3.toString());
        System.out.println(human4.toString());
        System.out.println(human5.toString());

        Flover flover1= new Flover(" Роза обыкновенная", "", " Голландии", 35.59,0);
        Flover flover2= new Flover(" Хризантема", " ", " ", 15.00,5);
        Flover flover3= new Flover(" Пион", "", " Англии", 69.9,1);
        Flover flover4= new Flover(" Гипсофила", "", " Турция", 19.5,10);
        System.out.println(flover1.toString());
        System.out.println(flover2.toString());
        System.out.println(flover3.toString());
        System.out.println(flover4.toString());



    }
}