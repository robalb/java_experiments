import java.util.*;


public class Main{
  public static void main(String args[]){
    /* NOTES
     * https://en.wikipedia.org/wiki/Parsing#Parser
     *
     * LEXICAL ANALYSIS
     * https://en.wikipedia.org/wiki/Lexical_analysis
     * https://en.wikipedia.org/wiki/Lexical_grammar
     * two stages: 
     * - scanning: segments input string into lexenes and cathegorizes these into token classes
     * - evaluatong: lexenes are converted into processed values
     *
     *
     * https://en.wikipedia.org/wiki/Symbol_table
     */

    String program = "12 + (1 - 3) /* a comment */";
    double b =  .+a           ;

    System.out.println(b);

    Lexer lexer = new Lexer();
    ArrayList<Token> a = lexer.tokenize(program);
    System.out.println(a.get(0).value());


    // Hashtable<String, Integer> symbols = new Hashtable<String, Integer>(); 
    // symbols.put("(", 12);
    // System.out.println(symbols.get("(a"));




    System.out.println("goodbie");
  }
}
