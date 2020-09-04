package tests;

import main.BinaryChop;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestBinaryChop {

    BinaryChop binaryChop = new BinaryChop();

    @Test
    public void searchTest(){

        Assert.assertEquals(-1, binaryChop.chop(3, Arrays.asList()));
        Assert.assertEquals(-1, binaryChop.chop(3, Arrays.asList(1)));
        Assert.assertEquals(0,  binaryChop.chop(1, Arrays.asList(1)));
        Assert.assertEquals(0,  binaryChop.chop(1, Arrays.asList(1, 3, 5)));
        Assert.assertEquals(1,  binaryChop.chop(3, Arrays.asList(1, 3, 5)));
        Assert.assertEquals(2,  binaryChop.chop(5, Arrays.asList(1, 3, 5)));
        Assert.assertEquals(-1, binaryChop.chop(0, Arrays.asList(1, 3, 5)));
        Assert.assertEquals(-1, binaryChop.chop(2, Arrays.asList(1, 3, 5)));
        Assert.assertEquals(-1, binaryChop.chop(4, Arrays.asList(1, 3, 5)));
        Assert.assertEquals(-1, binaryChop.chop(6, Arrays.asList(1, 3, 5)));
        Assert.assertEquals(0,  binaryChop.chop(1, Arrays.asList(1, 3, 5, 7)));
        Assert.assertEquals(1,  binaryChop.chop(3, Arrays.asList(1, 3, 5, 7)));
        Assert.assertEquals(2,  binaryChop.chop(5, Arrays.asList(1, 3, 5, 7)));
        Assert.assertEquals(3,  binaryChop.chop(7, Arrays.asList(1, 3, 5, 7)));
        Assert.assertEquals(-1, binaryChop.chop(0, Arrays.asList(1, 3, 5, 7)));
        Assert.assertEquals(-1, binaryChop.chop(2, Arrays.asList(1, 3, 5, 7)));
        Assert.assertEquals(-1, binaryChop.chop(4, Arrays.asList(1, 3, 5, 7)));
        Assert.assertEquals(-1, binaryChop.chop(6, Arrays.asList(1, 3, 5, 7)));
        Assert.assertEquals(-1, binaryChop.chop(8, Arrays.asList(1, 3, 5, 7)));
    }
}
