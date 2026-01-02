package gr.aueb.cf.cf9.ch15;

public class Main {
    public static void main(String[] args) {
        ISpeakable cat = new Cat("Alice");
        ISpeakable dog = new Dog(5, "Bob");

        doSpeak(cat);
        doSpeak(dog);
    }
    public static void doSpeak(ISpeakable iSpeakable){
        iSpeakable.speak();
    }
}
