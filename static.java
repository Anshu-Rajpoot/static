class Stu{
    String name;
    //static saves memory by creating it only once
    static String school;
}
public class static{
    public static void main(String args[]){
        Stu.school="aps";
        Stu s=new Stu();
        s.name="abc";
        System.out.println(s.name+"\n"+s.school);
    }
}