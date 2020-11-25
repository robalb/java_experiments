
public class Token{
  private Tokens type;

  private String value;

  private boolean hasValue;

  public Token(Tokens tokenType){
    this.type = tokenType;
    this.hasValue = false;
    this.value = "";
  }

  public Token(Tokens tokenType, String value){
    this.hasValue = true;
    this.value = value;
  }

  public String value(){
    if(this.hasValue) return this.value;
    throw new RuntimeException("trying to access an inexisting token value");
  }

  public boolean hasValue(){
    return this.hasValue;
  }

  public String test(){
    if( this.type == Tokens.identifier ){
      return "identifier";
    }
    return "not an identifier";
  }
}
