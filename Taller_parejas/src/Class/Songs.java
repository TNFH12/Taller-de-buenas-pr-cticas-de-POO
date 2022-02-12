package Class;

/**
 *Esta clase contiene los atributos y metodos de una cancion (Song)
 * @author Jair Ortiz - jairalbert1997@hotmail.com
 * @author Tania Forero - tanianickoll11@gmail.com
 * @version 1.0 2022-02-12
 */
public class Songs implements Comparable<Songs> {

    private String Id, Title, Year, Duration, Gender, Cover, Description;
        
    /**
     * Atributos: Id, Titulo, Año, Duracion, Genero, Caratula, Descripcion
     * Metodo constructor por defecto
     */
    
    public Songs(String Id, String Title, String Year, String Duration, String Gender, String Cover, String Description) {
        this.Id = Id;
        this.Title = Title;
        this.Year = Year;
        this.Duration = Duration;
        this.Gender = Gender;
        this.Cover = Cover;
        this.Description = Description;
    }

    // Seccion de metodos Getter y Setter para los atributos propios de la clase 
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
    //Empleamiento del metodo toString para imprimir las canciones en el orden que se soliciten con los filtros 
    @Override
    public String toString() {
        return " Id=" + Id + "--" + Title + "--" + Year + "--" + Duration + "--" + Gender + "--" + Cover + "--" + Description;
    }
    //Se emplea el metodo compare para organizar la lista de canciones segun el año de lanzamiento
    @Override
    public int compareTo(Songs o) { // es el video de organizar 
        
       return Year.compareTo(o.getYear());
    }

}
