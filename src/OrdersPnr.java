import java.time.LocalDate;

public class OrdersPnr extends Orders {
    private int id;
    private String ipAddress;
    private String result;
    private LocalDate dateJob;

    public OrdersPnr(int numberRm, String name, Operators operator, LocalDate dateEntry) {
        super(numberRm, name, operator, dateEntry);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public LocalDate getDateJob() {
        return dateJob;
    }

    public void setDateJob(LocalDate dateJob) {
        this.dateJob = dateJob;
    }
}
