package com.tiy.encrypt_decrypt;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static Scanner keyboard = new Scanner(System.in);

	static String wordEncryptedMenu = null;
	static String lineToEncrypt;
	static StringBuilder modify = new StringBuilder();
	static String fixConversion;
	static char conversion;

	static HashMap<String, String> encryptionKeyAndValue;
	static HashMap<String, String> decryptionKeyAndValue;

	static boolean stopRunning = true;

	public static void main(String[] args) {

		do {
			do {
				System.out.println("\nHello and welcome to the Encryption Decryption App\n");
				System.out.println("Main Menu\n");
				System.out.println("Would you like to encrypt a message? Press 1");
				System.out.println("Would you like to decrypt a message? Press 2");
				System.out.println("Press 3 to EXIT");

				wordEncryptedMenu = keyboard.nextLine();

				tryCatch(wordEncryptedMenu);

			} while (tryCatch(wordEncryptedMenu));

			switch (wordEncryptedMenu) {
			case "1":
				System.out.println("Enter:");
				lineToEncrypt = keyboard.nextLine();
				keyAndValueConversion();
				encryption(lineToEncrypt);
				stopRunning = false;
				break;
			case "2":
				System.out.println("Enter:");
				lineToEncrypt = keyboard.nextLine();
				keyAndValueUnconversion();
				decryption(lineToEncrypt);
				stopRunning = false;
				break;
			case "3":
				stopRunning = true;
				System.out.println("Thank you for using this app. Goodbye!");
				break;

			}
			
			modify.setLength(0);

		} while (!(stopRunning));

	}// main

	public static void keyAndValueConversion() {

		encryptionKeyAndValue = new HashMap<String, String>();

		encryptionKeyAndValue.put("a", "z");
		encryptionKeyAndValue.put("b", "y");
		encryptionKeyAndValue.put("c", "x");
		encryptionKeyAndValue.put("d", "w");
		encryptionKeyAndValue.put("e", "v");
		encryptionKeyAndValue.put("f", "u");
		encryptionKeyAndValue.put("g", "t");
		encryptionKeyAndValue.put("h", "s");
		encryptionKeyAndValue.put("i", "r");
		encryptionKeyAndValue.put("j", "q");
		encryptionKeyAndValue.put("k", "p");
		encryptionKeyAndValue.put("l", "o");
		encryptionKeyAndValue.put("m", "n");
		encryptionKeyAndValue.put("n", "m");
		encryptionKeyAndValue.put("o", "l");
		encryptionKeyAndValue.put("p", "k");
		encryptionKeyAndValue.put("q", "j");
		encryptionKeyAndValue.put("r", "i");
		encryptionKeyAndValue.put("s", "h");
		encryptionKeyAndValue.put("t", "g");
		encryptionKeyAndValue.put("u", "f");
		encryptionKeyAndValue.put("v", "e");
		encryptionKeyAndValue.put("w", "d");
		encryptionKeyAndValue.put("x", "c");
		encryptionKeyAndValue.put("y", "b");
		encryptionKeyAndValue.put("z", "a");
		encryptionKeyAndValue.put("A", "Z");
		encryptionKeyAndValue.put("B", "Y");
		encryptionKeyAndValue.put("C", "X");
		encryptionKeyAndValue.put("D", "W");
		encryptionKeyAndValue.put("E", "V");
		encryptionKeyAndValue.put("F", "U");
		encryptionKeyAndValue.put("G", "T");
		encryptionKeyAndValue.put("H", "S");
		encryptionKeyAndValue.put("I", "R");
		encryptionKeyAndValue.put("J", "Q");
		encryptionKeyAndValue.put("K", "p");
		encryptionKeyAndValue.put("L", "O");
		encryptionKeyAndValue.put("M", "N");
		encryptionKeyAndValue.put("N", "M");
		encryptionKeyAndValue.put("O", "L");
		encryptionKeyAndValue.put("P", "K");
		encryptionKeyAndValue.put("Q", "J");
		encryptionKeyAndValue.put("R", "I");
		encryptionKeyAndValue.put("S", "H");
		encryptionKeyAndValue.put("T", "G");
		encryptionKeyAndValue.put("U", "F");
		encryptionKeyAndValue.put("V", "E");
		encryptionKeyAndValue.put("W", "D");
		encryptionKeyAndValue.put("X", "C");
		encryptionKeyAndValue.put("Y", "B");
		encryptionKeyAndValue.put("Z", "A");
		encryptionKeyAndValue.put(" ", "$");
		encryptionKeyAndValue.put(".", "#");
		encryptionKeyAndValue.put("?", "%");
		encryptionKeyAndValue.put("!", "@");
		encryptionKeyAndValue.put(",", "^");

	}// keyAndValueConversion

	public static void encryption(String lineToEncrypt) {

		for (int i = 0; i < lineToEncrypt.length(); i++) {

			conversion = lineToEncrypt.charAt(i);
			fixConversion = Character.toString(conversion);
			modify.append(encryptionKeyAndValue.get(fixConversion));

		}
		// return modify;
		System.out.println(modify.toString());
		
		
		
	
	}// Encryption

	public static void keyAndValueUnconversion() {

		decryptionKeyAndValue = new HashMap<String, String>();

		decryptionKeyAndValue.put("z", "a");
		decryptionKeyAndValue.put("y", "b");
		decryptionKeyAndValue.put("x", "c");
		decryptionKeyAndValue.put("w", "d");
		decryptionKeyAndValue.put("v", "e");
		decryptionKeyAndValue.put("u", "f");
		decryptionKeyAndValue.put("t", "g");
		decryptionKeyAndValue.put("s", "h");
		decryptionKeyAndValue.put("r", "i");
		decryptionKeyAndValue.put("q", "j");
		decryptionKeyAndValue.put("p", "k");
		decryptionKeyAndValue.put("o", "l");
		decryptionKeyAndValue.put("n", "m");
		decryptionKeyAndValue.put("m", "n");
		decryptionKeyAndValue.put("l", "o");
		decryptionKeyAndValue.put("k", "p");
		decryptionKeyAndValue.put("j", "q");
		decryptionKeyAndValue.put("i", "r");
		decryptionKeyAndValue.put("h", "s");
		decryptionKeyAndValue.put("g", "t");
		decryptionKeyAndValue.put("f", "u");
		decryptionKeyAndValue.put("e", "v");
		decryptionKeyAndValue.put("d", "w");
		decryptionKeyAndValue.put("c", "x");
		decryptionKeyAndValue.put("b", "y");
		decryptionKeyAndValue.put("a", "z");
		decryptionKeyAndValue.put("Z", "A");
		decryptionKeyAndValue.put("Y", "B");
		decryptionKeyAndValue.put("X", "C");
		decryptionKeyAndValue.put("W", "D");
		decryptionKeyAndValue.put("V", "E");
		decryptionKeyAndValue.put("U", "F");
		decryptionKeyAndValue.put("T", "G");
		decryptionKeyAndValue.put("S", "H");
		decryptionKeyAndValue.put("R", "I");
		decryptionKeyAndValue.put("Q", "J");
		decryptionKeyAndValue.put("p", "K");
		decryptionKeyAndValue.put("O", "L");
		decryptionKeyAndValue.put("N", "M");
		decryptionKeyAndValue.put("M", "N");
		decryptionKeyAndValue.put("L", "O");
		decryptionKeyAndValue.put("K", "P");
		decryptionKeyAndValue.put("J", "Q");
		decryptionKeyAndValue.put("I", "R");
		decryptionKeyAndValue.put("H", "S");
		decryptionKeyAndValue.put("G", "T");
		decryptionKeyAndValue.put("F", "U");
		decryptionKeyAndValue.put("E", "V");
		decryptionKeyAndValue.put("D", "W");
		decryptionKeyAndValue.put("C", "X");
		decryptionKeyAndValue.put("B", "Y");
		decryptionKeyAndValue.put("A", "Z");
		decryptionKeyAndValue.put("$", " ");
		decryptionKeyAndValue.put("#", ".");
		decryptionKeyAndValue.put("%", "?");
		decryptionKeyAndValue.put("@", "!");
		decryptionKeyAndValue.put("^", ",");

	}// keyAndValueUnconversion

	public static void decryption(String lineToEncrypt) {

		for (int i = 0; i < lineToEncrypt.length(); i++) {

			conversion = lineToEncrypt.charAt(i);
			fixConversion = Character.toString(conversion);
			modify.append(decryptionKeyAndValue.get(fixConversion));

		}
		// return modify;
		
		System.out.println(modify.toString());
		
		
		
	}// decryption

	public static boolean tryCatch(String wordEncryptedMenu) {

		if (wordEncryptedMenu.equals("1") || wordEncryptedMenu.equals("2") || wordEncryptedMenu.equals("3"))

			try {
				int rightOrWrong = Integer.parseInt(wordEncryptedMenu);

				return false;

			} catch (ArrayIndexOutOfBoundsException e) { // can change Array...
															// just Exception to
				return true; // catch any
								// possible thrown.
				// System.out.println("You made an error!");
			}

		return false;
	}//tryCatch

}// class
