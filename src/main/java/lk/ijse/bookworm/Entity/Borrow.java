package lk.ijse.bookworm.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name = "Borrow")
public class Borrow {
    @Id
    private String borrowId;
    private Date date;

    @ManyToMany
    private List<Book> book;

    @ManyToOne
    private User user;


}
