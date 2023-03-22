import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {

    @Test
    public void shouldTestSimpleTaskMatchesTrue(){             // True тест метода matches класса SimpleTask
        SimpleTask result = new SimpleTask(10,"Позвонить родителям");
        boolean expected = true;
        boolean actual = result.matches("Позвонить");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestSimpleTaskMatchesFalse(){             // False тест метода matches класса SimpleTask
        SimpleTask result = new SimpleTask(10,"Позвонить родителям");
        boolean expected = false;
        boolean actual = result.matches("Написать");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestSimpleTaskMatchesNullName(){  // Тест метода matches класса SimpleTask с пустой задачей
        SimpleTask result = new SimpleTask(10,"");
        boolean expected = false;
        boolean actual = result.matches("Написать");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestSimpleTaskMatchesNullRequest(){ //Тест метода matches класса SimpleTask с нулевым запросом
        SimpleTask result = new SimpleTask(10,"Позвонить родителям");
        boolean expected = true;
        boolean actual = result.matches("");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestSimpleTaskMatchesSpaceRequest(){ //Тест метода matches класса SimpleTask с запросом пробел
        SimpleTask result = new SimpleTask(10,"Позвонить родителям");
        boolean expected = true;
        boolean actual = result.matches(" ");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestSimpleTaskMatchesNull(){          // Тест метода matches класса SimpleTask с пустыми полями
        SimpleTask result = new SimpleTask(10,"");
        boolean expected = true;
        boolean actual = result.matches("");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestEpicMatchesTrue(){             // True тест метода matches класса Epic
        String[] subtasks = { "Молоко", "Яйца", "Хлеб", "01", "Test" };
        Epic result = new Epic(55, subtasks);
        boolean expected = true;
        boolean actual = result.matches("Хлеб");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestEpicMatchesFalse(){             // False тест метода matches класса Epic
        String[] subtasks = { "Молоко", "Яйца", "Хлеб", "01", "Test" };
        Epic result = new Epic(55, subtasks);
        boolean expected = false;
        boolean actual = result.matches("Яблоко");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestEpicMatchesNullSubtacks(){         // Тест метода matches класса Epic с пустыми подзадачами
        String[] subtasks = {  };
        Epic result = new Epic(55, subtasks);
        boolean expected = false;
        boolean actual = result.matches("Яблоко");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestEpicMatchesNullReq(){             // Тест метода matches класса Epic с пустым запросом
        String[] subtasks = { "Молоко", "Яйца", "Хлеб", "01", "Test" };
        Epic result = new Epic(55, subtasks);
        boolean expected = true;
        boolean actual = result.matches("");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestEpicMatchesSpaceReq(){             // Тест метода matches класса Epic с запросом пробел
        String[] subtasks = { "Молоко", "Яйца", "Хлеб", "01", "Test" };
        Epic result = new Epic(55, subtasks);
        boolean expected = false;
        boolean actual = result.matches(" ");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestEpicMatchesNull(){ // Тест метода matches класса Epic с пустым запросом и пустыми подзадачами
        String[] subtasks = { };
        Epic result = new Epic(55, subtasks);
        boolean expected = false;
        boolean actual = result.matches("");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestMeetingMatchesTrue(){             // True тест метода matches класса Meeting
        Meeting result = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = true;
        boolean actual = result.matches("Выкатка");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestMeetingMatchesFalse(){             // False тест метода matches класса Meeting
        Meeting result = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = false;
        boolean actual = result.matches("Яблоко");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestMeetingMatchesNullReq(){             // Тест метода matches класса Meeting с пустым запросом
        Meeting result = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = true;
        boolean actual = result.matches("");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestMeetingMatchesSpaceReq(){             // Тест метода matches класса Meeting с запросом пробел
        Meeting result = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = true;
        boolean actual = result.matches(" ");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestMeetingMatchesNullTacks(){         // Тест метода matches класса Meeting с пустыми задачами
        Meeting result = new Meeting(
                555,
                "",
                "",
                ""
        );

        boolean expected = false;
        boolean actual = result.matches("Яблоко");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestMeetingMatchesNullTacksReq(){   // Тест метода matches класса Meeting с пустыми задачами и запросом
        Meeting result = new Meeting(
                555,
                "",
                "",
                ""
        );

        boolean expected = true;
        boolean actual = result.matches("");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestMeetingMatchesNullTacksSpaceReq(){   // Тест метода matches класса Meeting с пустыми задачами и запросом пробел
        Meeting result = new Meeting(
                555,
                "",
                "",
                ""
        );

        boolean expected = false;
        boolean actual = result.matches(" ");
        Assertions.assertEquals(expected, actual);
    }

}
