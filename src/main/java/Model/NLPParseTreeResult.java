package Model;

import java.util.List;

import edu.stanford.nlp.ling.HasWord;
import edu.stanford.nlp.ling.TaggedWord;
import edu.stanford.nlp.trees.GrammaticalStructure;

public class NLPParseTreeResult {
	
	List<TaggedWord> tagged;
	List<HasWord> sentence;
	GrammaticalStructure gs;
	
	public NLPParseTreeResult(List<TaggedWord> tagged, List<HasWord> sentence, GrammaticalStructure gs) {
		super();
		this.tagged = tagged;
		this.sentence = sentence;
		this.gs = gs;
	}

	public List<TaggedWord> getTagged() {
		return tagged;
	}

	public void setTagged(List<TaggedWord> tagged) {
		this.tagged = tagged;
	}

	public List<HasWord> getSentence() {
		return sentence;
	}

	public void setSentence(List<HasWord> sentence) {
		this.sentence = sentence;
	}

	public GrammaticalStructure getGs() {
		return gs;
	}

	public void setGs(GrammaticalStructure gs) {
		this.gs = gs;
	}
	
	
	
	

}
