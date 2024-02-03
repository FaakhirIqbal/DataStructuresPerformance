package document;

import java.util.List;

/**
 * A naive implementation of the Document abstract class.
 */
public class BasicDocument extends Document {
    /**
     * Create a new BasicDocument object
     *
     * @param text The full text of the Document.
     */
    public BasicDocument(String text) {
        super(text);
    }

    /**
     * Get the number of words in the document.
     * "Words" are defined as contiguous strings of alphabetic characters
     * i.e. any upper or lower case characters a-z or A-Z
     *
     * @return The number of words in the document.
     */
    @Override
    public int getNumWords() {
        List<String> tokens = getTokens("[a-zA-Z]+");
        return tokens.size();
    }

    /**
     * Get the number of sentences in the document.
     * Sentences are defined as contiguous strings of characters ending in an
     * end of sentence punctuation (. ! or ?) or the last contiguous set of
     * characters in the document, even if they don't end with a punctuation mark.
     *
     * @return The number of sentences in the document.
     */
    @Override
    public int getNumSentences() {
        List<String> tokens = getTokens("[^!?.]+");
        return tokens.size();
    }

/**
 * Get the number of sentences in the document.
