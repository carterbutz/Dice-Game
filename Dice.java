
	//Objective: Dice game - 10 rounds between user and computer.

import java.util.* {
	public class Dice {
		public static void main(String[] args) {
			int totalTurns = 10;
			int compDice, userDice;
			int compScore = 0;
			int userScore = 0;

			Random rand = new Random ();
		for (int i = 1; i <= totalTurns; i++) {
			compDice = rand.nextInt(6) + 1;
			userDice = rand.nextInt(6) + 1;

		if (compDice > userDice) {
			compScore = compScore + 1;
			System.out.print("Round: " + i + "The computer has won this round.");
		}
			else if (userDice > compDice) {
				userScore = userScore + 1;
				System.out.print("Round: " + i + "The user has won this round.");
		}
			else {
				System.out.print("Round: " + i + "was a tie!");

		if (compScore > userScore) {
			System.out.print("The computer has won the game, it won: " + compScore + "of" + totalTurns + "rounds.")
		}
			else if (userScore > compScore){
				System.out.print("The user has won the game, you won: " + userScore + "of" + totalTurns + "rounds.")
			}
			else (compScore == userScore) {
				System.out.print("It ends in a tie!")
			}
		}
			}
			}
		}

		}


		}

	}
}