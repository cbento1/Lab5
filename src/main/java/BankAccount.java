import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */


    private enum BankAccountType {
        /**
         *
         */
        CHECKINGS,
        /**
         *
         */
        SAVINGS,
        /**
         *
         */
        STUDENT,
        /**
         *
         */
        WORKPLACE
    }

    /**
     *
     */
    private static Random rnd = new Random();
    /**
     *
     */
    private int accountNumber;
    /**
     *
     */
    private BankAccountType accountType;
    /**
     *
     */
    private double accountBalance;
    /**
     *
     */
    private String ownerName;
    /**
     *
     */
    private double interestRate;
    /**
     *
     */
    private double interestEarned;

    /**
     *
     * @param name .
     * @param accountCategory .
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {

        this.ownerName = name;
        this.accountType = accountCategory;

        this.accountNumber = 0;
        this.accountBalance = 0.0;
        this.interestRate = 0.0;
        this.interestEarned = 0.0;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */

    /**
     *
     * @return .
     */
    public int getAccountNumber() {
        return this.accountNumber;
    }

    /**
     *
     * @return .
     */
    public BankAccountType getBankAccountType() {
        return this.accountType;
    }

    /**
     *
     * @return .
     */
    public double getAccountBalance() {
        return this.accountBalance;
    }

    /**
     *
     * @return .
     */
    public String getOwnerName() {
        return this.ownerName;
    }

    /**
     *
     * @return .
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     *
     * @return .
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     *
     * @param inputNumber .
     */
    public void setAccountNumber(final int inputNumber) {
        this.accountNumber = inputNumber;
    }

    /**
     *
     */
    public void setAccountNumber() {
        this.accountNumber = rnd.nextInt();
    }
    /**
     *
     * @param inputType .
     */
    public void setAccountType(final BankAccountType inputType) {
        this.accountType = inputType;
    }

    /**
     *
     * @param inputBalance .
     */
    public void setAccountBalance(final double inputBalance) {
        this.accountBalance = inputBalance;
    }

    /**
     *
     * @param inputOwner .
     */
    public void setOwnerName(final String inputOwner) {
        this.ownerName = inputOwner;
    }

    /**
     *
     * @param inputRate .
     */
    public void setInterestRate(final double inputRate) {
        this.interestRate = inputRate;
    }

    /**
     *
     * @param inputEarned .
     */
    public void setInterestEarned(final double inputEarned) {
        this.interestEarned = inputEarned;
    }




}
