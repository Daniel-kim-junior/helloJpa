
package hellojpa;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.TableGenerator;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;


@Entity
@SequenceGenerator(
        name = "MEMBER_SEQ_GENERATOR",
        sequenceName = "MEMBER_SEQ",
        initialValue = 1,
        allocationSize = 50
)
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE,
                    generator = "MEMBER_SEQ_GENERATOR")
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

    public void setName(String name) {
        this.name = name;
    }

    @Transient
    private int tmp;
}
