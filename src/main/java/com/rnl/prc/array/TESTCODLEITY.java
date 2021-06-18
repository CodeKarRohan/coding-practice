package com.rnl.prc.array;

/// NEXTTHINK STARTUP CHALLENGE
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class SoldProduct {
     public String name;
    BigDecimal price;
    String currency;


}

interface ExchangeService {
    Optional<BigDecimal> rate(String currency);
}

interface  EURExchangeService  extends ExchangeService{

}
class SoldProductsAggregate {
    List<SimpleSoldProduct> products;
    BigDecimal total;
}
class SimpleSoldProduct {
    String name;
    BigDecimal price;
}
class SoldProductsAggregator {

    private final EURExchangeService exchangeService;

    SoldProductsAggregator(EURExchangeService EURExchangeService) {
        this.exchangeService = EURExchangeService;
    }

    SoldProductsAggregate aggregate(Stream<SoldProduct> products) {


        List<SoldProduct> lis = new ArrayList<>();
        lis = products.collect(Collectors.toList());
        BigDecimal total = new BigDecimal("0");

        List<SimpleSoldProduct> simplProdLis = new ArrayList<>();
        for ( SoldProduct sp : lis){

            SimpleSoldProduct ssp = new SimpleSoldProduct();
            ssp.name =sp.name;
            Optional<BigDecimal> rate = this.exchangeService.rate(sp.currency);

            if (rate.isPresent()){

                if (rate.get().signum() == -1 || rate.get().signum() == 0)
                {
                    continue;
                }
                ssp.price = sp.price .multiply(rate.get());

            }
            else{
                continue;
            }
            total = total.add(ssp.price);
            simplProdLis.add(ssp);
        }


        SoldProductsAggregate res = new SoldProductsAggregate();
        res.products = simplProdLis;
        res.total = total;



        return null;
    }

}
public class TESTCODLEITY {
    public static int solution(int N) {
        // write your code in Java SE 8

        if (N == 0) {
            return 0;
        }

        String Ns = "" + N;

        if (!Ns.contains("5")) {
            return N;
        }


        if (N == 5 || N == -5) {
            return 0;
        }


        int freq = 0;
        for (char c : Ns.toCharArray()) {
            if (c == '5') freq++;
        }


        String res1 = "";
        String res2 = "";
        if (freq == 1) {
            res1 = Ns.replaceFirst("5", "");
            return Integer.parseInt(res1);
        } else {
            res1 = Ns.replaceFirst("5", "");
            int first = Ns.indexOf('5');
            String newstr = Ns.substring(0, first + 1);
            String newstr2 = Ns.substring(first + 1, Ns.length());
            newstr2 = newstr2.replaceFirst("5", "");
            res2 = newstr + newstr2;
            int n1 = Integer.parseInt(res1);
            int n2 = Integer.parseInt(res2);

            return (n1 >= n2) ? n1 : n2;
        }
    }
}
