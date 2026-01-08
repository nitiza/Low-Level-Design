package org.nitisha.SOLIDPrinciples.ISP.BadCode;

import org.nitisha.SOLIDPrinciples.ISP.BadCode.Document;
import org.nitisha.SOLIDPrinciples.ISP.BadCode.Machine;

public class MultiPurposeMachine implements Machine {
    @Override
    public void print(Document doc) {

    }

    @Override
    public void scan(Document doc) {

    }

    @Override
    public void copy(Document doc) {

    }
}
