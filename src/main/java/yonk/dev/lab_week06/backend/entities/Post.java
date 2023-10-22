package yonk.dev.lab_week06.backend.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigInteger;
import java.time.Instant;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "bigint(20)")
    private BigInteger id;

    @Column(name = "title")
    private String title;

    @Column(name = "metaTitle")
    private String metaTitle;

    @Column(name = "summary", columnDefinition = "tinytext")
    private String summary;

    @Column(name = "published", columnDefinition = "tinyint(1)")
    private int published;

    @Column(name = "createdAt", columnDefinition = "datetime")
    private Instant createdAt;

    @Column(name = "updatedAt", columnDefinition = "datetime")
    private Instant updatedAt;

    @Column(name = "publishedAt", columnDefinition = "datetime")
    private Instant publishedAt;

    @Column(name = "content", columnDefinition = "text")
    private String content;

    @ManyToOne
    @JoinColumn(name = "parentId")
    private Post parent;

    @OneToMany(mappedBy = "parent")
    private Set<Post> postList;

    @OneToMany(mappedBy = "post")
    private Set<PostComment> postComments;

    @ManyToOne
    @JoinColumn(name = "authorId")
    private User user;
}
