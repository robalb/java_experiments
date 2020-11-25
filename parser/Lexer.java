import java.util.*;

/*
 * perform lexycal analysis
 *
  identifier, //variables or constants
  keyword, //reserved names
  round_br,
  square_br,
  curly_br,
  operator,
  literal,
  comment,
  separator
 */
public class Lexer{
  private long position;
  private long lastTokenPosition;
  private String input;
  public ArrayList<Token> tokenize(String input){

    this.position = 0;
    this.lastTokenPosition = 0;
    this.input = input;
    //declare array of ?statemachines? or wathever
    while(position < input.length()){
      //update state machines. when they reach a no-match, the should enter the state ->just_closed. in the following iterations it will remain->closed
      //when all the state machines are just_closed or closed
      //  instead of iterating again, call the evaluator for the keyword associated to the statemachine that is just_closed (possible cases for multiple just_closed)
      //  reset the statemachine thing, update lastTokenPosition to position and start again
      position++;
    }
    //iterate every token-thingy in the structure-yet-to-define-thing and advance them by one step.
    //when one of them returns NO_MATCH stop calling it in the iteration loop
    //when the last of them return NO_MATCH 
    //  - if it was the last keyword iterating in the list: IT'S A MATCH
    //  -if multiple matches completed at the same time: wtf_think_about_this_case
    //
    //IT'S A MATCH: call the evaluator associated to that keyword, that will push the keyword+optionalValue to the stack.
    //      reset the list of updating Tokens machines
    //      reset the lastTokenPosition

    ArrayList<Token> tokenizedInput = new ArrayList<Token>(); //access using get(index)
    tokenizedInput.add(new Token(Tokens.keyword, "log"));

    return tokenizedInput;
  }
  // private void scan(String[]input){
  // }
  // private void evaluate(String[] defineThisThing){
  // }
}

