package org.example.homework8;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private  boolean duplex;

    public Printer(boolean duplex, int tonerLevel) {
        this.duplex = duplex;
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = 0;

        if(tonerLevel <= -1 && tonerLevel > 100)
            tonerLevel = -1;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100 && (tonerAmount + this.tonerLevel) <= 100) {
            this.tonerLevel = this.tonerLevel + tonerAmount;
            return this.tonerLevel;
        }
        else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;

        if (this.duplex == true) {
            pagesToPrint = pagesToPrint * 2;
        }

        this.pagesPrinted = this.pagesPrinted + pagesToPrint;

        return pagesToPrint;
    }
}