package com.tasks3.carddeck;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> list;
    private int size;

    public Deck() {
        int suitLength = Suit.values.length;
        int rankLength = Rank.values.length;
        size = suitLength * rankLength;
        list = new ArrayList<Card>(size);
        for (int i=0; i < suitLength; i++) {
            for (int j = 0; j < rankLength; j++) {
                list.add(new Card(Rank.values[j],Suit.values[i]));
            }
        }
    }

    //Перемішує колоду у випадковому порядку
    public void shuffle() {
        Random rand = new Random();
        int index;
        Card tempCard;
        for (int i = 0; i < size -1; i ++) {
            index = rand.nextInt(size-1);
            if (i != index){
                tempCard = list.get(i);
                list.set(i,list.get(index));
                list.set(index,tempCard);
            }
        }
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
        ArrayList<Card> tempList = new ArrayList<Card>(size);

        int rankLenght = Rank.values.length;
        int suitLenght = Suit.values.length;

        for (int i = 0; i < size; i++) {
            tempList.add(new Card(new Rank("Ass"), new Suit("HEARTS")));
        }
        int index;
        for (int i = 0; i < size; i++) {
            index = getSuitIndex(list.get(i)) * rankLenght + getRankIndex(list.get(i));
            tempList.set(index, list.get(i));
        }
        for (int i = 0; i < size; i++) {
            list.set(i,tempList.get(i));
        }
    }

    private int getRankIndex(Card card){
        int index = 0;
        String name = card.getRank().getName();
        for (int i = 0; i < Rank.values.length; i++) {
            if (name.equals(Rank.values[i].getName())){
                index = i;
                break;
            }
        }
        return index;
    }

    private int getSuitIndex(Card card){
        int index = 0;
        for (int i = 0; i < Suit.values.length; i++) {
            if (card.getSuit().getName().equals(Suit.values[i].getName())){
                index = i;
                break;
            }
        }
        return index;
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
