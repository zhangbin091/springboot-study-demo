package day1;

/**
 * @Classname Horse
 * @Description TODO
 * @Date 2021/1/19 23:46
 * @Created by 张斌
 */
public class Horse {
    private String name;
    public Horse(String name) {
        System.out.println("init horse,horse name is "+name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                '}';
    }
}
