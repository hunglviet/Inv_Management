/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inv_management;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author lvhung
 */
@Entity
@Table(name = "APPMENU", catalog = "", schema = "LVHUNG")
@NamedQueries({
    @NamedQuery(name = "Appmenu.findAll", query = "SELECT a FROM Appmenu a"),
    @NamedQuery(name = "Appmenu.findById", query = "SELECT a FROM Appmenu a WHERE a.id = :id"),
    @NamedQuery(name = "Appmenu.findByMenuitem", query = "SELECT a FROM Appmenu a WHERE a.menuitem = :menuitem"),
    @NamedQuery(name = "Appmenu.findBySubmenuitem", query = "SELECT a FROM Appmenu a WHERE a.submenuitem = :submenuitem"),
    @NamedQuery(name = "Appmenu.findByDescription", query = "SELECT a FROM Appmenu a WHERE a.description = :description")})
public class Appmenu implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Column(name = "MENUITEM")
    private String menuitem;
    @Column(name = "SUBMENUITEM")
    private String submenuitem;
    @Column(name = "DESCRIPTION")
    private String description;

    public Appmenu() {
    }

    public Appmenu(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        String oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getMenuitem() {
        return menuitem;
    }

    public void setMenuitem(String menuitem) {
        String oldMenuitem = this.menuitem;
        this.menuitem = menuitem;
        changeSupport.firePropertyChange("menuitem", oldMenuitem, menuitem);
    }

    public String getSubmenuitem() {
        return submenuitem;
    }

    public void setSubmenuitem(String submenuitem) {
        String oldSubmenuitem = this.submenuitem;
        this.submenuitem = submenuitem;
        changeSupport.firePropertyChange("submenuitem", oldSubmenuitem, submenuitem);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        String oldDescription = this.description;
        this.description = description;
        changeSupport.firePropertyChange("description", oldDescription, description);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Appmenu)) {
            return false;
        }
        Appmenu other = (Appmenu) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inv_management.Appmenu[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
