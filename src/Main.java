public class Main {
    public static void main(String[] args) {
        RoundPeg roundPeg = new RoundPeg(10);
        RoundHole roundHole = new RoundHole(11);

        System.out.println(roundHole.fits(roundPeg));

        SquarePeg squarePeg = new SquarePeg(15);
        SquerePegAdapter squerePegAdapter = new SquerePegAdapter(squarePeg);
        System.out.println(roundHole.fits(squerePegAdapter.getRoundPeg()));
    }
}