package creational.builder;

public class StudentBuilder {
    private int rollNumber;
    private String name;
    private int phoneNumber;
    private String fatherName;
    private int age;
    private int cls;

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getFatherName() {
        return fatherName;
    }

    public int getAge() {
        return age;
    }

    public int getCls() {
        return cls;
    }

    private StudentBuilder(Information information){
        this.rollNumber = information.rollNumber;
        this.name = information.name;
        this.fatherName = information.fatherName;
        this.age = information.age;
        this.phoneNumber = information.phoneNumber;
        this.cls = information.cls;
    }

    public static class Information{
        private int rollNumber;
        private String name;
        private int phoneNumber;
        private String fatherName;
        private int age;
        private int cls;

        public Information setRollNumber(int rollNumber) {
            this.rollNumber = rollNumber;
            return this;
        }

        public Information setName(String name) {
            this.name = name;
            return this;
        }

        public Information setPhoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Information setFatherName(String fatherName) {
            this.fatherName = fatherName;
            return this;
        }

        public Information setAge(int age) {
            this.age = age;
            return this;
        }

        public Information setCls(int cls) {
            this.cls = cls;
            return this;
        }

        public StudentBuilder build(){
            return new StudentBuilder(this);
        }
    }
}
