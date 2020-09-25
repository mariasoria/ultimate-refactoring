package untestableLegacy;

import java.security.InvalidParameterException;
import java.util.function.Function;

public class Encryptor {

	private void findSpacesThrowException(String word) {
		if (word.contains(" "))
			throw new InvalidParameterException();
	}

	private String toCesarEncryptionAndReplace(String word, String charsToReplace) {
		char[] wordArray = word.toCharArray();
		char[] replacement = charsToReplace.toCharArray();
		char[] result = wordArray.clone();
		for (int i = 0; i < wordArray.length; i++)
		{
			for (int j = 0; j < replacement.length; j++)
			{
				if (replacement[j] == wordArray[i])
				{
					int charValue = wordArray[i];
					result[i] = (char)( charValue + 2);
				}
			}
		}
		return String.valueOf(result);
	}

	private String toCesarEncryption(String sentence, Function<Integer, String> functionToTransform) {
		char[] sentenceArray = sentence.toCharArray();
		String newWord = "";
		for (int i = 0; i < sentence.length(); i++) {
			int charValue = sentenceArray[i];
			newWord += functionToTransform.apply(charValue);
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

	private Function<Integer, String> toNumberValue() {
		return charValue1 -> String.valueOf((charValue1 + 2));
	}

	private Function<Integer, String> toCharValue() {
		return charValue1 -> String.valueOf((char) (charValue1 + 2));
	}

	public String cryptWord(String word) {
		findSpacesThrowException(word);
		return toCesarEncryption(word, toCharValue());
	}

	public String cryptWordToNumbers(String word) {
		findSpacesThrowException(word);
		return toCesarEncryption(word, toNumberValue());
	}

	public String cryptWord(String word, String charsToReplace) {
		findSpacesThrowException(word);
		return toCesarEncryptionAndReplace(word, charsToReplace);
	}

	public String cryptSentence(String sentence) {
		return toCesarEncryption(sentence, toCharValue());
	}

	public void printWords(String sentence)
	{
		wrapperOutputBetweenArrows(sentence);
	}

}
