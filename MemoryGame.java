// ELI^2 Memory Game
// Hooray!!!
// Wilton Aviles, Tyler Harkcom, Kaarthik Alagappan, Michael McGarty, Mitchell Hunsucker


// Randomly generate the integers corresponding to board positions
// A1 - 6
// A2 - 2
// B1 - 3
// B2 - 1
// C1 - 4
// C2 - 5

// Board positions, 1 through 6
// +------+------+------+
// |  B2  |  A2  |  B1  |
// +------+------+------+
// |  C1  |  C2  |  A1  |
// +------+------+------+

// 30 wide, 15 tall

// |<-------------- 30 --------------->|

// +-----+-----+-----+-----+-----+-----+			---
// |  0  |  1  |  2  |  3  |  4  |  5  |  		 ^
// +-----+-----+-----+-----+-----+-----+			 |
// |  6  |  7  |  8  |  9  |  10 |  11 |  		 15
// +-----+-----+-----+-----+-----+-----+		   |
// |  12 |  13 |  14 |  15 |  16 |  17 |  	 	 V
// +-----+-----+-----+-----+-----+-----+      ---

// Method to determine the 2d vector point for a card object.
import java.io.*;
import java.util.*;
import javafx.*;
import java.lang.Object.*;
import math.geom2d.Vector2D;
import javax.vecmath.Vector2d;

class Card
{
	float x; // x-coordinate
	float y; // y-coordinate
	float width;
	float height;
	float type; // 1, 2, 3, 4.
	boolean flipped, matched;

	// Constructor that only takes dimensions and types.
	Card(int w, int h, int type)
	{
		this.width = w;
		this.height = h;
		this.type = type;
	}

	// Constructor that takes dimensions, coordinates, and types.
	Card(int w, int h, int x, int y, int type)
	{
		this.width = w;
		this.height = h;
		this.x = x;
		this.y = y;
		this.type = type;
	}

	public Vector2D getCenter(Card card)
	{
		Vector2D center = new Vector2D(card.height / 2, card.width / 2);
			return center;
	}
}

class Board
{
	int width;
	int height;
}

// Method to populate the board, randomizing their x and y coordinates.
// Find randomization of card positions.
// Method to check whether two cards are "equal".
// Remove cards from the game board.

public class MemoryGame
{
	public static void main(String [] args)
	{
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		System.out.println("Resolution: " + Toolkit.getDefaultToolkit().getScreenResolution());
		System.out.println("Width:" + width + " " + "Height:" + height);
	}
}
