package br.com.fiap;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class PropertiesConfiguratorWrapper {

	public PropertiesConfiguratorWrapper() throws ConfigurationException {
		PropertiesConfiguration conf = new PropertiesConfiguration("src/main/java/fiap.properties");
		System.out.println("Telefone: " + conf.getString("telefone"));
	}
	
	 public static void main( String[] args ) throws IllegalAccessException, InvocationTargetException, ConfigurationException{
	    	new PropertiesConfiguratorWrapper();
	    }
}
