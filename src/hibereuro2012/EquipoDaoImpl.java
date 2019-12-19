/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibereuro2012;

import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author meschoyez
 */
public class EquipoDaoImpl implements EquipoDao {

    private final SessionFactory sessionFactory;
    
    public EquipoDaoImpl (SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    public void ListarEquipos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void BuscarPorPais(String pais) {
        // sessionFactory mantiene la referencia a la sesion establecida
        //   contra la BD (paquete Hibernate)
        // Session es la interface entre Java y Hibernate (paquete Hibernate)
        Session session = sessionFactory.openSession();
        
        // CriteriaBuilder permite crear las consultas (paquete Persistence de Java)
        CriteriaBuilder builder = session.getCriteriaBuilder();
        // CriteriaQuery es una interface para realizar consultas
        // donde el resultado es del tipo indicado cuando se realiza
        // el createQuery al CriteriaBuilder (paquete Persistence de Java)
        CriteriaQuery<Equipo> query = builder.createQuery(Equipo.class);
        // query.from se utiliza para configurar la clase base de la consulta
        Root<Equipo> root = query.from(Equipo.class);
        // query.select se utiliza para configurar la clase especifica de la respuesta
        query.select(root);
        // query.where restringe los datos segun se solicite
        //  -> builder.equal hace match por el igual
        query.where(builder.equal(root.get("pais"), pais));
        // builder.like hace match segun la expresion indicada
//        query.where(builder.like(root.get("jugador"), "%and%"));
        System.out.println("Consulta multidato");
        
        List<Equipo> equipos = session.createQuery(query).list();
        for (Equipo equipo : equipos) {
            System.out.println(equipo);
        }

        System.out.println("");
        System.out.println("Consulta dato unico");
        
        query.where(builder.equal(root.get("pais"), "Poland"));
        // uniqueResult puede utilizarse cuando el resultado esperado es
        // unico. Si no hay respuesta, se obtiene un null
        System.out.println( session.createQuery(query).uniqueResult() );

        // Cierra la conexion con la BD
        session.close();
                
    }

    
    
}





