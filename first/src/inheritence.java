import java.net.SocketTimeoutException;

class Aclass{
    int a1;
    int a2;
//    public Aclass(int a1,int a2){
//        this.a1=a1;
//        this.a2=a2;
//    }

    public int geta1(){
        return a1;
    }
    public int geta2(){
        return a2;
    }
}
class Bclass extends Aclass{
    int b1;
    int b2;
    public Bclass(int a1,int a2,int b1,int b2){
       // super(a1,a2);
        this.b1=b1;
        this.b2=b2;
        this.a1=a1;
        this.a2=a2;
    }

    public int getb1() {
        return b1;
    }
    public int getb2() {
        return b2;
    }
}
public class inheritence {
    public static void main(String[] args) {
        Bclass B1=new Bclass(1,2,3,4);
        System.out.printf("a1 : %d\na2 : %d\nb1 : %d\nb2 : %d",B1.geta1(),B1.geta2(),B1.getb1(),B1.getb2());
    }
}
