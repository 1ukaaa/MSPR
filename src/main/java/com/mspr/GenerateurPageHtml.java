package com.mspr;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import com.agents.Agent;
import java.util.ArrayList;
import java.util.logging.*;

public class GenerateurPageHtml { 
	final static Logger logger = Logger.getAnonymousLogger();
    public static final String TR = "</tr>";
    public static final String TD = "</td>";
    public void genererAgentPage(Agent agent) {
        String pathPageAgent = "html/pages/" + agent.getPseudonyme() + ".html";
        try (FileWriter ecrire = new FileWriter(pathPageAgent)) {
	    ecrire.write("<meta charset=\"UTF-8\">");
            ecrire.write("<link rel=\"stylesheet\" href=\"../style.css\">");
            ecrire.write("<style>table {width: 20% !important; }</style>");
            ecrire.write("<table>\n" + "<tr>" + "<th scope=\"row\">Nom :</th>" + "<td>" + agent.getNom() + TD + TR);
            ecrire.write("<tr>" + "<th scope=\"row\">Prénom :</th>" + "<td>" + agent.getPrenom() + TD + TR);
            ecrire.write("<tr>" + "<th scope=\"row\">Mission :</th>" + "<td>" + agent.getMission() + TD + TR);
            ecrire.write("</table>");
            ecrire.write("<div style=\"text-align: right;\"><img src='images/" + agent.getPseudonyme().toLowerCase() + ".png' style=\"width: 100%;max-width: 400px;height: auto;\"></div>");
            List<String> genererListeChecked = retourListeChecked(agent);
            for (int i = 0; i < genererListeChecked.size(); i++) {
                ecrire.write(genererListeChecked.get(i));
            }
            ecrire.close();
          } catch (Exception e) {
        	  logger.log(Level.SEVERE, "an exception was thrown", e);
          }
    }
    public List<String> retourListeChecked(Agent agent) {
        List<String> ecrire = new ArrayList<>();
        try (BufferedReader buffer = new BufferedReader(new FileReader("assets/liste.txt"))) {
            ecrire.add("<div style=\"  margin: 0 auto; width: 200px;\">");
                while (buffer.ready()) {               
                  String line = buffer.readLine();
                  String[] items = line.split("\t");
                  String value = (agent.getMateriels().contains(items[0])) ? "checked" : "";
                  ecrire.add("<div class='form-check'> " + "<input class='form-check-input' type='checkbox' id='" + items[0] + "' name='" + items[0] + "' " + value + " disabled>" + "<label class='form-check-label' for='" + items[0] + "'>" + items[1] + "</label>" + "</div>");
            }
                ecrire.add("</div>");
            buffer.close();
            } catch (Exception e) {
            	logger.log(Level.SEVERE, "an exception was thrown", e);
            }
        return ecrire;
    }

    public void genererIndex(List<Agent> agents){
        String pathIndex = "html/index.html" ;
        try (FileWriter ecrire = new FileWriter(pathIndex)) {
            ecrire.write("<link rel=\"stylesheet\" href=\"style.css\">");
            ecrire.write("<table>\n" + "<tr>" + "<th scope=\"col\">Pseudonyme</th>" + "<th scope=\"col\">Page</th>" + TR);
            for (Agent agent : agents) {
                ecrire.write("<tr>" + "<th scope=\"row\">" + agent.getPseudonyme() + "</th>" + "<td>" + "<a href=\"pages/" + agent.getPseudonyme() + ".html" + "\" role=\"button\">Lien</a>" + TD);
            }
            ecrire.write("</table>");
            ecrire.close();
        } catch (Exception e) {
        	logger.log(Level.SEVERE, "an exception was thrown", e);
        }
        
    }
}

