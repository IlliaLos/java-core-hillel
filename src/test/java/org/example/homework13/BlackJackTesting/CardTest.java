package org.example.homework13.BlackJackTesting;

import org.example.lesson14.blackjack.Card;
import org.example.lesson14.blackjack.Rank;
import org.example.lesson14.blackjack.Suit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CardTest {

    @Test
    void getSuit() {
        var card = new Card(Suit.SPADES, Rank.THREE);

        assertEquals(Suit.SPADES, card.getSuit(), "The suit of the added card should be the same as the transferred suit");
    }

    @Test
    void getRank() {
        var card = new Card(Suit.SPADES, Rank.THREE);

        assertEquals(Rank.THREE, card.getRank(), "The rank of the added card should be the same as the transferred rank");
    }

    @Test
    void testToString() {
        var card = new Card(Suit.SPADES, Rank.THREE);

        assertEquals("THREE of SPADES", card.toString(), "The result of the method should match the passed String");
    }
}