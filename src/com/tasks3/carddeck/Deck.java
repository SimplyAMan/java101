package com.tasks3.carddeck;

import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> list =  new ArrayList<Card>(36);

    public Deck() {
        int suitLength = Suit.values.length;
        int rankLength = Rank.values.length;
        for (int i=0; i < suitLength; i++) {
            for (int j = 0; j < rankLength; j++) {
                list.add(new Card(Rank.values[j],Suit.values[i]));
            }
        }
    }

    //Перемішує колоду у випадковому порядку
    public void shuffle() {
    }
    /* * Впорядкування колоди за мастями та значеннями
    * Порядок сотрування:
    * Спочатку всі карти з мастю HEARTS, потім DIAMONDS, CLUBS, SPADES
    * для кожної масті порядок наступний: Ace,King,Queen,Jack,10,9,8,7,6
    * Наприклад
    * HEARTS Ace
    * HEARTS King
    * HEARTS Queen
    * HEARTS Jack
    * HEARTS 10
    * HEARTS 9
    * HEARTS 8
    * HEARTS 7
    * HEARTS 6
    * І так далі для DIAMONDS, CLUBS, SPADES */
    public void order() {
    }

    //Повертає true у випадку коли в колоді ще доступні карти
    public boolean hasNext() {
        if(list.size()>0)
            return true;
        else
            return false;
    }

    //"Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
    //Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть SPADES 6 потім
    //SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace
    public Card drawOne() {
        int size = list.size();
        Card card = list.get(size - 1);
        list.remove(size - 1);
        return card;
    }
}
