

import java.io.InputStream;
import java.io.StringReader;
import java.util.List;
import java.util.Map;

import Model.NLPDependencyParser;
import Model.NLPParseTreeResult;
import Model.Node;
import Model.NodeInfo;
import Model.ParseTreeNodeMapper;
import Model.SyntacticEvaluator;
import edu.stanford.nlp.ling.HasWord;
import edu.stanford.nlp.ling.TaggedWord;
import edu.stanford.nlp.parser.nndep.DependencyParser;
import edu.stanford.nlp.process.DocumentPreprocessor;
import edu.stanford.nlp.tagger.maxent.MaxentTagger;
import edu.stanford.nlp.trees.GrammaticalStructure;

public class Main {

	public static void main(String[] args) {

		String text = "Return authors who have more papers than Bob in VLDB after 2000";
	
		//NLP Component 1 Test
		NLPDependencyParser dp = new NLPDependencyParser(text);
		NLPParseTreeResult nlpresult = dp.parseText();
		System.out.println("");
		System.out.println("Text to translate : " + text);
		System.out.println("");
		System.out.println("NLP Parse Tree Component 1");
		System.out.println(nlpresult.getGs());
		
		//Parse Tree Component 2 Test
		ParseTreeNodeMapper parseTree = new ParseTreeNodeMapper(nlpresult.getTagged(), nlpresult.getSentence(), nlpresult.getGs());
		Node[] nodes = parseTree.getParseNodes();
		System.out.println("");
		System.out.println("Parse Tree Node Mapper Component 2");
		for (int i = 0; i < nodes.length; i++) {
			System.out.println("Nodes : " + nodes[i]);
		}
		


	}

}
