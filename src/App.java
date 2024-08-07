public class App {
    public static void main(String[] args) throws Exception {
     
        Persons greatGrandFather = new Persons("Soobramoney", 51, "Short", "Fair", "Great Grandfather");
        Persons greatGrandMother = new Persons("Ambi", 60, "Short", "Fair", "Great GrandMother");
        Persons grandFather = new Persons("Murgas", 54, "Tall", "Fair", "GrandFather");
        Persons grandMother = new Persons("Priscilla", 71, "Tall", "Fair", "GrandMother");
        Persons Father = new Persons("Deena", 53, "Tall", "Fair", "Father");
        Persons Mother = new Persons("Rani", 51, "Tall", "Fair", "Mother");
        Persons Aneesha = new Persons("Aneesha", 27, "Tall", "Fair", "Daughter");

        greatGrandFather.details();
        greatGrandMother.details();
        grandFather.details();
        grandMother.details();
        Father.details();
        Mother.details();

        System.out.println("");
        
        Aneesha.details1();


    }
}
