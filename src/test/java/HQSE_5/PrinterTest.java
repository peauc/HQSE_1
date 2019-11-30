package HQSE_5;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    @Rule
    public SystemOutResource sysOut = new SystemOutResource();

    @Test
    public void testPrinterName() {
        Printer printer = new Printer();
        printer.printName("toto");
        assertEquals("[toto] ", sysOut.asString());
    }

    @Test
    public void testPrinterMessage() {
        Printer printer = new Printer();
        printer.printMessage("Hello World !");
        assertEquals("Hello World !\r\n", sysOut.asString());
    }
}
