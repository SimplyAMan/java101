package com.tasks3.carddeck;

/**
 * Created by ahuryn on 12.03.2017.
 */
public class TestDeck {
    static public void main(String [] argv) {
        Deck desk = new Deck();

        Card card;
        while (desk.hasNext()){
            card = desk.drawOne();
            System.out.println(card.getSuit().getName() + " " + card.getRank().getName());
        }

        System.out.println("------------------------------------------------");
        desk = new Deck();
        System.out.println("has next - " + desk.hasNext());
        desk.order();
        System.out.println("has next - " + desk.hasNext());
        while (desk.hasNext()){
            card = desk.drawOne();
            System.out.println(card.getSuit().getName() + " " + card.getRank().getName());
        }
    }
}
