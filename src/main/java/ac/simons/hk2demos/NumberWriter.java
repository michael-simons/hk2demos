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
public class NumberWriter implements Writer<Number> {

    @Override
    public void write(Number item) {
        System.out.println("That is a number: " + item);
    }

}
