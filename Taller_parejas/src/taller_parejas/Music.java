/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_parejas;

/**
 *
 * @author tania
 */
public class Music extends mLibrary implements MusikFilter {
    
    public Music(String Title, String Id, String Date, String Duration, String Gender, String Cover, String Description) {
        super(Title, Id, Date, Duration, Gender, Cover, Description);
    }
    @Override
    public void setDescription(String Description) {
        super.setDescription(Description); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDescription() {
        return super.getDescription(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCover(String Cover) {
        super.setCover(Cover); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCover() {
        return super.getCover(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setGender(String Gender) {
        super.setGender(Gender); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getGender() {
        return super.getGender(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDuration(String Duration) {
        super.setDuration(Duration); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDuration() {
        return super.getDuration(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDate(String Date) {
        super.setDate(Date); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDate() {
        return super.getDate(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setId(String Id) {
        super.setId(Id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getId() {
        return super.getId(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTitle(String Title) {
        super.setTitle(Title); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTitle() {
        return super.getTitle(); //To change body of generated methods, choose Tools | Templates.
    }

   

    @Override
    public void Gender_filter() {
        
    }

    @Override
    public void Same_year() {
        
    }

    @Override
    public void Duration_order() {
        
    }

    @Override
    public void Order_date() {
        
    }
    
}
