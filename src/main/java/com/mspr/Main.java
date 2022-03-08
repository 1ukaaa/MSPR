package com.mspr;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;
import java.util.*;

import com.agents.Agent;


public class Main {
	final static Logger logger = Logger.getAnonymousLogger();
    public static List<String> retourFichierAgents(String pathAgentTxt) {
        List<String> fichiersAgents = new ArrayList<>();
        try (BufferedReader pathAgentTxtBuffer = new BufferedReader(new FileReader(pathAgentTxt))) {
            while (pathAgentTxtBuffer.ready()) {
            String ligne = pathAgentTxtBuffer.readLine();
            fichiersAgents.add("assets/agents/" + ligne + ".txt");
            }
            pathAgentTxtBuffer.close();
            return fichiersAgents;            
            
        } catch (Exception e) {
		logger.log(Level.SEVERE, "an exception was thrown", e);
        }
        return fichiersAgents;
    }
    
  public static void main(String[] args) throws IOException {
    String pathAgentTxt = "assets/agents.txt";
    List<String> fichiersAgents = retourFichierAgents(pathAgentTxt);

      List<Agent> agents = new ArrayList<>();
      for (String fichierAgent : fichiersAgents) {
          try (BufferedReader pathAgentBuffer = new BufferedReader(new FileReader(fichierAgent))){
            List<String> fichier = new ArrayList<>();
            List<String> materielsListe = new ArrayList<>();
            while (pathAgentBuffer.ready()) {
              String ligneDuFichier = pathAgentBuffer.readLine();
              fichier.add(ligneDuFichier);
            }
            pathAgentBuffer.close();
            for (int i = 5; i < fichier.size(); i++) {
              materielsListe.add(fichier.get(i));
            }
            String nom = fichier.get(0);
            String prenom = fichier.get(1);
            String mission = fichier.get(2);
            String motDePasse = fichier.get(3);
            String pseudonyme = prenom.substring(0,1).toUpperCase() + nom.toLowerCase();
            List<String> materiels = materielsListe;
            agents.add(new Agent(nom, prenom, mission, motDePasse, pseudonyme, materiels));
          } catch (Exception e) {
        	  logger.log(Level.SEVERE, "an exception was thrown", e);
          }
      }
      GenerateurPageHtml gernerateurPageHtml = new GenerateurPageHtml();
      gernerateurPageHtml.genererIndex(agents);
      for (Agent agent : agents) {
        gernerateurPageHtml.genererAgentPage(agent);
      }
    }
  }
