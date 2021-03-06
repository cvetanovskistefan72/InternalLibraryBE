package internallibrary.project.model;


import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;



    @NotBlank(message = "Type is required")
    @Column(name = "type")
    private String type;



    @NotBlank(message ="Description is required")
    @Size(min = 10,message = "Minimum 10 characters allowed")
    @Size(max = 500,message = "Maxium 100 characters allowed")
    @Column(name = "description")
    private String description;


    @NotNull(message ="Quantity is required")
    @Min(value = 1,message = "Minimum 1 quantity is allowed")
    @Max(value = 100,message = "Maximum 100 quantity is allowed")
    @Column(name = "quantity")
    private Integer quantity;



    public Resource(Integer id, String type, String description, Integer quantity) {
        this.id = id;
        this.type = type;
        this.description = description;
        this.quantity = quantity;
    }

    public Resource() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}