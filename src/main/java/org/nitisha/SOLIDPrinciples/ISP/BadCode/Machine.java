package org.nitisha.SOLIDPrinciples.ISP.BadCode;

import org.nitisha.SOLIDPrinciples.ISP.BadCode.Document;

public interface Machine {

    void print(Document doc);

    void scan(Document doc);

    void copy(Document doc);
}
