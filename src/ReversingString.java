/*
 * Copyright 2013 Rodolfo Santander
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.util.Scanner;


public class ReversingString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word = new String("");
//		String word = new String("this is a text");
		System.out.print("Enter a word: ");
		word = in.nextLine();
		
		System.out.println(reversingStringCharacter(word));
		System.out.println(reversingWords(word));
		System.out.println(reversingCharacterInWords(word));
	}
	
	public static String reversingStringCharacter(String word) {
		// "this is text" -> "txet si siht"
		String[] arrayWord = new String[word.length()];
		String newWord = new String("");
		
		for (int i = 1; i <= word.length(); i++)
			arrayWord[arrayWord.length - i] = word.substring(i - 1, i);
		
		for (int i = 0; i < arrayWord.length; i++)
			newWord += arrayWord[i];
		
		return newWord;
	}
	
	public static String reversingWords(String word) {
		// "this is text" -> "text is this"
		String[] items = word.split(" ");
		String[] aux = new String[items.length];
		String newWord = new String("");
		
		for (int i = 1; i <= items.length; i++)
			aux[items.length - i] = items[i - 1];
		
		for (String s: aux)
			newWord += s + " ";
		
		return newWord;
	}
	
	public static String reversingCharacterInWords(String word) {
		// "this is text" -> "siht si txet"
		String[] items = word.split(" ");
		String[] aux = new String[items.length];
		String[] b = null;
		String newWord = new String("");
		String a = new String("");		
		int x = 0;
		
		for (String s: items) {
			b = new String[s.length()];
			a = "";
			for (int i = 1; i <= s.length(); i++)
				b[b.length - i] = s.substring(i - 1, i);
			
			for (String s2: b)
				a += s2;
			
			aux[x] = a;
			x++;
		}
			
			for (String s: aux)
				newWord += s + " ";
		
		return newWord;
	}
}