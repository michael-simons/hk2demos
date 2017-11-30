/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ac.simons.hk2demos;

import javax.inject.Inject;
import javax.inject.Singleton;
import org.glassfish.hk2.api.Factory;
import org.glassfish.hk2.api.IterableProvider;

/**
 *
 * @author Michael J. Simons, 2017-11-30
 */
@Singleton
public class BazServiceFactory implements Factory<BazService> {
    
    private final IterableProvider<SomeContract> services;

    @Inject
    public BazServiceFactory(IterableProvider<SomeContract> services) {
        this.services = services;
    }
    
    @Override
    @Singleton
    public BazService provide() {
        return new BazService(this.services);
    }

    @Override
    public void dispose(BazService instance) {
        System.out.println("Disposing bazService " + instance);
    }
}
