package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest {
    @Test
    public void position() {
        Cell start = Cell.F8;
        BishopBlack bishop = new BishopBlack(start);
        assertThat(bishop.position(), is(start));
    }

    @Test
    public void way() throws ImpossibleMoveException {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        Cell[] way = bishop.way(Cell.G5);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(way, is(expected));
    }

    @Test
    public void copy() {
        Cell next = Cell.E7;
        BishopBlack bishop = new BishopBlack(Cell.F8);
        assertThat(bishop.copy(next).position(), is(next));
    }
}