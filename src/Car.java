import java.util.Date;
import java.util.List;

public class Car {
    private Integer price;
    private String name ;
    private List<String> options;
    private Date creationDate;
    private Boolean sold ;

    public Boolean getSold() {
        return sold;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setSold(Boolean sold) {
        this.sold = sold;
    }
}
