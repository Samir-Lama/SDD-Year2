public class Point<A, B>{
    A a;
    B b;

    public Point(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public void setA(A a) {
        this.a = a;
    }

    public void setB(B b) {
        this.b = b;
    }

    public A getA() {
        return a;
    }
    
    public B getB() {
        return b;
    }
}
