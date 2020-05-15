package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MachineTest {
    @Test
    public void whenEquals() {
        Machine machine = new Machine();
        int[] expected = {};
        int[] rsl = machine.change(100, 100);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when50by35() {
        Machine machine = new Machine();
        int[] expected = {10, 5};
        int[] rsl = machine.change(50, 35);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when153by35() {
        Machine machine = new Machine();
        int[] expected = {10,10,10,10,10,10,10,10,10,10,10, 5, 2, 1};
        int[] rsl = machine.change(153, 35);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when29by1() {
        Machine machine = new Machine();
        int[] expected = {10,10, 5, 2, 1};
        int[] rsl = machine.change(29, 1);
        assertThat(rsl, is(expected));
    }
}