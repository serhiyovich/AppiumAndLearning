package proselyte;

public class DeveloperRunner {
    public static void main(String[] args) {
        Developer developer = new Developer("Vitalii",1);
        Developer developer2 = new Developer("Valentyn",2);

        int compare = developer.compare(developer,developer2);
        int compare2 = developer2.compare(developer2,developer);
        int compareTo = developer.compareTo(developer2);
        System.out.println(compare);
        System.out.println(compare2);
        System.out.println(compareTo);
    }
}
