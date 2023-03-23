
package hellojpa;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

@Entity

public class Member {
    @Id
    private Long id;
    private String name;

    Member(){}
    public Member(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    @Enumerated(EnumType.STRING)
    private RoleType roleType;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime now_time;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime created_time;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime remove_time;
   @Lob
    private String description;

   @Transient
    private int tmp;
}
>>>>>>> fa46f02 (TIL : JPA annotation)
