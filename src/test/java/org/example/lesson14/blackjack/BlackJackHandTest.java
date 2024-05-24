package org.example.lesson14.blackjack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BlackJackHandTest {

    @Test
    void addCard() {
        var blackJackHand = new BlackJackHand();
        var card = new Card(Suit.CLUBS, Rank.ACE);

        blackJackHand.addCard(card);

        assertEquals(1, blackJackHand.getCards().size(), "Hand should contain 1 card after adding a single card");
        assertEquals(card, blackJackHand.getCards().getFirst(), "Added card should be the same as the card in the hand");
    }
}