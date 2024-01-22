public class Dog {
    public int weightInPounds;
    public static String binomen = "Canis familiaris";

//    one integer constructor for dogs, similar to python __init__
    public Dog(int w) {
        weightInPounds = w;
    }
    public void makeNoise() {
        if (weightInPounds < 10) {
            System.out.println("yip!");
        } else if (weightInPounds < 30) {
            System.out.println("bark!");
        }
        else {
            System.out.println("woooof!");
        }
    }

//    public static Dog maxDog(Dog d1, Dog d2) {
//        if (d1.weightInPounds > d2.weightInPounds) {
//            return d1;
//        }
//        else {
//            return d2;
//        }
//    }

    public Dog maxDog(Dog d2) {
        if (this.weightInPounds > d2.weightInPounds) {
            return this;
        }
        else {
            return d2;
        }
    }

//    public static void main(String[] args) {
//        makeNoise();
//    }
}
