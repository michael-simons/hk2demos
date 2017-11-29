/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ac.simons.hk2demos;

import org.glassfish.hk2.api.Factory;

/**
 *
 * @author Michael J. Simons, 2017-11-29
 */
public class FooFactory implements Factory<FooService> {

    @Override
    public FooService provide() {
        return new FooService();
    }

    @Override
    public void dispose(FooService instance) {        
    }
}
