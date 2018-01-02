/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin.schoolsystem;

import static java.lang.Thread.sleep;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author tharindu
 */
public class Set_Date_Time {
    
    public void setCurrentDate_Time(JLabel jdate,JLabel jtime)
    {
        Thread clock=new Thread()
        {
            public void run()
            {
                for(;;)
                {
                    Calendar cal=new GregorianCalendar();
                    int month=cal.get(Calendar.MONTH)+1;
                    int year=cal.get(Calendar.YEAR);
                    int day=cal.get(Calendar.DAY_OF_MONTH);
                    jdate.setText("Date "+year+"/"+month+"/"+day);
        
                    int second=cal.get(Calendar.SECOND);
                    int minute=cal.get(Calendar.MINUTE);
                    int hour=cal.get(Calendar.HOUR_OF_DAY);
                    jtime.setText("Time "+hour+":"+minute+":"+second);
                    
                    try{
                        sleep(1000);
                    }
                    catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(null,e);
                    }
                }
            }
        };
        clock.start();
    }
    
    
}
