/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ac.simons.hk2demos;

import org.jvnet.hk2.annotations.Contract;

/**
 *
 * @author Michael J. Simons, 2017-11-29
 */
@Contract
public interface Writer<T>  {
    public void write(T item);
}
