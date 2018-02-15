package org.java.develop;

import org.java.develop.model.Breed;
import org.junit.Test;
import java.util.List;
import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;

public class JPAHibernateCRUDTest extends JPAHibernateTest {

   

    @Test
    public void testBreedsAll_success() {
        List<Breed> breeds = em.createNamedQuery("Breed.findAll", Breed.class).getResultList();
        assertEquals(3, breeds.size());
    }

   

}
