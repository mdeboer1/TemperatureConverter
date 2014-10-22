/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package temperatureconverter;

import java.text.DecimalFormat;

/**
 *
 * @author mdeboer1
 */
public class TemperatureConverterService {
    
    public String getCelciusFromFahrenheit(String fahrenheit) throws NumberFormatException{
        double f = Double.valueOf(fahrenheit);
        double c = (f - 32) * 5/9;
        DecimalFormat df = new DecimalFormat("#0.00");
        return df.format(c);
    } 
    
    public String getFahrenheitFromCelcius (String fahrenheit) throws NumberFormatException {
        double f = Double.valueOf(fahrenheit);
        double temp = (f * 1.8) + 32;
        DecimalFormat df= new DecimalFormat("#0.00");
        return df.format(temp);
    }
}
