public class DogLauncher {
    public static void main(String[] args) {
        Dog d = new Dog(25);
//        d.makeNoise();

        Dog d2 = new Dog(100);

//        Dog bigger = Dog.maxDog(d, d2);
        d.maxDog(d2).makeNoise();
        // Theoretically, You can invoke the method in these two ways, but not recommended, it is a static method
//        System.out.println(d.binomen);
//        System.out.println(d2.binomen);
        // Should use class name
        System.out.println(Dog.binomen);
//        Dog bigger = d.maxDog(d2);
//        bigger.makeNoise();
    }
}
