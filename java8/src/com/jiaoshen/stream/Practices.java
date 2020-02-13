package com.jiaoshen.stream;

import com.jiaoshen.pojo.Trader;
import com.jiaoshen.pojo.Transaction;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author jiaoshen
 * @date 2020/1/29-20:42
 */
public class Practices {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
        List<Transaction> tr2011 =  transactions.stream().filter(a->a.getYear().equals(2011))
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
        //System.out.println("tr2011"+tr2011);

        // Query 2: What are all the unique cities where the traders work?
        List<String> workCitys = transactions.stream().map(t->t.getTrader().getCity()).distinct().collect(Collectors.toList());
        //System.out.println("workCitys"+workCitys);

        // Query 3: Find all traders from Cambridge and sort them by name.
        List<Trader> cambridgeTraders = transactions.stream().map(Transaction::getTrader)
                .filter(a->"Cambridge".equals(a.getCity()))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
        //System.out.println("cambridgeTraders"+cambridgeTraders);

        // Query 4: Return a string of all traders’ names sorted alphabetically.
        List<String> tradersTraders = transactions.stream().map(Transaction::getTrader)
                .distinct().map(Trader::getName)
                .sorted()
                .collect(Collectors.toList());

        // Query 5: Are there any trader based in Milan?
         boolean hasMilanTraders = transactions.stream().map(Transaction::getTrader)
                .distinct().anyMatch(trader -> trader.getCity().equals("Milan"));
         System.out.println("hasMilanTraders: "+hasMilanTraders);

        // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.



        // Query 7: What's the highest value in all the transactions?

    }
}
