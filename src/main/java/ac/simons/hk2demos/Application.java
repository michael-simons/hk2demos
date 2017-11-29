/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ac.simons.hk2demos;

import javax.inject.Singleton;
import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.hk2.utilities.ServiceLocatorUtilities;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

/**
 *
 * @author Michael J. Simons, 2017-11-29
 */
public class Application {
    public static void main(String... args) {
         
        final ServiceLocator locator = ServiceLocatorUtilities.bind(new AbstractBinder() {
            @Override
            protected void configure() {
                bindFactory(FooFactory.class).to(FooService.class);
                
                addActiveDescriptor(ContractImpl1.class);
                addActiveDescriptor(ContractImpl2.class);
                
                bindAsContract(BarService.class).in(Singleton.class);
                bindAsContract(BazService.class).in(Singleton.class);
            }
        });
                
        final BarService barService = locator.createAndInitialize(BarService.class);
        System.out.println(barService.toString());
        
        final BazService bazService = locator.getService(BazService.class);
        System.out.println(bazService.toString());
    }

}
