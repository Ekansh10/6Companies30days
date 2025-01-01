class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> players = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            players.add(i);
        }

        int idx = 0; 
        while (players.size() > 1) {
            idx = (idx + k - 1) % players.size(); 
            players.remove(idx); 
        }

        return players.get(0);
    }
}
