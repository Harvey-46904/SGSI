/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkqControlador;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LaloLauraMadeHarvey
 */
public class clsConecta {
        java.sql.Connection con;
         java.sql.Statement st;
        java.sql.ResultSet res;
        
        
public clsConecta(){
    //Constructor sera usado para conenectarse al motor
try {
	try{
		Class.forName("org.postgresql.Driver");
		System.out.println("driver Correcto");
	    }
	catch(ClassNotFoundException ex){
	System.out.println("error cargando el driver");
	}
	con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/DB_SGSI","postgres","045180" );
	} catch(SQLException ex){
	System.out.println("no hay conexion con el  motor");
 }

}
public boolean validar(String sql){
java.sql.ResultSet hoja_resultado=null;
try{
	st=con.createStatement();
	hoja_resultado=st.executeQuery(sql);
	if(hoja_resultado.next()){
	return true;
	}else{
	return false;
	}
     }catch(SQLException ex){
	System.out.println("error consultando :"+ex.toString());
	return false;
	}	
}

public void insertar(String sql){
try{
	st=con.createStatement();
	java.sql.ResultSet rs=st.executeQuery(sql);
	}catch(SQLException ex){
	System.out.println("error Insertando"+ex.toString());
}
}

public java.sql.ResultSet consulta(String sql){
try {st=con.createStatement();
return st.executeQuery(sql);
}catch (SQLException ex){
    System.out.println("error consultado: " +ex.toString());
return null;
}
}
}


