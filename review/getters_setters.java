public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // Ensure name is not null and has more than 2 characters before setting
        if (name != null && name.length() > 2) {
            this.name = name;
        }
        // No action is taken if the name is invalid (null or too short)
    }
}
