package yonk.dev.lab_week06.backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.time.Instant;
import java.util.Set;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "bigint(20)")
    private BigInteger id;
    @Column(name = "firstName", columnDefinition = "varchar(50)")
    private String firstName;
    @Column(name = "middleName", columnDefinition = "varchar(50)")
    private String middleName;
    @Column(name = "lastName", columnDefinition = "varchar(50)")
    private String lastName;
    @Column(name = "mobile", columnDefinition = "varchar(15)")
    private String mobile;
    @Column(name = "email", columnDefinition = "varchar(50)")
    private String email;
    @Column(name = "passwordHash", columnDefinition = "varchar(32)")
    private String passwordHash;
    @Column(name = "registedAt", columnDefinition = "datetime")
    private Instant registedAt;
    @Column(name = "lastLogin", columnDefinition = "datetime")
    private Instant lastLogin;
    @Column(name = "intro", columnDefinition = "tinytext")
    private String intro;
    @Column(name = "profile", columnDefinition = "text")
    private String profile;

    @OneToMany(mappedBy = "user")
    private Set<Post> posts;

    @OneToMany(mappedBy = "user")
    private Set<PostComment> postComments;
}
