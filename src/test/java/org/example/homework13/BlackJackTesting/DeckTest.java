package org.example.homework13.BlackJackTesting;

import org.example.lesson14.blackjack.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    @Test
    void drawCard() {
        var deck = new Deck();
        Card card = deck.drawCard();

        assertEquals(51, deck.size(), "The deck should contain 51 cards after drawing a single card");
        assertEquals(Rank.TWO, card.getRank(), "Rank of the drawing card should be the same as the transferred rank");
        assertEquals(Suit.CLUBS, card.getSuit(), "Suit of the drawing card should be the same as the transferred suit");

        for (int i = deck.size(); i > 0; i--) {
            assertNotEquals(card, deck.drawCard(), "The first card should be missing from the deck");
        }
    }

    @Test
    void testShuffle() {
        var deck = new Deck();
        List<Card> originalCards = new ArrayList<>(deck.getCards());
        deck.shuffle();
        List<Card> shuffledOrder = deck.getCards();
        assertEquals(originalCards.size(), shuffledOrder.size(),
                "The size of the deck should remain unchanged");
        assertNotEquals(originalCards, shuffledOrder,
                "The deck should be shuffled and not in original order");
        assertTrue(shuffledOrder.containsAll(originalCards) && originalCards.containsAll(shuffledOrder),
                "The shuffled deck should contain all original cards");
    }

    @Test
    void size() {
        var deck = new Deck();

        assertEquals(52, deck.size(), "The new deck should contain 52 cards");

        Card card = deck.drawCard();

        assertEquals(51, deck.size(), "The deck should contain 51 cards after missing a single card");
    }
}