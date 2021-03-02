public class PointGenerics {
    public static void main(String[] args){
        Point<Integer, Double> p = new Point<>(3,2.3);
        System.out.print(p.getA() * p.getB()+"\n");
        p.setA(100);
        p.setB(44.44);
        System.out.print(p.getA() * p.getB());
    }
}
