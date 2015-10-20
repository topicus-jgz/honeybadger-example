package org.honeybadger;

import org.honeybadger.core.ConfigurationSetup;
import org.honeybadger.core.Service;
import org.honeybadger.example.resource.ExampleResource;

/**
 * Created by tlhs on 19-10-15.
 */
public class ExampleService extends Service {

    protected ExampleService() throws Exception {
        super(ConfigurationSetup.HONEY);
    }

    @Override
    public void setup() {
        addPackage("org.honeybadger.example");
        addClass(ExampleResource.class);
    }

    public static void main(String[] args) throws Exception {
        new ExampleService();
    }
}
