public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private byte age;
    private String course;
    public Student(int id, String firstName, String lastName, byte age, String course) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.course = course;
    }
    public String toString() {
        return "Student ID: " + id +
                ", First Name: " + firstName +
                ", Last Name: " + lastName +
                ", Age: " + age +
                ", Course: " + course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }


}
