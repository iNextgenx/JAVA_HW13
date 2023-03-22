import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodosTest {

    @Test
    public void shouldAddThreeTasksOfDifferentType() {          // Проверка добавления задач 3 типов
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        String[] subtasks = { "Молоко", "Яйца", "Хлеб" };
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] expected = { simpleTask, epic, meeting };
        Task[] actual = todos.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldTestSearch1Match(){  // Тест для 1 совпадения

        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        String[] subtasks = { "Молоко", "Яйца", "Хлеб" };

        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);


        Task[] expected = { epic };
        Task[] actual = todos.search("Молоко");
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldTestSearch0Match(){  // Тест для 0 совпадений

        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        String[] subtasks = { "Молоко", "Яйца", "Хлеб" };

        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);


        Task[] expected = {  };
        Task[] actual = todos.search("Яблоко");
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldTestSearch2Match(){  // Тест для 2 совпадения

        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        String[] subtasks = { "Молоко", "Яйца", "Хлеб" };

        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение Молоко",
                "Во вторник после обеда"
        );

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);


        Task[] expected = { epic, meeting };
        Task[] actual = todos.search("Молоко");
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldTestSearchAllMatch(){  // Тест для всех совпадений

        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям и попить Молоко");

        String[] subtasks = { "Молоко", "Яйца", "Хлеб" };

        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение Молоко",
                "Во вторник после обеда"
        );

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);


        Task[] expected = { simpleTask, epic, meeting };
        Task[] actual = todos.search("Молоко");
        Assertions.assertArrayEquals(expected, actual);

    }


}
