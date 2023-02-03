package BookMyShow.BookMyShow.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="User")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "User Name")
    private String name;

    private int mobile;



    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<TicketEntity> ticketsList;
}
