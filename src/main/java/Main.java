

import java.io.InputStream;
import java.io.StringReader;
import java.util.List;

import Model.NLPDependencyParser;
import edu.stanford.nlp.ling.HasWord;
import edu.stanford.nlp.ling.TaggedWord;
import edu.stanford.nlp.parser.nndep.DependencyParser;
import edu.stanford.nlp.process.DocumentPreprocessor;
import edu.stanford.nlp.tagger.maxent.MaxentTagger;
import edu.stanford.nlp.trees.GrammaticalStructure;

public class Main {

	public static void main(String[] args) {

		NLPDependencyParser dp = new NLPDependencyParser("Return authors who have more papers than Bob in VLDB after 2000");
		dp.parseText();
		


	}

}
