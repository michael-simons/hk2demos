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
                                
                addActiveDescriptor(StringWriter.class);
                addActiveDescriptor(NumberWriter.class);
                
                bindAsContract(BarService.class).in(Singleton.class);
                bindAsContract(WritingService.class).in(Singleton.class);
                
                // Read information about provided type, scope etc. from factory
                // by binding the factory as 
                addActiveFactoryDescriptor(BazServiceFactory.class);                
            }
        });
                
        final BarService barService = locator.createAndInitialize(BarService.class);
        System.out.println(barService.toString());
        
        final BazService bazService = locator.getService(BazService.class);
        System.out.println(bazService.toString());
       
        locator.getService(WritingService.class).writeSomething();
        
        locator.shutdown();
    }

}
