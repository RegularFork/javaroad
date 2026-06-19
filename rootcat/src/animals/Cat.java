package animals;

public class Cat {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void action() {
        System.out.printf("%s I Am cat and I can \"Meow!\"\n", catSaid());
    }


    @Override
    public String toString() {
        return String.format("Object info: This is a cat named %s", this.name);
    }

    private String catSaid() {
        return String.format("%s said:", this.name);
    }

    public String getName() {
        return this.name;
    }

    public void setNewName(String name) {
        this.name = name;
    }
}
