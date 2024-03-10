package lk.ijse.bookworm.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.lang.model.element.Name;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table (name = "Book")
public class Book {
    @Id
    private String id;
    private String title;
    private String author;
    private String Genre;
    private String status;

    @ManyToOne
    private Branch branch;

    @ManyToMany(mappedBy = "book")
    private List<Borrow> borrows;

}
