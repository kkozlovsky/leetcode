package ru.kerporation;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void generateParenthesis() {
        final Solution solution = new Solution();
        assertEquals(List.of("()"), solution.generateParenthesis(1));
        assertEquals(List.of("(())", "()()"), solution.generateParenthesis(2));
        assertEquals(List.of("((()))", "(()())", "(())()", "()(())", "()()()"), solution.generateParenthesis(3));
        assertEquals(List.of("(((())))", "((()()))", "((())())", "((()))()", "(()(()))", "(()()())", "(()())()", "(())(())", "(())()()", "()((()))", "()(()())", "()(())()", "()()(())", "()()()()"), solution.generateParenthesis(4));
    }
}