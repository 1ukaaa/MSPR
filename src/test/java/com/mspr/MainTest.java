package com.mspr;
import static org.javalite.test.jspec.JSpec.*;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MainTest {
    
    public MainTest() {
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
     * Test of retourFichierAgents method, of class Main.
     */
    @Test
    public void testRetourFichierAgents() {
        String pathAgentTxt = "assets/agents.txt";
        List<String> result = Main.retourFichierAgents(pathAgentTxt);
        $(result.size()).shouldBeEqual(8);
        
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
        
    }
    
}
