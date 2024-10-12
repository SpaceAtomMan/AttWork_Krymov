public class Operators extends Companies{
    private int id;
    private String licence;

    public Operators(int inn, String nameShort, String nameFull, String director, int id, Companies companies, String licence) {
        super(inn, nameShort, nameFull, director);
        this.id = id;
        this.licence = licence;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }
}
