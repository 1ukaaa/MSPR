package com.agents;
import static org.javalite.test.jspec.JSpec.*;
import org.junit.Test;

public class AgentTest {

    @Test
  public void testGetNom() {
    String setNom = "Moreau";
    Agent a = new Agent(setNom, "Thierry", "Electricien", "Motdepasse","Tmoreau", null);
    String getNom = a.getNom();
   the(setNom).shouldBeEqual(getNom);
  }
  
   @Test
  public void testGetPrenom() {
    String setPrenom = "Thierry";
    Agent a = new Agent("Moreau", setPrenom, "Electricien", "Motdepasse","Tmoreau", null);
    String getPrenom = a.getPrenom();
    the(setPrenom).shouldEqual(getPrenom);
  }

  @Test
  public void testGetPassword() {
    String setMotDePasse = "Motdepasse";
    Agent a = new Agent("Thierry", "Moreau", "Electricien", setMotDePasse,"Tmoreau", null);
    String getMotDePasse = a.getMotDePasse();
    the(setMotDePasse).shouldEqual(getMotDePasse);
  }

 
   @Test
  public void testGetMission() {
    String setMission = "";
    Agent a = new Agent("Thierry", "Moreau", setMission, "Motdepasse","Tmoreau", null);
    String getMission = a.getMission();
    the(setMission).shouldEqual(getMission);
  }
  @Test
  public void testGetPseudonyme() {
    String setPseudonyme = "Tmoreau";
    Agent a = new Agent("Thierry", "Moreau", "Electricien", "Motdepasse",setPseudonyme, null);
    String getPseudonyme = a.getPseudonyme();
    a(setPseudonyme).shouldEqual(getPseudonyme);
  }
  // @Test
  // public void testSetItems() {

  // }

  @Test
  public void testSetMission() {
    Agent a = new Agent("Thierry", "Moreau", "Plombier", "Motdepasse","Tmoreau", null);
    String initMission = "Electricien";
    a.setMission(initMission);
    String getMission = a.getMission();
    the(initMission).shouldNotBeEqual("Barman");
    the(initMission).shouldEqual(getMission);
  }

  @Test
  public void testSetPrenom() {
    Agent a = new Agent("Thierry", "Moreau", "Plombier", "Motdepasse","Tmoreau", null);
    String initPrenom = "Thierry";
    a.setPrenom(initPrenom);
    String getPrenom = a.getPrenom();
    the(initPrenom).shouldNotBeEqual("Maurice");
    the(initPrenom).shouldBeEqual(getPrenom);
  }

  @Test
  public void testSetMotDePasse() {
     Agent a = new Agent("Thierry", "Moreau", "Plombier", "Motdepasse","Tmoreau", null);
    String initMotDePasse = "Motdepasse";
    a.setMotDePasse(initMotDePasse);
    String getMotDePasse = a.getMotDePasse();
    the(initMotDePasse).shouldNotBeEqual("superSecretPassword");
    the(initMotDePasse).shouldBeEqual(getMotDePasse);
  }

  @Test
  public void testSetNom() {
    Agent a = new Agent("Thierry", "Moreau", "Plombier", "Motdepasse","Tmoreau", null);
    String initNom = "Moreau";
    a.setNom(initNom);
    String getNom = a.getNom();
    the(initNom).shouldNotBeEqual("PasMoreau");
    the(initNom).shouldEqual(getNom);
  }
  @Test
  public void testSetPseudonyme() {
    Agent a = new Agent("Thierry", "Moreau", "Plombier", "Motdepasse","Tmoreau", null);
    String initPseudonyme = "Tmoreau";
    a.setPseudonyme(initPseudonyme);
    String getPseudonyme = a.getPseudonyme();
    the(initPseudonyme).shouldNotBeEqual("PasTmoreau");
    the(initPseudonyme).shouldEqual(getPseudonyme);
  }
}
