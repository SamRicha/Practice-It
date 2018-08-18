/*
 *  Write a function called rockPaperScissors that takes two parameters: a string representing a first 
 *  player's move in a game of Rock-Paper-Scissors and a string representing a second player's move. 
 *  Depending on each player's move, the function should output to the console the winner of the round 
 *  if there was a winner, a tie if both players had the same move, or whether a player gave an invalid 
 *  move. When comparing moves, letter-casing does not matter ("rock" should be considered the same move as "rOcK").
 *  
 *  The two-player game of Rock-Paper-Scissors works as following:
 *  
 *  Each player chooses one of three moves: "rock", "paper", or "scissors"
 *  A move of "rock" wins over another player's move of "scissors"
 *  A move of "scissors" wins over another player's move of "paper"
 *  A move of "paper" wins over another player's move of "rock"
 *  If two players use the same move, the result is a tie
 *  For example, a call of rockPaperScissors("rock", "scissors") would result in console 
 *  output of "Player 1 wins!". A call of rockPaperScissors("ROCK", "Paper") would result in console 
 *  output of "Player 2 wins!". A call of rockPaperScissors("SCISSORS", "Scissors") would result in 
 *  console output of "TIE!". If one player gives a move other than "rock", "paper", or "scissors", 
 *  the console output should be "Invalid move of [player's invalid move]!", where you should replace 
 *  [player's invalid move] with the exact value passed by that player. If both players pass invalid moves, 
 *  the console output should be "Invalid moves of [player 1's invalid move] and [player 2's invalid move]!".
 */

function rockPaperScissors(player1, player2){
    var player1Victory = "Player 1 wins!";
    var player2Victory = "Player 2 wins!";
    player1 = player1.toLowerCase();
    player2 = player2.toLowerCase();
    
    if(player1 === "rock" && player2 === "scissors"){
        console.log(player1Victory);
    }else if(player1 === "rock" && player2 === "paper"){
        console.log(player2Victory);
    }else if(player1 === "scissors" && player2 === "paper"){
        console.log(player1Victory);
    }else if(player1 === "scissors" && player2 === "rock"){
        console.log(player2Victory);
    }else if(player1 === "paper" && player2 === "rock"){
        console.log(player1Victory);
    }else if(player1 === "paper" && player2 ==="scissors"){
        console.log(player2Victory);
    }else if(player1 === "paper" && player2 === "paper" || player1 === "rock" &&
             player2 === "rock" || player1 === "scissors" && player2 === "scissors"){
        console.log("TIE!");
    }else if(player1 != "paper" && player1 != "rock" && player1 != "scissors"  && player2 === "rock"){
        console.log("Invalid move of " + player1 +"!");
    }else if(player1 != "paper" && player1 != "rock" && player1 != "scissors"  && player2 === "paper"){
        console.log("Invalid move of " + player1 +"!");
    }else if(player1 != "paper" && player1 != "rock" && player1 != "scissors"  && player2 === "scissors"){
        console.log("Invalid move of " + player1 +"!");
    }else if(player2 != "paper" && player2 != "rock" && player2 != "scissors" && player1 === "rock"){
        console.log("Invalid move of " + player2 +"!");
    }else if(player2 != "paper" && player2 != "rock" && player2 != "scissors" && player1 === "paper"){
        console.log("Invalid move of " + player2 +"!");
    }else if(player2 != "paper" && player2 != "rock" && player2 != "scissors" && player1 === "scissors"){
        console.log("Invalid move of " + player2 +"!");
    }else if(player2 != "paper" && player2 != "rock" && player2 != "scissors" 
             && player1 != "paper" && player1 != "rock" && player1 != "scissors"){
        console.log("Invalid moves of " + player1 + " and " + player2 +"!");
    }
}
