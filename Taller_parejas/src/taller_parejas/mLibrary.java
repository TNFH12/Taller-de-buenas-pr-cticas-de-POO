/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_parejas;
/**
 *
 * @author jaira
 */
public abstract class mLibrary {
    
    private String Title;
    private String Id;
    private String Date;
    private String Duration;
    private String Gender;
    private String Cover;
    private String Description;

    public mLibrary(String Title, String Id, String Date, String Duration, String Gender, String Cover, String Description) {
        this.Title = Title;
        this.Id = Id;
        this.Date = Date;
        this.Duration = Duration;
        this.Gender = Gender;
        this.Cover = Cover;
        this.Description = Description;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
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
    

    
   
    
}
