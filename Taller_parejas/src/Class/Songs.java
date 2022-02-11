/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author jaira
 */
public class Songs implements Comparable<Songs> {

    private String Id, Title, Year, Duration, Gender, Cover, Description;
    

    public Songs(String Id, String Title, String Year, String Duration, String Gender, String Cover, String Description) {
        this.Id = Id;
        this.Title = Title;
        this.Year = Year;
        this.Duration = Duration;
        this.Gender = Gender;
        this.Cover = Cover;
        this.Description = Description;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String Year) {
        this.Year = Year;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getCover() {
        return Cover;
    }

    public void setCover(String Cover) {
        this.Cover = Cover;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    @Override
    public String toString() {
        return " Id=" + Id + "--" + Title + "--" + Year + "--" + Duration + "--" + Gender + "--" + Cover + "--" + Description;
    }

    @Override
    public int compareTo(Songs o) {
       return Duration.compareTo(o.getDuration());
    }

}
