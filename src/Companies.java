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
}
