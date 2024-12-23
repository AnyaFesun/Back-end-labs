package org.example.back_end_labs.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Positive;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@Entity
@Table(name = "records")
@Getter
@Setter
@NoArgsConstructor
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @JsonIgnore
    private User user;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @Column(name = "creation_date", nullable = false)
    private LocalDateTime creationDate;

    @Positive(message = "Costs must be a positive value")
    @Column(nullable = false)
    private Double costs;

    public Record(User user, Category category, Double costs) {
        this.user = user;
        this.category = category;
        this.costs = costs;
        this.creationDate = LocalDateTime.now();
    }
}
