package company;

import java.lang.invoke.VarHandle;

public class ObjectSanmple {
    //インスタンスの作成
    public static void main(String[] args) {
       var employee = new Employee("鈴木", "営業部","課長",100 );
       
       //インスタンスメソッドの呼び出し
       employee.report();
       employee.report(2);
       
      //一行空ける
       System.out.println("");
       
       //インスタンスの作成
       var engineer = new Employee("田中","開発部","一般社員",88);
       
       //インスタンスメソッドの呼び出し
       engineer.report();
       
   
       
       
       
       

    }

}
