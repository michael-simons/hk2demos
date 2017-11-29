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
public class BarService {
    private final FooService fooService;

    @Inject
    public BarService(FooService fooService) {
        this.fooService = fooService;
    }

    @Override
    public String toString() {
        return "BarService{" + "fooService=" + fooService + '}';
    }
}
