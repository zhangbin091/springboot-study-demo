package day1;

/**
 * @Classname Knight
 * @Description TODO
 * @Date 2021/1/19 23:47
 * @Created by 张斌
 */
public class Knight {

    private  String name;
    private Horse horse;

    public Knight(String name,Horse horse) {
        this.horse = horse;
        this.name = name;
        System.out.println("init Knight,horse name is "+horse.getName()+",Knight name is "+name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Horse getHorse() {
        return horse;
    }

    public void setHorse(Horse horse) {
        this.horse = horse;
    }

    @Override
    public String toString() {
        return "Knight{" +
                "name='" + name + '\'' +
                ", horse=" + horse +
                '}';
    }
}
