/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ac.simons.hk2demos;

import javax.inject.Inject;

/**
 *
 * @author Michael J. Simons, 2017-11-29
 */
public class WritingService {
    private final Writer<Number> numberWriter;
    private final Writer<String> stringWriter;

    @Inject
    public WritingService(Writer<Number> numberWriter, Writer<String> stringWriter) {
        this.numberWriter = numberWriter;
        this.stringWriter = stringWriter;
    }

    public void writeSomething() {
        numberWriter.write(23.42);
        stringWriter.write("Bazbar");
    }
        
}
