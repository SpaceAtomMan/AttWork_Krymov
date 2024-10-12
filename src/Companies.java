public class Companies {
    private int id;
    private int inn;
    private String nameShort;
    private String nameFull;
    private String director;

    public Companies(int inn, String nameShort, String nameFull, String director) {
        this.id = -1;
        this.inn = inn;
        this.nameShort = nameShort;
        this.nameFull = nameFull;
        this.director = "ФИО директора";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInn() {
        return inn;
    }

    public void setInn(int inn) {
        this.inn = inn;
    }

    public String getNameShort() {
        return nameShort;
    }

    public void setNameShort(String nameShort) {
        this.nameShort = nameShort;
    }

    public String getNameFull() {
        return nameFull;
    }

    public void setNameFull(String nameFull) {
        this.nameFull = nameFull;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
