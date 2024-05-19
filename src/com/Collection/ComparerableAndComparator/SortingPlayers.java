package com.Collection.ComparerableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingPlayers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Player> footballTeam = new ArrayList<>();
		Player player1 = new Player(59, "John", 20);
		Player player2 = new Player(67, "Roger", 22);
		Player player3 = new Player(45, "Steven", 21);
		footballTeam.add(player1);
		footballTeam.add(player2);
		footballTeam.add(player3);

		System.out.println("Before Sorting : ");
		footballTeam.forEach(System.out::println);

		Collections.sort(footballTeam);
		System.out.println("After Sorting : ");
		footballTeam.forEach(System.out::println);

	}

}
