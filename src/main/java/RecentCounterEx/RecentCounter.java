package RecentCounterEx;

public class RecentCounter {
    public static void main(String[] args) {

    }

    public int ping(int t) {
        int count = 0;
        if (t < 3000)
            count = 0;
        else {
            count = ping(t - 3000) + ping(t);
        }
        return count;
    }
}
