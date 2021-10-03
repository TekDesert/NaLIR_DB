package Model;

import java.io.StringReader;
import java.util.List;

import edu.stanford.nlp.ling.HasWord;
import edu.stanford.nlp.ling.TaggedWord;
import edu.stanford.nlp.parser.nndep.DependencyParser;
import edu.stanford.nlp.process.DocumentPreprocessor;
import edu.stanford.nlp.tagger.maxent.MaxentTagger;
import edu.stanford.nlp.trees.GrammaticalStructure;

public class NLPDependencyParser {
	
	private String text;

	public NLPDependencyParser(String text) {
		super();
		this.text = text;
	}

	public void parseText() {
		/*

		try{
	        MaxentTagger file = new MaxentTagger("./english-left3words-distsim.tagger");
	        System.out.println("File OK");
	    } catch(Exception e) {
	        System.out.println("File ERROR");
	    }

	    try{
	        InputStream stream = this.class.getResourceAsStream("/edu/stanford/nlp/models/pos-tagger/english-left3words/english-left3words-distsim.tagger");
	        stream.read();
	        stream.close();
	        System.out.println("Stream with slash OK");
	    } catch(Exception e) {
	        System.out.println("Stream with slash ERROR");
	    }

	    try{
	        InputStream stream = TestMain.class.getResourceAsStream("edu/stanford/nlp/models/pos-tagger/english-left3words/english-left3words-distsim.tagger");
	        stream.read();
	        stream.close();
	        System.out.println("Stream without slash OK");
	    } catch(Exception e) {
	        System.out.println("Stream without slash ERROR");
	    }

	    try{
	        MaxentTagger classpathWithSlash = new MaxentTagger("/edu/stanford/nlp/models/pos-tagger/english-left3words/english-left3words-distsim.tagger");
	        System.out.println("Classpath with slash OK");
	    } catch(Exception e) {
	        System.out.println("Classpath with slash ERROR");
	    }

	    try{
	        MaxentTagger classpathWithoutSlash = new MaxentTagger("edu/stanford/nlp/models/pos-tagger/english-left3words/english-left3words-distsim.tagger");
	        System.out.println("Classpath without slash OK");
	    } catch(Exception e) {
	        System.out.println("Classpath without slash ERROR");
	    }
	    
		*/
		
		String modelPath = DependencyParser.DEFAULT_MODEL;
		String taggerPath = "edu/stanford/nlp/models/pos-tagger/english-left3words/english-left3words-distsim.tagger";
		//String taggerPath = "models/english-left3words-distsim.tagger";

		String text = "Return authors who have more papers than Bob in VLDB after 2000";

		MaxentTagger tagger;
		tagger = new MaxentTagger(taggerPath);
		DependencyParser parser = DependencyParser.loadFromModelFile(modelPath);

		DocumentPreprocessor tokenizer = new DocumentPreprocessor(new StringReader(this.text));
		for (List<HasWord> sentence : tokenizer) {
			List<TaggedWord> tagged = tagger.tagSentence(sentence);
			GrammaticalStructure gs = parser.predict(tagged);

			// Print typed dependencies
			System.out.println("Here");
			System.out.println(gs);
		}
		
	}
	
	

}
