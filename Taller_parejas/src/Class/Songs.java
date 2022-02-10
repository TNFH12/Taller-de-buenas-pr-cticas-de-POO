/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;
import Interfaces.MusikFilter;
/**
 *
 * @author jaira
 */
public class Songs implements MusikFilter {
    
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

    @Override
    public void Gender_filter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Same_year() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Duration_order() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Order_date() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
