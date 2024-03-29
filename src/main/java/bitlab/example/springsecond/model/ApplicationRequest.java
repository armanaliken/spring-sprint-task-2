package bitlab.example.springsecond.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Application_Requests")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ApplicationRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "COURSE_NAME")
    private String courseName;

    @Column(name = "COMMENTARY")
    private String commentary;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "HANDLED")
    private Boolean handled;

}
