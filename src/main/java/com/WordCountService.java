package com;

public class WordCountService {

	public int LetterCount(String x) {
		char[] ch = x.toCharArray();
		int letter = 0;
		for (int i = 0; i < x.length(); i++) {
			if (Character.isLetter(ch[i])) {
				letter++;
			}
		}
		return letter;

	}

	public int NumberCount(String x) {
		char[] ch = x.toCharArray();
		int num = 0;
		for (int i = 0; i < x.length(); i++) {
			if (Character.isDigit(ch[i])) {
				num++;
			}
		}
		return num;

	}

	public int SpaceCount(String x) {
		char[] ch = x.toCharArray();
		int space = 0;
		for (int i = 0; i < x.length(); i++) {
			if (Character.isSpaceChar(ch[i])) {
				space++;
			}
		}
		return space;

	}

}
