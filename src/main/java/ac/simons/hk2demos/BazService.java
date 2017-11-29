/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ac.simons.hk2demos;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.inject.Inject;
import org.glassfish.hk2.api.IterableProvider;
import org.jvnet.hk2.annotations.Service;

/**
 *
 * @author Michael J. Simons, 2017-11-29
 */
public class BazService {
    private final IterableProvider<SomeContract> services;

    @Inject
    public BazService(IterableProvider<SomeContract> services) {
        this.services = services;
    }

    @Override
    public String toString() {
        final StringBuilder rv = new StringBuilder("BazService{" + "services=" + services + '}');
        services.forEach(service -> rv.append(service.getClass() + ": " + service.toString()));
                return rv.toString();
    }
}
