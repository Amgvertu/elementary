package ru.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        assertThat(dist).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when52to151then10dot049() {
        double expected = 10.049;
        Point a = new Point(5, 2);
        Point b = new Point(15, 1);
        double dist = a.distance(b);
        assertThat(dist).isEqualTo(expected, withPrecision(0.001));
    }

    @Test
    void when17to23then4dot12() {
        double expected = 4.12;
        Point a = new Point(1, 7);
        Point b = new Point(2, 3);
        double dist = a.distance(b);
        assertThat(dist).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when173to233then4dot12() {
        double expected = 4.12;
        Point a = new Point(1, 7, 3);
        Point b = new Point(2, 3, 3);
        double dist = a.distance3d(b);
        assertThat(dist).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when173to239then7dot28() {
        double expected = 7.28;
        Point a = new Point(1, 7, 3);
        Point b = new Point(2, 3, 9);
        double dist = a.distance3d(b);
        assertThat(dist).isEqualTo(expected, withPrecision(0.01));
    }

}
