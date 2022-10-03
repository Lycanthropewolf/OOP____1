public class Flover {
    private String floverColor;
    private String country;
    private double cost;
    int lifeSpam;
    String name;

    public Flover(String name, String floverColor, String country, double cost, int lifeSpam) {
        this.floverColor = floverColor;
        this.country = country;
        this.cost = cost;
        this.lifeSpam = lifeSpam;
        this.name = name;
    }


    public String getFloverColor() {
        if (floverColor == null || floverColor.isEmpty() || floverColor.isBlank()) {
            floverColor = " Белый";
        } else {
            return this.floverColor = floverColor;
        }
        return floverColor;
    }

    public String getCountry() {
        if (country == null || country.isEmpty() || country.isBlank()) {
            country = " Россия";
        } else {
            this.country = country;
        }
        return country;
    }

    public double getCost() {
        if (cost <= 0) {
            cost = 1.00;
        } else {
            this.cost = cost;
        }
        return cost;
    }

    public int getLifeSpam() {
        if (lifeSpam <= 0) {
            lifeSpam = 3;
        } else {
            this.lifeSpam = lifeSpam;
        }
        return lifeSpam;
    }

    public String toString() {
        return "" + name +" из" + getCountry()+" , стоимость штуки - "+ getCost()+ " , срок стояния - "+ getLifeSpam()+" дня.";
    }
}
