package danilovich.dev.drop.model;

import danilovich.dev.drop.model.enums.Condition;
import danilovich.dev.drop.model.enums.Gender;
import danilovich.dev.drop.model.enums.ItemStatus;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
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
    private @Enumerated(EnumType.STRING) ItemStatus status;
    private @Enumerated(EnumType.STRING) Gender gender;
    private @Enumerated(EnumType.STRING) Condition condition;
    private Integer chestWidth;
    private Integer totalLength;
    private Integer shoulderWidth;
    private Integer sleeveLength;
    private Double insoleLength;

    @ManyToOne()

    private List<String>@ElementCollection images;
    private int viewsCount;
    private LocalDateTime createdAt;

}
