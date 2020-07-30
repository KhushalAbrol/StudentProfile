public class studentProfile {
    String firstName;
    String lastName;
    int gradYear;
    double GPA;
    String major;

    studentProfile(String firstName,
                   String lastName,
                   int gradYear,
                   double GPA,
                   String major){

        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;
        this.GPA = GPA;
        this.major = major;
    }

    public String name () {
        return this.firstName +" "+this.lastName;
    }
    public int fail() {
        this.gradYear = this.gradYear+1;
        return this.gradYear;
    }



}
