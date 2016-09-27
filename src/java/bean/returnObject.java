/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author vic
 */
@ManagedBean
@SessionScoped
public class returnObject implements Serializable {

    @PersistenceUnit
    EntityManagerFactory emf;

    public returnObject() {
        //CoopProspect q = (CoopProspect) emf.createEntityManager().createQuery("SELECT c FROM CoopProspect c").getResultList().get(0);
        //FacesContext context = FacesContext.getCurrentInstance();
        //context.addMessage(null, new FacesMessage("Successful", "New data has been created."));
    }

}
