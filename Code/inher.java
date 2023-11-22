abstract class Shape{
    public abstract void area();
    public abstract void peri();
}

class Rect extends Shape{
    int length;
    int breadth;

    Rect(){
        int length = 1;
        int breadth = 1;
    }
    Rect(int l,int b){
        length = l;
        breadth = b;
    }
    public void area(){
        int area = length*breadth;
        System.out.println(area);
    }
    public void peri(){
        int peri = 2*(length+breadth);
        System.out.println(peri);
    }
    public static void main(String[] args) {
        Rect r = new Rect(2,4);
        r.area();
        r.peri();
    }
}
