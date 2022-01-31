package Dec.day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer offer1 = new Offer();

        offer1.setInfo("Houston" , "Amazon", "SDET",110000,true,true,true,true);

       // System.out.println(offer1);

        Offer offer2 = new Offer();
        offer2.setInfo("VA", "Sony", "QA", 120000, true, false, false, true);
      //  System.out.println(offer2);

        Offer offer3 = new Offer();

        offer3.setInfo("CA" , "Apple", "SDET",100000,true,false,true,false);

        Offer offer4 = new Offer();

        offer4.setInfo("DC" , "BOA", "SDET",90000,false,true,false,true);

        Offer offer5 = new Offer();

        offer5.setInfo("TX" , "BMI", "BA",100000,true,false,false,true);

       /* System.out.println(offer3);

        System.out.println(offer4);

        System.out.println(offer5);

        */

        Offer [] myOffers = {offer1,offer2,offer3,offer4,offer5};

        ArrayList<Offer> list = new ArrayList<>(Arrays.asList(myOffers));
        System.out.println(list);

        list.removeIf( p -> !p.isFullTime); // removes if the offer is not full time

        System.out.println(list.size());

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf( p -> !( p.location.equals("VA") || p.location.equals("CA") ) ); // removes the offer if the offer is not from local area

        System.out.println(localOffers.size());


        for (Offer localOffer : localOffers) {
            System.out.println(localOffer.companyName + " : " +localOffer.salary);
        }


    }
}
