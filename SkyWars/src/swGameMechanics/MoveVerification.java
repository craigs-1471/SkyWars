package swGameMechanics;

import java.util.ArrayList;

public class MoveVerification {
	
	public static boolean isMovePossible(int currentLocation, ArrayList<Integer> moves) {
		
		for(int i = 0; i < moves.size(); i++) {
			if(currentLocation == moves.get(i)) {
				return true;
			}
		}
		return false;
	}
}
