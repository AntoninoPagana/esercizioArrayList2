import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> lista = new ArrayList<>();
        lista.add(new Student("Mario", 23));
        lista.add(new Student("Pino", 21));
        lista.add(new Student("Franco", 27));
        lista.add(new Student("Nicolo", 24));
        lista.add(new Student("Enrico", 29));
        lista.add(new Student("Federico", 21));
        lista.add(new Student("Pina", 23));
        lista.add(new Student("Alessandra", 25));
        lista.add(new Student("Francesca", 24));
        lista.add(new Student("Antonino", 21));
        lista.add(new Student("Michele", 20));
        lista.add(new Student("Davide", 23));

        System.out.println("Lista non ordinata: " + lista);

        Collections.sort(lista, Comparator.comparingInt(Student::getAge));

        System.out.println("Lista ordinata per eta: " + lista);
    }
}
