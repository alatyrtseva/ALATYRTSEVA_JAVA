import java.time.LocalDateTime;

public class Program {
    private String name;
    private LocalDateTime time;
    private String description;

    public Program(String name, LocalDateTime time, String description) {
        this.name = name;
        this.time = time;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public String getDescription() {
        return description;
    }
}
