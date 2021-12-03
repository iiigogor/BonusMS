public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int pricrTicket = 8000;
        int bm = service.calculate(pricrTicket);
        System.out.println("Вам начислено:" + bm + " бонусных миль");
    }
}
