public class SquerePegAdapter {

    private final SquarePeg peg;
    private final RoundPeg roundPeg;

    public SquerePegAdapter(SquarePeg peg) {
        this.peg = peg;
        roundPeg = new RoundPeg(peg.getWidth()*Math.sqrt(2)/2);
    }

    public RoundPeg getRoundPeg() {
        return roundPeg;
    }
}
