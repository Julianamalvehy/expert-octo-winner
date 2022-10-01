package beans;
public class Pelicula {
    //creamos los datos de las columnas de la base de datos
    private int id;
    private String titulo;
    private String genero;
    private String autor;
    private int copias;
    private boolean novedad; // se deja booleano, pero en base de datos esta en tinyint

    //se crea metod constructor, como los datos son privados necesitamos getters and setters
    public Pelicula(int id, String titulo, String genero, String autor, int copias, boolean novedad) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.copias = copias;
        this.novedad = novedad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public boolean isNovedad() {
        return novedad;
    }

    public void setNovedad(boolean novedad) {
        this.novedad = novedad;
    }
    
    // en front todo se cae como string entonces tenemos que volverlos string aqui, para que no genere error
    //override es sobreescribir, es decir que por ejemplo antes hay un id tipo int, y aqui lo sobreescribimos a id tipo string
    @Override
    public String toString() {
        return "Pelicula{" + "id=" + id + ", titulo=" + titulo + ", genero=" + genero + ", autor=" + autor + ", copias=" + copias + ", novedad=" + novedad + '}';
    }
    
   
    

    
    
}
