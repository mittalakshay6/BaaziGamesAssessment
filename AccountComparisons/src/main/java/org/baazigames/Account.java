package org.baazigames;

public class Account implements OnlineAccount, Comparable<Account> {
    private final int noOfRegularMovies;
    private final int noOfExclusiveMovies;
    private final String ownerName;

    public Account(int noOfRegularMovies, int noOfExclusiveMovies, String ownerName) {
        this.noOfRegularMovies = noOfRegularMovies;
        this.noOfExclusiveMovies = noOfExclusiveMovies;
        this.ownerName = ownerName;
    }

    public int monthlyCost() {
        return basePrice + (noOfRegularMovies * regularMoviePrice) + (noOfExclusiveMovies * exclusiveMoviePrice);
    }

    @Override
    public int compareTo(Account account) {
        return Integer.compare(this.monthlyCost(), account.monthlyCost());
    }

    @Override
    public String toString() {
        return "Owner is " + ownerName + " and monthly cost is " + monthlyCost() + " USD.";
    }
}
