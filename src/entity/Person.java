package entity;

/**
 * @author fq
 * @create 2019-09-07
 */
public class Person {
    private Long id;
    private String name;
    private Integer age;

    public void run(){
        System.out.println("run");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
