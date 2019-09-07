package entity;

/**
 * @author fq
 * @create 2019-09-07
 */
public class Teacher extends Person{

    private String schoolName;

    public void teach(){
        System.out.println("teach");
    }

    public void kick(){
        System.out.println("kick");
    }
}
