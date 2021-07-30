README

- LEGEND
	🛠	- In progress
	✔	- Done
	🚧	- Blocked

- LINK
https://en.wikipedia.org/wiki/Tic-tac-toe

- REQUIREMENT
TicTacToe is Game for two Players, X and O, who take Turns Marking the Fields on a 3×3 Board.
The Player who succeeds in placing three of their Marks in a Diagonal, Horizontal, or Vertical Row is the Winner.
If all the Fields are filled and there's no Winner, the Game is a Draw. 

- ARCHITECTURE
	OO solution
	BOARD
		has	fields
			nextPlayer
		can display
			mark
			checkWinner
			

- BACKLOG
	- create Board
	
- TEST CASES
	- an empty board should have all fields empty		✔
	- an empty board should have next player = X		✔
	- empty board should be displayed properly			✔
	
	- after the first mark the board should have 1 X 				✔
	- after the first mark the board should have 8 blanks			✔
	- next player = O												✔
	
	- after the second mark the board should have 1 O 				✔
	- after the first mark the board should have 1 X				✔
	- after the first mark the board should have 7 blanks			✔
	- next player = X												✔
	
	- test display													✔
	
	- check game in progress										✔
	- check horizontal winner										✔
	- check vertical winner											✔
	
	
	
	
					
	
	
	