class Solution {
    public boolean judgeCircle(String moves) {
        // 1. Start at coordinates (0,0)
        int x = 0;
        int y = 0;

        // 2. Loop through every character in the "moves" string
        for (int i = 0; i < moves.length(); i++) {
            char move = moves.charAt(i);

            // 3. Update position based on the letter
            if (move == 'U') {
                y++; // Up increases Y
            } else if (move == 'D') {
                y--; // Down decreases Y
            } else if (move == 'L') {
                x--; // Left decreases X
            } else if (move == 'R') {
                x++; // Right increases X
            }
        }

        // 4. If both x and y are back to 0, we are at the origin!
        return (x == 0 && y == 0);
    }
}
