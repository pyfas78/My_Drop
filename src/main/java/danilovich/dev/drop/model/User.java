package danilovich.dev.drop.model;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "telegramHandle")
    private String telegramHandle;

    @Column(name = "phone")
    private String phone;

    @Column(name = "city")
    private String city;

    @Column(name = "rating")
    private Double rating;

    @Column(name = "createdAt")
    private LocalDate createdAt;

    public User(String username, String telegramHandle, String phone, String city, Double rating, LocalDate createdAt) {
        this.username = username;
        this.telegramHandle = telegramHandle;
        this.phone = phone;
        this.city = city;
        this.rating = 5.0;
        this.createdAt = LocalDate.now();
    }
    public User() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTelegramHandle() {
        return telegramHandle;
    }

    public void setTelegramHandle(String telegramHandle) {
        this.telegramHandle = telegramHandle;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }
}
