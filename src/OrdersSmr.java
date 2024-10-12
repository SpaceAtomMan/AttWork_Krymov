import java.time.LocalDate;

public class OrdersSmr extends Orders {
    private int Servers;
    private int Patch;
    private LocalDate dateJob;

    public OrdersSmr(int numberRm, String name, Operators operator, LocalDate dateEntry, int servers, int patch, LocalDate dateJob) {
        super(numberRm, name, operator, dateEntry);
        Servers = servers;
        Patch = patch;
        this.dateJob = dateJob;
    }

    public int getServers() {
        return Servers;
    }

    public void setServers(int servers) {
        Servers = servers;
    }

    public int getPatch() {
        return Patch;
    }

    public void setPatch(int patch) {
        Patch = patch;
    }

    public LocalDate getDateJob() {
        return dateJob;
    }

    public void setDateJob(LocalDate dateJob) {
        this.dateJob = dateJob;
    }
}
