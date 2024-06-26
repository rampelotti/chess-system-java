package application;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		List<ChessPiece> captured = new ArrayList<>();
		
		while(!chessMatch.getCheckMate()) {
			try {
				UI.clearScreen(); // limpar tela cada vez q voltar no while
				UI.printMatch(chessMatch, captured);
				System.out.println();
				System.out.print("Origem: ");
				ChessPosition source = UI.readChessPosition(sc);
				
				boolean[][] possibleMoves = chessMatch.possibleMoves(source);
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces(), possibleMoves);
				
				
				System.out.println();
				System.out.print("Destino: ");
				ChessPosition target = UI.readChessPosition(sc);
				
				ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
				if(captured != null) {
					captured.add(capturedPiece);
				}
				
				if(chessMatch.getPromoted() != null) {
				System.out.print("Coloque a peça que deseja(B,N,Q,R): ");
				String type = sc.nextLine().toUpperCase();
				while(!type.equals("B") && !type.equals("N") && !type.equals("R") && !type.equals("Q")){
					System.out.print("Valor invalido! Coloque a peça que deseja(B,N,Q,R): ");
					type = sc.nextLine().toUpperCase();
				}
				
				chessMatch.replacePromotedPiece(type);
				}
			}
			
			catch(ChessException e){
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			catch(InputMismatchException e){
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
		UI.clearScreen();
		UI.printMatch(chessMatch, captured);
		
		
	}

}
