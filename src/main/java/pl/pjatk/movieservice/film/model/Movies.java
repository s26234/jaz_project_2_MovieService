package pl.pjatk.movieservice.film.model;

import jakarta.persistence.*;
import jakarta.persistence.Id;

@Entity
public class Movies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Category category;

    public Movies(long id, String name, Category category ) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public Movies(String name, Category category){
        this.name = name;
        this.category = category;
    }

    public Movies() {
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}









//??
//soft wrap





//    public List<Car> getCarList() {
//        return carList;
//    }
//
//    public CarStorage() {
//        carList.add(fordMondeo);
//        carList.add(volkswagenTouareg);
//        carList.add(fordExplorer);
//        carList.add(bentleyArnage);
