import java.time.LocalDate;

public class Orders {
    private int id;
    private int numberRm;
    private String name;
    private int city;
    private String address;
    private String job;
    private LocalDate dateEntry;
    private LocalDate datePlan;
    private int podrad;
    private String comments;

    public Orders(int numberRm, String name, Operators operator, LocalDate dateEntry) {
        this.numberRm = numberRm;
        this.name = name;
        this.dateEntry = dateEntry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberRm() {
        return numberRm;
    }

    public void setNumberRm(int numberRm) {
        this.numberRm = numberRm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public LocalDate getDateEntry() {
        return dateEntry;
    }

    public void setDateEntry(LocalDate dateEntry) {
        this.dateEntry = dateEntry;
    }

    public LocalDate getDatePlan() {
        return datePlan;
    }

    public void setDatePlan(LocalDate datePlan) {
        this.datePlan = datePlan;
    }

    public int getPodrad() {
        return podrad;
    }

    public void setPodrad(int podrad) {
        this.podrad = podrad;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
