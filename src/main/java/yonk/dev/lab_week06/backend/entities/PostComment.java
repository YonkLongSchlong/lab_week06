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
@Table(name = "post_comment")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostComment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "bigint(20)")
    private BigInteger id;
    @Column(name = "title", columnDefinition = "varchar(100)")
    private String title;
    @Column(name = "published", columnDefinition = "tinyint(1)")
    private int published;
    @Column(name = "createdAt", columnDefinition = "datetime")
    private Instant createdAt;
    @Column(name = "publishedAt", columnDefinition = "datetime")
    private  Instant publishedAt;
    @Column(name = "content", columnDefinition = "text")
    private String content;

    @ManyToOne
    @JoinColumn(name = "parentId")
    private PostComment parent;

    @OneToMany(mappedBy = "parent")
    private Set<PostComment> postComments;

    @ManyToOne
    @JoinColumn(name = "postId")
    private Post post;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;
}
