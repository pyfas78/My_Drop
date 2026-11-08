package danilovich.dev.drop.model;

import danilovich.dev.drop.model.enums.Condition;
import danilovich.dev.drop.model.enums.Gender;
import danilovich.dev.drop.model.enums.ItemStatus;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "brand")
    private String brand;

    @Column(name = "category")
    private String category;

    @Column(name = "size")
    private String size;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private ItemStatus status;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private  Gender gender;

    @Column(name = "condition")
    @Enumerated(EnumType.STRING)
    private  Condition condition;

    @Column(name = "chest_width")
    private Integer chestWidth;

    @Column(name = "total_length")
    private Integer totalLength;

    @Column(name = "shoulder_width")
    private Integer shoulderWidth;

    @Column(name = "sleeve_length")
    private Integer sleeveLength;

    @Column(name = "insole_length")
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

    public Item(String title, String description, BigDecimal price, String brand, String category, String size, ItemStatus status, Gender gender, Condition condition, Integer chestWidth, Integer totalLength, Integer shoulderWidth, Integer sleeveLength, Double insoleLength, User seller, List<String> images, int viewsCount, LocalDateTime createdAt) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.brand = brand;
        this.category = category;
        this.size = size;
        this.status = status;
        this.gender = gender;
        this.condition = condition;
        this.chestWidth = chestWidth;
        this.totalLength = totalLength;
        this.shoulderWidth = shoulderWidth;
        this.sleeveLength = sleeveLength;
        this.insoleLength = insoleLength;
        this.seller = seller;
        this.images = images;
        this.viewsCount = viewsCount;
        this.createdAt = LocalDateTime.now();
    }

    public Item() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public ItemStatus getStatus() {
        return status;
    }

    public void setStatus(ItemStatus status) {
        this.status = status;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public Integer getChestWidth() {
        return chestWidth;
    }

    public void setChestWidth(Integer chestWidth) {
        this.chestWidth = chestWidth;
    }

    public Integer getTotalLength() {
        return totalLength;
    }

    public void setTotalLength(Integer totalLength) {
        this.totalLength = totalLength;
    }

    public Integer getShoulderWidth() {
        return shoulderWidth;
    }

    public void setShoulderWidth(Integer shoulderWidth) {
        this.shoulderWidth = shoulderWidth;
    }

    public Integer getSleeveLength() {
        return sleeveLength;
    }

    public void setSleeveLength(Integer sleeveLength) {
        this.sleeveLength = sleeveLength;
    }

    public Double getInsoleLength() {
        return insoleLength;
    }

    public void setInsoleLength(Double insoleLength) {
        this.insoleLength = insoleLength;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public int getViewsCount() {
        return viewsCount;
    }

    public void setViewsCount(int viewsCount) {
        this.viewsCount = viewsCount;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
