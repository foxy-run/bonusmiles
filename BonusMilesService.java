public class BonusMilesService {
    public int calculate(int ticketCost) {
        int bonusMile = 20;
        int bonus = ticketCost / bonusMile;
        System.out.println(bonus);
        return bonus;
    }
}
