/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_parejas.Songs;

/**
 *
 * @author jaira
 */
public class Songs {
    
    private String Title,Duration,Gender,Cover,Description;
    private int Id,Year;

    public Songs(int Id, String Title,int Year, String Duration, String Gender, String Cover, String Description) {
        this.Title = Title;
        this.Duration = Duration;
        this.Gender = Gender;
        this.Cover = Cover;
        this.Description = Description;
        this.Id = Id;
        this.Year = Year;
    }

    public String getTitle() {
        return Title;
    }
    public void setTitle(String Title) {
        this.Title = Title;
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

    public Integer getId() {
        return Id;
    }
    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Integer getYear() {
        return Year;
    }
    public void setYear(Integer Year) {
        this.Year = Year;
    }

    @Override
    public String toString() {
        return  " Id=" +Id+"--"+Title+"--"+Year+"--"+Duration+"--"+Gender +"--"+Cover+"--"+Description;
    }
    
    
    
}
