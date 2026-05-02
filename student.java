class stdnt{
    private String name ;
    public void setname(String n){
        name = n;
    }
    public String getname(){
        return name;
    }
    private int marks ;
    public void setmarks(int m){
        marks = m;
    }
    public int getmarks(){
        return marks;
    }
}
public class student {
    public static void main(String [] args){
        stdnt s = new stdnt();
        s.setname("vanshika");
        s.setmarks(85);
        System.out.println("name = " +s.getname());
        System.out.println("marks = " +s.getmarks());
    }   
}
