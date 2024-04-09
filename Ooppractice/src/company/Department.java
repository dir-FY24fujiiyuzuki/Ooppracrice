package company;

import java.security.PublicKey;

public class Department {
private final String name;
private final String departmentId;
private int budget;

//コンストラクター
public Department(String name, String departmentId, int badget) {
this.name = name;
this.departmentId = departmentId;
this.budget = budget;
}
//会議を開催する
public  void meeting() {
}
    //name getter
    public String getName() {
        return name;
        
    }
    
    //budget getter
    public double getBudget() {
        return budget;
    }
    //budget setter
    public void setBudget(int budget) {
        if (budget<0) {
            throw new IllegalArgumentException("予算はマイナスにできません。");
        
    }
    this.budget = budget;

}
}
