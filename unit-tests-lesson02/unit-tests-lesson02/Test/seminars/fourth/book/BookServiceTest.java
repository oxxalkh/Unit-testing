package seminars.fourth.book;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.mockito.Mockito;

import java.util.List;


//У вас есть класс BookService, который использует интерфейс BookRepository для получения информации о книгах из базы
// данных. Ваша задача написать unit-тесты для BookService, используя Mockito для создания мок-объекта BookRepository.


@DisplayName("Тесты класса BookService")
class BookServiceTest {

    @Test
    @DisplayName("Получение книги по ID")
    public void testFindBookById() {
        BookRepository mockRepository = Mockito.mock(BookRepository.class);
        Mockito.when(mockRepository.findById("123")).thenReturn(new Book("123", "Test Book", "Test Author"));
        BookService bookService = new BookService(mockRepository);
        Book result = bookService.findBookById("123");
        Assertions.assertEquals("Test Book", result.getTitle());
        Assertions.assertEquals("Test Author", result.getAuthor());
    }

    @Test
    @DisplayName("Нахождение всех книг")
    public void testFindAllBooks() {
        BookRepository mockRepository = Mockito.mock(BookRepository.class);
        Mockito.when(mockRepository.findAll()).thenReturn(List.of(new Book("123", "Test Book", "Test Author")));
        BookService bookService = new BookService(mockRepository);
        List<Book> result = bookService.findAllBooks();
        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals("Test Book", result.get(0).getTitle());
        Assertions.assertEquals("Test Author", result.get(0).getAuthor());
    }
}

