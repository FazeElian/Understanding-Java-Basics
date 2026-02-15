public class EmailGeneratorExample {
    public static void main(String[] args) {
        // User example data
        var name = "  Elian Ibarra  ";
        var company = " School of Engineering ";
        var domain = "edu.co";

        // Show initial data
        System.out.println("---------- USER INITIAL DATA ----------");
        System.out.println("User name: " + name);
        System.out.println("User company: " + company);
        System.out.println("User domain: " + domain + "\n");

        // normalize name
        var normalizedName = name.strip().toLowerCase().replace(' ', '.');

        // strip() -> remove spaces at the beginning and at the end of the string
        // toLowerCase() -> convert all characters of the string to lowercase
        // replace(oldCharacter, newCharacter) -> Replace the old character of te string with a new one

        // normalize company name
        var normalizedCompany = company.strip().toLowerCase().replace(' ', '.');

        // Generate email concatenating
        var email = (normalizedName + "@" + normalizedCompany + "." + domain).toString();
        System.out.println("---------- USER FINAL DATA ----------");
        System.out.println("Normalized user name = " + normalizedName);
        System.out.println("Normalized user company = " + normalizedCompany);
        System.out.println("*** Email generated: " + email + " ***");
    }
}
