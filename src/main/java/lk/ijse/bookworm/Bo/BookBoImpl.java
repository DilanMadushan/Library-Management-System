package lk.ijse.bookworm.Bo;

import lk.ijse.bookworm.Dao.BookDaoImpl;
import lk.ijse.bookworm.Dto.BookDto;
import lk.ijse.bookworm.Entity.Book;
import lk.ijse.bookworm.Entity.Borrow;
import lk.ijse.bookworm.Entity.Branch;

import java.util.ArrayList;
import java.util.List;

public class BookBoImpl {

    BookDaoImpl bookDao = new BookDaoImpl();
    public String generateNextBookId() {
        return bookDao.generateNextId();
    }

    public List<BookDto> getAllBooks() {
        List<Book> books = bookDao.getAll();

        List<BookDto> bookDto = new ArrayList<>();

        for(Book book:books){
            bookDto.add(new BookDto(
                    book.getId(),
                    book.getTitle(),
                    book.getAuthor(),
                    book.getGenre(),
                    book.getStatus(),
                    book.getBranch()
            ));
        }
        return bookDto;
    }

    public boolean saveBook(BookDto bookDto) {
        return bookDao.Save(new Book(
                bookDto.getId(),
                bookDto.getTitle(),
                bookDto.getAuthor(),
                bookDto.getGenre(),
                bookDto.getStatus(),
                bookDto.getBranch()
        ));
    }

    public boolean deleteBook(BookDto bookDto) {
        return bookDao.delete(new Book(
                bookDto.getId(),
                bookDto.getTitle(),
                bookDto.getAuthor(),
                bookDto.getGenre(),
                bookDto.getStatus(),
                bookDto.getBranch()
        ));
    }

    public boolean updateBook(BookDto bookDto) {
        return bookDao.update(new Book(
                bookDto.getId(),
                bookDto.getTitle(),
                bookDto.getAuthor(),
                bookDto.getGenre(),
                bookDto.getStatus(),
                bookDto.getBranch()
        ));
    }
}
