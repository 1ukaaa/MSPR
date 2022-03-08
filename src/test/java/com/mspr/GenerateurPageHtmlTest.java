package com.mspr;
import static org.javalite.test.jspec.JSpec.*;
import com.agents.Agent;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GenerateurPageHtmlTest {
    
    public GenerateurPageHtmlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of genererAgentPage method, of class generateurPageHtml.
     */
    @Test
    public void testGenererAgentPage() {
        List<String> materiels = new ArrayList<String>();
        materiels.add("Mousqueton");
        Agent a = new Agent("Thierry", "Moreau", "Plombier", "Motdepasse","Tmoreau", materiels);
        GenerateurPageHtml instance = new GenerateurPageHtml();
        instance.genererAgentPage(a);
        
    }

    /**
     * Test of retourListeChecked method, of class generateurPageHtml.
     */
    @Test
    public void testRetourListeChecked() {
        List<String> materiels = new ArrayList<String>();
        materiels.add("Mousqueton");
        Agent a = new Agent("Thierry", "Moreau", "Plombier", "Motdepasse","Tmoreau", materiels);
        GenerateurPageHtml instance = new GenerateurPageHtml();
        List<String> result = instance.retourListeChecked(a);
        a(result.size()).shouldBeEqual(12);
        
    }

    /**
     * Test of genererIndex method, of class generateurPageHtml.
     */
    @Test
    public void testGenererIndex() throws Exception {
        List<Agent> Agent = new ArrayList<Agent>();
        Agent a = new Agent("Thierry", "Moreau", "Plombier", "Motdepasse","Tmoreau", null);
        Agent.add(a);
        GenerateurPageHtml instance = new GenerateurPageHtml();
        instance.genererIndex(Agent);
        
    }
    
}
