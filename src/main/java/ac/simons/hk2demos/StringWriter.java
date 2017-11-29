/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ac.simons.hk2demos;

/**
 *
 * @author Michael J. Simons, 2017-11-29
 */
public class StringWriter implements Writer<String> {
    @Override
    public void write(String item) {
        System.out.println(item + " seems to be a string...");
    }
}
