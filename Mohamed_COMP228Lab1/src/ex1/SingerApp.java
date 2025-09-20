package ex1;

public class SingerApp {
    public static void main(String[] args) {

        Singers singer1 = new Singers();

        System.out.println("--------");
        System.out.println("ID: " + singer1.getSingerId());
        System.out.println("Name: " + singer1.getSingerName());
        System.out.println("Address: " + singer1.getSingerAddress());
        System.out.println("Date of Birth: " + singer1.getDateOfBirth());
        System.out.println("Albums Published: " + singer1.getAlbumsPublished());

        singer1.setAll(101, "Faris Haddad", "Toronto, ON", "1990-05-14", 3);

        System.out.println("\n-------");
        System.out.println("ID: " + singer1.getSingerId());
        System.out.println("Name: " + singer1.getSingerName());
        System.out.println("Address: " + singer1.getSingerAddress());
        System.out.println("Date of Birth: " + singer1.getDateOfBirth());
        System.out.println("Albums Published: " + singer1.getAlbumsPublished());

        singer1.setSingerId(202);
        singer1.setSingerName("Sara Alam");
        singer1.setSingerAddress("Mississauga, ON");
        singer1.setDateOfBirth("1995-12-01");
        singer1.setAlbumsPublished(5);

        System.out.println("\n--------");
        System.out.println("ID: " + singer1.getSingerId());
        System.out.println("Name: " + singer1.getSingerName());
        System.out.println("Address: " + singer1.getSingerAddress());
        System.out.println("Date of Birth: " + singer1.getDateOfBirth());
        System.out.println("Albums Published: " + singer1.getAlbumsPublished());
    }
}
