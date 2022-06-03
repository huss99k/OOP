public interface BaseInterestRate{

  public final double BASE_INTEREST_RATE =2.5;
    //sjhcsjcs

    public default double getBaseInterestRate(){
     return BASE_INTEREST_RATE;
  }

  public abstract double setInterestRate();
}