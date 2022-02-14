public class Human {

    private String last_name, first_name, patronymic;

    public Human(String last_name, String first_name) {

        this.last_name = last_name;
        this.first_name = first_name;

    }

    public Human(String last_name, String first_name, String patronymic) {

        this.last_name = last_name;
        this.first_name = first_name;
        this.patronymic = patronymic;

    }

    public String getFullName() {

        if (this.patronymic != null) {
            return this.last_name + " " + this.first_name + " " + this.patronymic;
        } else {
            return this.last_name + " " + this.first_name;
        }

    }

    public String getShortName() {

        if (this.patronymic != null) {
            return this.last_name + " " + this.first_name.charAt(0) + ". " + this.patronymic.charAt(0) + ".";
        } else {
            return this.last_name + " " + this.first_name.charAt(0) + ".";
        }

    }

}
