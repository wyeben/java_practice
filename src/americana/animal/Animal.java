package americana.animal;

import java.util.Objects;

public class Animal {
    private String sound;

    private String run;
    public Animal(String sound) {
        this.sound = sound;
    }

    public Animal() {
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "sound='" + sound + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(sound, animal.sound);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sound);
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getRun() {
        return run;
    }
}
