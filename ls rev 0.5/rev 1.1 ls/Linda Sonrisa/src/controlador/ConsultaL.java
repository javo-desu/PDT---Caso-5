/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author JAVO-KUN
 */
import ConexionSql.Conexion;
 import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultaL 
{
	Conexion iniciar = new Conexion();
	
	public boolean buscarClave( String usuario , String clave )
	{
		ResultSet resultado = null;
		boolean encontrado = false;
		
		iniciar.getConexion();
		
		iniciar.ejecutarConsulta( "SELECT clave , usuario FROM acceso WHERE usuario = '" + usuario + "' AND clave = '"+ clave + "' ");
		
		try 
		{
			if( iniciar.getResultado().next() ){
				encontrado = true;
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}

		iniciar.cerrarConexion();
		
		return encontrado;
	}
	
	public String[] rellenarComboBoxUsuario( )
	{
		String arreglo[] = new String [ 20 ];
		int contador = 0;
		
		iniciar.getConexion();
		
		iniciar.ejecutarConsulta( "SELECT * FROM aregistraraccesorio ");
		
		try
		{
			while( iniciar.getResultado().next() )
			{
				for (int i = 1; i < 11; i++) {
					arreglo [ contador ] = iniciar.getResultado().getString( i );
					++contador;
				}
			}
		}
		catch( SQLException e )
		{
			e.printStackTrace();
		}
		
		return arreglo;
	}
}


