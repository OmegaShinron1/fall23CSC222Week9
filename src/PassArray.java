public class PassArray
{
    public static void main(String[] args)
    {
        int[] scores = {76, 82, 90, 75, 92, 88};
        int x;
        System.out.println("Before giving each score a bonus:");
        for(x = 0; x < scores.length; ++x)
            System.out.print(scores[x] + "  ");
        System.out.println();
        giveBonus(scores);
        System.out.println("After giving each score a bonus:");
        for(x = 0; x < scores.length; ++x)
            System.out.print(scores[x] + "  ");
        System.out.println();
    }
    public static void giveBonus(int[] testScores)
    {
        int i;
        final int ADJUSTMENT = 6;
        for(i = 0; i < testScores.length; ++ i)
            testScores[i] += ADJUSTMENT;
    }
}