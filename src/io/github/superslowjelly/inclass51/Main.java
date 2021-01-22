package io.github.superslowjelly.inclass51;

public class Main {

    public static void main(String[] args) {

        // Set locations.
        final double X = -1,
                Y = 0,
                Z = 0;

        // Instantiate players & set player names.
        Player[] players = {
                new Player("Jeremiah"),
                new Player("Sarah"),
                new Player("Jim")
        };

        // Set player locations.
        players[0].setLocation(4, 3, 1); // All coordinates in range.
        players[1].setLocation(2, 3, 6); // One coordinate out of range.
        players[2].setLocation(6, 6, 6); // All coordinates out of range.

        // Build output.
        StringBuilder output = new StringBuilder("Flag:\n").append("\t- Location: ").append(X).append("x, ").append(Y).append("y, ").append(Z).append("z");
        for (int i = 0; i < players.length; i++) {
            Player player = players[i];
            output.append("\n\nPlayer ").append(i + 1).append(":")
                    .append("\n\t- Name: ").append(player.getName())
                    .append("\n\t- Location: ").append(player.getLocation())
                    .append("\n\t- Is near the flag? ").append(player.isNearby(X, Y, Z));
        }
        System.out.print(output);
    }

}
