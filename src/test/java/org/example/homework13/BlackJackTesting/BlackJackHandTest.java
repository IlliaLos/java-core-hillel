package org.example.homework13.BlackJackTesting;

import org.example.lesson14.blackjack.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BlackJackHandTest {

    @Test
    @DisplayName("Is non blank string considered as non blank")
    void addCard() {
        var blackJackHand = new BlackJackHand();
        var card = new Card(Suit.CLUBS, Rank.ACE);

        blackJackHand.addCard(card);

        assertEquals(1, blackJackHand.getCards().size(), "Hand should contain 1 card after adding a single card");
        assertEquals(card, blackJackHand.getCards().getFirst(), "Added card should be the same as the card in the hand");
    }

    @Test
    void getCards() {
        var blackJackHand = new BlackJackHand();
        var card = new Card(Suit.SPADES, Rank.THREE);

        blackJackHand.addCard(card);

        assertEquals(card, blackJackHand.getCards().getFirst(), "Added card should be the same as the card in the hand");
    }

    @Test
    void getValue() {
        var firstHand = new BlackJackHand();
        firstHand.addCard(new Card(Suit.CLUBS,Rank.TWO));
        firstHand.addCard(new Card(Suit.SPADES,Rank.JACK));
        firstHand.addCard(new Card(Suit.DIAMONDS,Rank.ACE));
        firstHand.addCard(new Card(Suit.HEARTS,Rank.KING));

        assertEquals(23, firstHand.getValue(), "The number of points should match the cards and be equal to 23");

        var secondHand = new BlackJackHand();
        secondHand.addCard(new Card(Suit.DIAMONDS,Rank.QUEEN));
        secondHand.addCard(new Card(Suit.SPADES,Rank.ACE));

        assertEquals(21, secondHand.getValue(), "The number of points should match the cards and be equal to 21");

        var thirdHand = new BlackJackHand();
        thirdHand.addCard(new Card(Suit.SPADES,Rank.THREE));
        thirdHand.addCard(new Card(Suit.CLUBS,Rank.FOUR));
        thirdHand.addCard(new Card(Suit.HEARTS,Rank.FIVE));
        thirdHand.addCard(new Card(Suit.DIAMONDS,Rank.SIX));
        thirdHand.addCard(new Card(Suit.SPADES,Rank.SEVEN));

        assertEquals(25, thirdHand.getValue(), "The number of points should match the cards and be equal to 25");

        var fourthHand = new BlackJackHand();
        fourthHand.addCard(new Card(Suit.SPADES,Rank.EIGHT));
        fourthHand.addCard(new Card(Suit.CLUBS,Rank.NINE));
        fourthHand.addCard(new Card(Suit.HEARTS,Rank.TEN));

        assertEquals(27, fourthHand.getValue(), "The number of points should match the cards and be equal to 27");
    }

    @Test
    void isBusted() {
        var firstHand = new BlackJackHand();
        firstHand.addCard(new Card(Suit.CLUBS,Rank.TWO));
        firstHand.addCard(new Card(Suit.SPADES,Rank.JACK));
        firstHand.addCard(new Card(Suit.DIAMONDS,Rank.ACE));
        firstHand.addCard(new Card(Suit.HEARTS,Rank.KING));

        assertTrue(firstHand.isBusted(), "The number of points exceeds 21 and the player should be busted");

        var secondHand = new BlackJackHand();
        secondHand.addCard(new Card(Suit.CLUBS,Rank.EIGHT));
        secondHand.addCard(new Card(Suit.SPADES,Rank.ACE));

        assertFalse(secondHand.isBusted(), "The number of points does not exceed 21 and the player should not be busted");
    }

    @Test
    void isBlackJack() {
        var firstHand = new BlackJackHand();
        firstHand.addCard(new Card(Suit.SPADES,Rank.JACK));
        firstHand.addCard(new Card(Suit.DIAMONDS,Rank.ACE));

        assertTrue(firstHand.isBlackJack(), "The number of cards is 2 and the total number of points is 21 - it should be Blackjack");

        var secondHand = new BlackJackHand();
        secondHand.addCard(new Card(Suit.DIAMONDS,Rank.JACK));
        secondHand.addCard(new Card(Suit.HEARTS,Rank.TWO));
        secondHand.addCard(new Card(Suit.SPADES,Rank.NINE));

        assertFalse(secondHand.isBlackJack(), "The total number of points is 21, but the number of cards is more than 2 - it should not be BlackJack");

        var thirdHand = new BlackJackHand();
        thirdHand.addCard(new Card(Suit.DIAMONDS,Rank.QUEEN));
        thirdHand.addCard(new Card(Suit.HEARTS,Rank.EIGHT));

        assertFalse(thirdHand.isBlackJack(), "The number of cards is 2, but the total number of points is less than 21 - it should not be Blackjack");
    }

    @Test
    void testToString() {
        var blackJackHand = new BlackJackHand();
        blackJackHand.addCard(new Card(Suit.CLUBS,Rank.TWO));
        blackJackHand.addCard(new Card(Suit.SPADES,Rank.JACK));
        blackJackHand.addCard(new Card(Suit.DIAMONDS,Rank.ACE));
        blackJackHand.addCard(new Card(Suit.HEARTS,Rank.KING));

        assertTrue("[TWO of CLUBS, JACK of SPADES, ACE of DIAMONDS, KING of HEARTS]".equals(blackJackHand.toString()), "The result of the method should match the passed String");
    }
}