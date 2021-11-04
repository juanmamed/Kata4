/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4.main;

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramReader;
import kata4.view.MailHistogramBuilder;

/**
 *
 * @author galde
 */
public class Kata4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nameFile = new String("email.txt");
        List<Mail> mailList = MailHistogramReader.read(nameFile);
        Histogram<String> histogram = MailHistogramBuilder.buildt(mailList);
        
        HistogramDisplay histogramdisplay = new HistogramDisplay("Histograma", histogram);
        histogramdisplay.execute();
    }
    
}
