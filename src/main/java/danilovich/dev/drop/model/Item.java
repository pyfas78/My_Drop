package danilovich.dev.drop.model;

import danilovich.dev.drop.model.enums.Condition;
import danilovich.dev.drop.model.enums.Gender;
import danilovich.dev.drop.model.enums.ItemStatus;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private BigDecimal price;
    private String brand;
    private String category;
    private String size;

    @Enumerated(EnumType.STRING)
    private ItemStatus status;

    @Enumerated(EnumType.STRING)
    private  Gender gender;

    @Enumerated(EnumType.STRING)
    private  Condition condition;

    private Integer chestWidth;
    private Integer totalLength;
    private Integer shoulderWidth;
    private Integer sleeveLength;
    private Double insoleLength;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User seller;

    @ElementCollection
    @CollectionTable(name = "item_image", joinColumns = @JoinColumn(name = "item_id"))
    @Column(name = "image_url")
    private List<String> images = new ArrayList<>();
    private int viewsCount;
    private LocalDateTime createdAt;

}
