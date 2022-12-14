import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queueAttraction = new LinkedList<>(generateClients());

        while (!queueAttraction.isEmpty()) {
            Person currentPerson = queueAttraction.poll();

            int quantityTickets = currentPerson.getQuantityTickets();

            if (quantityTickets > 0) {
                System.out.println(currentPerson.getName() + " " +
                        currentPerson.getSureName() + " - " +
                        "решил прокатиться на аттракционе, в наличии билетов: " +
                        currentPerson.getQuantityTickets());

                currentPerson.setQuantityTickets(--quantityTickets);
                queueAttraction.offer(currentPerson);
            }

            System.out.println(currentPerson.getName() + " " +
                    currentPerson.getSureName() + " - " +
                    "вышел с аттракциона, осталось билетов: " +
                    currentPerson.getQuantityTickets());
        }
        System.out.println("Билеты кончились");
    }

    protected static List<Person> generateClients() {
        return List.of(
                new Person("Петя", "Пуговкин", 1),
                new Person("Вова", "Кукушкин", 3),
                new Person("Оля", "Тернова", 2),
                new Person("Люся", "Талая", 5),
                new Person("Миша", "Косолапов", 4)
        );
    }
}
