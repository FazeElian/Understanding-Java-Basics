public class HotelBookingExample {
    public static void main(String[] args) {
        var clientName = "Elián Ibarra";
        var stayDays = 3;
        var dailyCost = 400.5;
        var roomHasSeaView = false;

        System.out.println("---------- Initial information ----------");
        System.out.println("clientName = " + clientName);
        System.out.println("stayDays = " + stayDays);
        System.out.println("dailyCost = " + dailyCost);
        System.out.println("roomHasSeaView = " + roomHasSeaView);

        clientName = "Carlos González";
        stayDays = 7;
        dailyCost = 200.5;
        roomHasSeaView = true;

        System.out.println();
        System.out.println("---------- New information (after changes) ----------");
        System.out.println("clientName = " + clientName);
        System.out.println("stayDays = " + stayDays);
        System.out.println("dailyCost = " + dailyCost);
        System.out.println("roomHasSeaView = " + roomHasSeaView);
    }
}
