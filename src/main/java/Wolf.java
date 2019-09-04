public class Wolf extends Animal implements Cloneable {
    String a = "Wolf";

    public String test() {
        return "wolf";
    }

    @Override
    public Wolf clone() throws CloneNotSupportedException {
        return (Wolf)super.clone();
    }
}
