package entity;

/**
 * @author fq
 * @create 2019-09-07
 */
public class Hourse {
    private String name;

    private String area;

    private String address;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public void findByAddress(){
        System.out.println("通过地址查找");
    }

    public void findById(){
        System.out.println("从redis中查询");
    }
}
