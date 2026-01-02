package gr.aueb.cf.cf9.ch15;

public class SpeakingSchool {
    private final Cat cat = new Cat();   // composition, private instances
    public SpeakingSchool(){

    }
    public void learnToSpeak(){
        cat.speak();
    }
}

