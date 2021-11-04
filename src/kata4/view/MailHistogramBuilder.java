/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4.view;

import kata4.model.Histogram;
import java.util.List;
import kata4.model.Mail;

/**
 *
 * @author galde
 */
public class MailHistogramBuilder {
    public static Histogram<String> buildt(List<Mail> mailList){
        Histogram<String> histogram = new Histogram<>();
        
        for(Mail mail :mailList){
            histogram.increment(mail.getDomain());
        }
        return histogram;
    }
}
