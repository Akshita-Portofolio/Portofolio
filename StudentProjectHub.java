import java.util.ArrayList;
import java.util.List;

class Project {
    private final String name;
    private final String category;
    private final String status;

    Project(String name, String category, String status) {
        this.name = name;
        this.category = category;
        this.status = status;
    }

    @Override
    public String toString() {
        return name + " | " + category + " | " + status;
    }
}

public class StudentProjectHub {
    public static void main(String[] args) {
        List<Project> projects = new ArrayList<>();
        projects.add(new Project("OLA User Journey Map", "UI/UX", "Completed"));
        projects.add(new Project("Portfolio Website", "Web", "In Progress"));
        projects.add(new Project("Contact API", "Python", "Completed"));

        System.out.println("=== Student Project Hub ===");
        projects.forEach(System.out::println);
    }
}
