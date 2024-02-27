package seminars.fourth.lection;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
public class Mockito {
    public static void main(String[] args) {
        // Создание mock
        List mockedList = mock(List.class);
// Использование
        mockedList.add("one");
        mockedList.clear();
    }

    @Test
    public void iteratorWillReturnHelloWorld() {
// Arrange
        Iterator iteratorMock = mock(Iterator.class);
// Act
        when(iteratorMock.next()).thenReturn("Hello", "World");
        String result = iteratorMock.next() + " " + iteratorMock.next();
// Assert
        assertEquals("Hello World", result);

    }
}
