package br.com.fiap;

import java.beans.IntrospectionException;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.betwixt.io.BeanWriter;
import org.xml.sax.SAXException;

import br.com.fiap.vo.ColaboradorVO;
import br.com.fiap.vo.EmpresaVO;

/**
 * Hello world!
 *
 */
public class BeanUtilsWrapper 
{
	
	public BeanUtilsWrapper() throws IllegalAccessException, InvocationTargetException, IOException, SAXException, IntrospectionException {

		EmpresaVO empresaVO = new EmpresaVO();
		empresaVO.setCodigo("E01");
		empresaVO.setNome("FIAP");
		
		ColaboradorVO colaboradorVO = new ColaboradorVO();
		colaboradorVO.setCodigo("C01");
		colaboradorVO.setNome("Rodrigo Souza");
		colaboradorVO.setEmpresaVO(empresaVO);
	
		ColaboradorVO colaboradorVO2 = new ColaboradorVO();
		BeanUtils.copyProperties(colaboradorVO2, colaboradorVO);
		
		StringWriter sw = new StringWriter();
		BeanWriter bw = new BeanWriter(sw);
		bw.enablePrettyPrint();
		bw.write("Colaborador", colaboradorVO);
		System.out.println(sw.toString());
		
	}
	
    public static void main( String[] args ) throws IllegalAccessException, InvocationTargetException, IOException, SAXException, IntrospectionException
    {
    	new BeanUtilsWrapper();
    }
}
