package gr.aueb.cf.cf9.ch15;

public class Cat implements ISpeakable {
    private String mame;

    public Cat() {
    }

    public Cat(String mame) {
        this.mame = mame;
    }

    public String getMame() {
        return mame;
    }

    public void setMame(String mame) {
        this.mame = mame;
    }

    @Override
    public void speak() {
        System.out.println("Meow");

    }
}
