package untestableLegacy;

import java.security.InvalidParameterException;
import java.util.function.Function;

public class Encryptor {

	public String cryptWord(String word) {
		validateWord(word);
		return cryptToChars(word);
	}

	public String cryptWordToNumbers(String word) {
		validateWord(word);
		return encrypt(word, charValue1 -> String.valueOf((charValue1 + 2)));
	}

	public String cryptToChars(String sentence) {
		return encrypt(sentence, charValue1 -> String.valueOf((char) (charValue1 + 2)));
	}

	public String cryptWord(String word, String charsToReplace) {
		validateWord(word);
		return encryptAndReplace(word, charsToReplace);
	}

	public void printWords(String sentence)
	{
		wrapperOutputBetweenArrows(sentence);
	}

	private void validateWord(String word) {
		if (word.contains(" "))
			throw new InvalidParameterException();
	}

	private String encryptAndReplace(String word, String charsToReplace) {
		char[] wordArray = word.toCharArray();
		char[] replacement = charsToReplace.toCharArray();
		char[] result = wordArray.clone();
		for (int i = 0; i < wordArray.length; i++)
		{
			for (char c : replacement) {
				if (c == wordArray[i]) {
					int charValue = wordArray[i];
					result[i] = (char) (charValue + 2);
				}
			}
		}
		return String.valueOf(result);
	}

	private String encrypt(String sentence, Function<Integer, String> encryptionStrategy) {
		char[] sentenceArray = sentence.toCharArray();
		String newWord = "";
		for (int i = 0; i < sentence.length(); i++) {
			int charValue = sentenceArray[i];
			newWord += encryptionStrategy.apply(charValue);
		}
		return newWord;
	}

	private void wrapperOutputBetweenArrows(String sentence) {
		String[] words = sentence.split(" ");
		for (String word : words)
		{
			System.out.print("<" + word + ">");
		}
	}

}
