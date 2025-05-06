package ru.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


import static org.junit.jupiter.api.Assertions.*;

class MaxTest {
    @Test
    void whenMax2To5Then5() {
        int first = 2;
        int second = 5;
        int result = Max.max(first, second);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax12To5to7Then12() {
        int first = 12;
        int second = 5;
        int third = 7;
        int result = Max.max(first, second, third);
        int expected = 12;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To14to7to9Then14() {
        int first = 3;
        int second = 14;
        int third = 7;
        int fourth = 9;
        int result = Max.max(first, second, third, fourth);
        int expected = 14;
        assertThat(result).isEqualTo(expected);
    }
}
