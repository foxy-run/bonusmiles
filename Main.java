public class Main {
    public static void main(String[] args) {
    BonusMilesService service = new BonusMilesService();
    int ticketCost = 9_578;
    int bonusMiles = service.calculate(ticketCost);

    }
}
