package ArrayPrograms;
import java.util.HashSet;

public class Test {
    public static void main(String[] args)
    {
        HashSet<Integer> shortSet = new HashSet<Integer>();
        for (short i = 0; i < 100; i++)
        {
            shortSet.add((int) i);
            shortSet.remove(i - 1);
        }
        System.out.println(shortSet.size());
    }
}