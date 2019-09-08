package entity;

import java.util.List;

/**
 * @author fq
 * @create 2019-09-07
 */
public class Teacher extends Person{

    //教学年限
    private Integer teachAge;

    private String schoolName;

    private List<String> subjectList;

    public void teach(){
        System.out.println("step1");
        System.out.println("step2");
        System.out.println("step3");
        System.out.println("step4");
        System.out.println("step5");
        System.out.println("teach");
    }

    public void kick(){
        System.out.println("请确认修复了kick的bug");
        System.out.println("kick");
    }

    public void changeSubject(){
        System.out.println("是否改变主科目");
    }

    public List<String> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<String> subjectList) {
        this.subjectList = subjectList;
    }
}
