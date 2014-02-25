/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charlie.bs.section3;

import charlie.advisor.BasicStrategy;
import charlie.card.Card;
import charlie.card.Hand;
import charlie.card.Hid;
import charlie.dealer.Seat;
import charlie.plugin.IAdvisor;
import charlie.util.Play;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Muroj
 */
public class Test04_A2_2 {

    IAdvisor advisor = null;

    public Test04_A2_2() {
        advisor = new BasicStrategy();
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testNine() {
        // Create a hand containing an ace.
        Hand testHand = new Hand(new Hid(Seat.YOU));
        testHand.hit(new Card(Card.ACE, Card.Suit.CLUBS));
        testHand.hit(new Card(3, Card.Suit.CLUBS));

        // What does the advisor suggest?
        Play actual = advisor.advise(testHand, new Card(2, Card.Suit.CLUBS));
        // What _should_ the advisor suggest?
        Play expected = Play.HIT;
        // Verify that the actual value equals the expected value.
        assertEquals("Fail", expected, actual);
    }

    @Test
    public void testTen() {
        // Create a hand containing an ace.
        Hand testHand = new Hand(new Hid(Seat.YOU));
        testHand.hit(new Card(Card.ACE, Card.Suit.CLUBS));
        testHand.hit(new Card(3, Card.Suit.CLUBS));

        // What does the advisor suggest?
        Play actual = advisor.advise(testHand, new Card(6, Card.Suit.CLUBS));
        // What _should_ the advisor suggest?
        Play expected = Play.DOUBLE_DOWN;
        // Verify that the actual value equals the expected value.
        assertEquals("Fail", expected, actual);
    }
}
