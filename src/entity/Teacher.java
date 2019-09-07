package entity;

import java.util.List;

/**
 * @author fq
 * @create 2019-09-07
 */
public class Teacher extends Person{


    private String schoolName;

    private List<String> subjectList;

    public void teach(){
        System.out.println("teach");
    }

    public void kick(){
        System.out.println("kick");
    }

    public List<String> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<String> subjectList) {
        this.subjectList = subjectList;
    }
}
