package org.nitisha.SOLIDPrinciples.ISP.GoodCode;

import org.nitisha.SOLIDPrinciples.ISP.BadCode.Document;

public class MultiPurposeMachine implements Printer, Scanner, Copier {
    @Override
    public void copy(Document doc) {

    }

    @Override
    public void print(Document doc) {

    }

    @Override
    public void scan(Document doc) {

    }
}
