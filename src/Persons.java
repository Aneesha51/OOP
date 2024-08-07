public class Persons {
    String relationship;
    String name;
    int age;
    String trait;
    String complextion;

    Persons(String name, int age, String trait, String complextion, String relationship){

        this.name = name;
        this.trait= trait;
        this.age = age;
        this.complextion = complextion;
        this.relationship = relationship;
    }

    void details() {
        System.out.println("I " + this.name + " am " + this.age + " years old and I am Aneeshas " + this.relationship + " and I am " + this.trait + " also I am " + this.complextion );
    }

    void details1(){
        System.out.println("I " + this.name + " am " + this.age + " years old and this is my lineage I inherite the " + this.trait + " gene from my GrandFather, GrandMother, Father and Mother.");
    }
    
}
