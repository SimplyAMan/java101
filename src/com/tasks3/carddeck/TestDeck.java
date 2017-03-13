package com.tasks3.carddeck;

/**
 * Created by ahuryn on 12.03.2017.
 */
public class TestDeck {
    static public void main(String [] argv) {
        System.out.println("------------------------------------------------");
        System.out.println("--- constructor ---");
        Deck desk = new Deck();
        print(desk);

        System.out.println("------------------------------------------------");
        System.out.println("--- shuffle ---");
        desk = new Deck();
        desk.shuffle();
        print(desk);

        System.out.println("------------------------------------------------");
        System.out.println("--- order ---");
        desk = new Deck();
        desk.shuffle();
        desk.order();
        print(desk);

//        Card card = new Card(new Rank("Ace"),new Suit("HEARTS"));


    }

    static private void print(Deck d){
        Card card;
        int i = 0;
        while (d.hasNext()){
            card = d.drawOne();
            System.out.println(i + " " + card.getSuit().getName() + " " + card.getRank().getName());
            i++;
        }
    }
}
