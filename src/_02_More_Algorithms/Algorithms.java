package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int found = 0;;
		for (int x = 0; x<eggs.size(); x++) {
			if (eggs.get(x) == "cracked") {
				found = x;
				break;
			}
		}
		
		return found;
	}

	public static Object countPearls(List<Boolean> oysters) {
		int pearls = 0;
		for (int x = 0; x<oysters.size(); x++) {
			if (oysters.get(x) == true) {
				pearls++;
			}
		}
		return pearls;
	}

	public static double findTallest(List<Double> peeps) {
		double tallest = 0;
		for (int x = 0; x<peeps.size(); x++) {
			if (peeps.get(x)> tallest) {
				tallest = peeps.get(x); 
			}
		}
		return tallest;
	}

	public static Object findLongestWord(List<String> words) {
		int longest = 0;
		String word = "";
		for (int x = 0; x<words.size(); x++) {
			if (words.get(x).length() > longest) {
				longest = words.get(x).length();
				word = words.get(x);
			}
		}
		return word;
	}

	public static Object containsSOS(List<String> message1) {
		if (message1.contains("... --- ...")){
			return true;
		}
		else {
		return false;
		}
	}

	public static List<Double> sortScores(List<Double> results) {
		for (int x = 0; x < results.size() - 1; x++) {
			for (int y = 0; y < results.size() - 1; y++) {
				if (results.get(y) > results.get(y+1)) {
					double var = results.get(y);
					results.set(y, results.get(y+1));
					results.set(y+1, var);
				}
			}
		
		
	}
		return results;
	}

	public static List<String> sortDNA(List<String> unsortedSequences) {
		for (int x = 0; x < unsortedSequences.size() - 1; x++) {
			for (int y = 0; y < unsortedSequences.size() - 1; y++) {
				if (unsortedSequences.get(y).length() > unsortedSequences.get(y+1).length()) {
					String var = unsortedSequences.get(y);
					unsortedSequences.set(y, unsortedSequences.get(y+1));
					unsortedSequences.set(y+1, var);
				}
			}
		
		
	}
		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		for (int x = 0; x < words.size() - 1; x++) {
			for (int y = 0; y < words.size() - 1; y++) {
				if (words.get(y).compareTo(words.get(y+1)) > 0) {
					String var = words.get(y);
					words.set(y, words.get(y+1));
					words.set(y+1, var);
				}
			}
		
		
	}
		return words;
	}
} 
