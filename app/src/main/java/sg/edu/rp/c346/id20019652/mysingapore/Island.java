package sg.edu.rp.c346.id20019652.mysingapore;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Island implements Serializable {

    private int id;
    private String name;
    private String description;
    private int square;
    private int stars;

    public Island(int id, String name, String description, int square, int stars) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.square = square;
        this.stars = stars;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSquare() { return square; }
    public String getSquareKm() {
        String squareString = "";
        squareString += square;
        return squareString;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public int getStars() { return stars; }
    public String getIslandStars(){
        String starsString = "";
        for(int i = 0; i < stars; i++){
            starsString += "*";
        }
        return starsString;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
    @NonNull
    @Override
    public String toString() {
        String starsString = "";
        for(int i = 0; i < stars; i++){
            starsString += "*";
        }
        return name + "\n" + description + " - " + square + "\n" + starsString;

    }
}
