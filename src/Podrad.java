public class Podrad extends Companies{
    private int id;
    private String dogovor;

    public Podrad(int inn, String nameShort, String nameFull, String director, int id, String dogovor) {
        super(inn, nameShort, nameFull, director);
        this.id = id;
        this.dogovor = dogovor;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getDogovor() {
        return dogovor;
    }

    public void setDogovor(String dogovor) {
        this.dogovor = dogovor;
    }
}