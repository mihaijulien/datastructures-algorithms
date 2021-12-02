package io.github.mihaijulien.algorithms.stack;

import io.github.mihaijulien.algorithms.stacks.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BalancedBracketsTest {

    @Test
    public void balancedBracketsShouldReturnTrue(){
        String input = "[({})]";
        assertTrue(BalancedBrackets.isBalanced(input));
    }

    @Test
    public void unbalancedBracketsShoudlReturnFalse(){
        String input = "[(";
        assertFalse(BalancedBrackets.isBalanced(input));
    }
}
