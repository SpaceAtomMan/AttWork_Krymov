public class Cities {
    private int id;
    private int region;
    private String prefix;
    private String name;

    public Cities(int id, int region, String prefix, String name) {
        this.id = id;
        this.region = region;
        this.prefix = prefix;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRegion() {
        return region;
    }

    public void setRegion(int region) {
        this.region = region;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
